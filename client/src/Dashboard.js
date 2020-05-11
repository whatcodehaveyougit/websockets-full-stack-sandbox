import React, { useState, useEffect } from 'react'
import {BrowserRouter as Router, Route } from "react-router-dom"
import Employees from './Employees.js'

export default function Dashboard() {
    const [employees, setEmployees] = useState();

    useEffect(() => {
        fetch("http://localhost:8080/employees/")
        .then(res => res.json())
        .then(resTwo => resTwo._embedded.employees)
        .then(emps => setEmployees( emps ))
        .catch(err => console.error);
    }, [])


return (
    <>
  <Router>
        <h1>HomePage</h1> 
     <Route exact path="/employees" render={() => <Employees employees={employees}  /> } />

  </Router>

  </>
     )

}
