import React, { useState, useEffect } from 'react'
import {BrowserRouter as Router, Route } from "react-router-dom"
import Employees from './Employees.js'
const Stomp = require('stompjs');
var client = Stomp.client("ws://localhost:8080/employees-socket/websocket");


// Follow the file structure of the example - that will show you whats what


export default function Dashboard() {
    const [employees, setEmployees] = useState();

    useEffect(() => {
        fetch("http://localhost:8080/employees")
        .then(res => res.json())
        .then(resTwo => resTwo._embedded.employees)
        .then(emps => setEmployees( emps ))
        .catch(err => console.error);
    }, [])

    client.connect({},function(){
        client.subscribe('/employees-socket', function () {
            // showMessage(JSON.parse(message.body));
            console.log("hshshs")
        });

    });


    // useEffect(() => {
    //     stompClient.register([
    //         {route: '/employees-websocket', callback: updateClientScreen},
    //     ]);
    // }, [])

    function updateClientScreen(){
        console.log("websocket event!");
        
    }


return (
    <>
  <Router>
        <h1>HomePage</h1> 
     <Route exact path="/employees" render={() => <Employees employees={employees}  /> } />

  </Router>

  </>
     )

}
