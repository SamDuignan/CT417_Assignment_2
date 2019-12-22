package SamDuignan.app;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.joda.time.*;

public class AppTest {

    /**
     * Test of getId method, of class Student.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234);
        int expResult = 1234;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234);
        String expResult = "Jamie Dunne";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @org.junit.Test
    public void testGetDob() {
        System.out.println("getDob");
        DateTime expResult = new DateTime("2018-05-05T10:11:12.123");
        Student instance = new Student("Jamie Dunne", 18, expResult, 1234);
        DateTime result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Student.
     */
    @org.junit.Test
    public void testGetUser() {
        System.out.println("getUser");
        Student instance = new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234);
        String expResult = "Jamie Dunne18";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
    
}