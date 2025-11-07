//package com.napier.devops;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AppIntegrationTest
//{
//    static App app;
//
//    @BeforeAll
//    static void init()
//    {
//        app = new App();
//        app.connect("db:3306", 30000);
//
//    }
//
//    @Test
//    void testGetEmployee()
//    {
//        Employee emp = app.getEmployee(255530);
//        assertEquals(emp.emp_no, 255530);
//        assertEquals(emp.first_name, "Ronghao");
//        assertEquals(emp.last_name, "Garigliano");
//    }
//
//    @Test
//    void testGetNonExistentEmployee() {
//        Employee emp = app.getEmployee(999999);
//        assertNull(emp); // Employee does not exist
//    }
//
//    @Test
//    void testGetDepartment() {
//        Department dept = app.getDepartment("Development");
//        assertNotNull(dept);
//        assertEquals("Development", dept.dept_name);
//    }
//
//    @Test
//    void testGetNonExistentDepartment() {
//        Department dept = app.getDepartment("NonExistentDept");
//        assertNull(dept);
//    }
//
//    @Test
//    void testGetSalariesByDepartment() {
//        Department dept = app.getDepartment("Development");
//        ArrayList<Employee> employees = app.getSalariesByDepartment(dept);
//        assertNotNull(employees);
//        assertTrue(employees.size() > 0); // Assume Development has employees
//    }
//
//    @Test
//    void testGetAllSalaries() {
//        ArrayList<Employee> allEmployees = app.getAllSalaries();
//        assertNotNull(allEmployees);
//        assertTrue(allEmployees.size() > 0); // There should be employees in DB
//    }
//
//}