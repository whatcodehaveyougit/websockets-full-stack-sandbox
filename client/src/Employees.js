import React from 'react'

export default function Employees(props){

    return (
        <>
        <h1>Employees</h1>
        { props.employees ? props.employees.map(employee => 
            <li key={employee.name}>{ employee.name}</li>
        ) : "Nothing"}
        </>
    )
}
