import React, { useState, useEffect } from 'react'

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
        { employees ? employees.map(employee => 
            <li>{ employee.name}</li>
        ) : "Nothing"}
        </>
     )

}
