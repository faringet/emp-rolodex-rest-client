package org.mikhaildavydov.spring.rest;

import org.mikhaildavydov.spring.rest.configuration.MyConfig;
import org.mikhaildavydov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        Вывод всех сотрудников
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Вывод работника по ID
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        Внесение сотрудника нового/обновление старого
//        Employee emp = new Employee("test", "test", "test", 1200);
//        emp.setId(14); // обновление уже внесенного сотрудника по ID
//        communication.saveEmployee(emp);

//        Удаление по ID
//        communication.deleteEmployee(14);


    }
}
