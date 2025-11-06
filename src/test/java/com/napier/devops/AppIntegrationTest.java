package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {
    static App app;

    @BeforeAll
    static void init() {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetEmployee() {
        Employee emp = app.getEmployee(255530);

        System.out.println("Employee found:");
        System.out.println(" - ID: " + emp.emp_no);
        System.out.println(" - First Name: " + emp.first_name);
        System.out.println(" - Last Name: " + emp.last_name);

        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }
}