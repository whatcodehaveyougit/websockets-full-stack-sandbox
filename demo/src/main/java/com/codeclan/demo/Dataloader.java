package com.codeclan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    EmployeeRepo employeeRepo;

    public Dataloader(){}

    @Override
    public void run(ApplicationArguments args){

        Employee employee1 = new Employee("Sigurd");
        employeeRepo.save(employee1);

        Employee employee2 = new Employee("Javck");
        employeeRepo.save(employee2);
    }
}
