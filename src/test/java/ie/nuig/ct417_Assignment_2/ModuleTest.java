package SamDuignan.app;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.joda.time.*;

public class ModuleTest {

    /**
     * Test of getId method, of class Module.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        ArrayList<Student> students;
        students.add(new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234));
        Module instance = new Module("Software Engineering", 321, students);
        int expResult = 321;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Module.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        ArrayList<Student> students;
        students.add(new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234));
        Module instance = new Module("Software Engineering", 321, students);
        String expResult = "Software Engineering";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @org.junit.Test
    public void testGetStudents() {
        ArrayList<Student> students;
        students.add(new Student("Jamie Dunne", 18, new DateTime("2018-05-05T10:11:12.123"), 1234));
        Module instance = new Module("Software Engineering", 321, students);
        DateTime result = instance.getStudents();
        assertEquals(students, result);
    }

    
}