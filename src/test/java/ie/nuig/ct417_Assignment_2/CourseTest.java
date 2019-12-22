package SamDuignan.app;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.joda.time.*;

public class CourseTest {

    /**
     * Test of getName method, of class Course.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        ArrayList<Module> modules;
        modules.add(new Module())
        Student instance = new Course("Engineering", modules, new DateTime("2019-09-09T09:00:00.000"), new DateTime("2019-09-12T09:00:00.000"));
        int expResult = "Engineering";
        int result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Course.
     */
    @org.junit.Test
    public void testGetModules() {
        System.out.println("getModules");
        ArrayList<Module> modules;
        modules.add(new Module())
        Student instance = new Course("Engineering", modules, new DateTime("2019-09-09T09:00:00.000"), new DateTime("2019-09-12T09:00:00.000"));
        ArrayList<Module> expResult = modules;
        int result = instance.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStart method, of class Course.
     */
    @org.junit.Test
    public void testGetStart() {
        System.out.println("getStart");
        ArrayList<Module> modules;
        modules.add(new Module())
        Student instance = new Course("Engineering", modules, new DateTime("2019-09-09T09:00:00.000"), new DateTime("2019-09-12T09:00:00.000"));
        DateTime expResult = new DateTime("2019-09-09T09:00:00.000")
        DateTime result = instance.getStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnd method, of class Course.
     */
    @org.junit.Test
    public void testGetEnd() {
        System.out.println("getEnd");
        ArrayList<Module> modules;
        modules.add(new Module())
        Student instance = new Course("Engineering", modules, new DateTime("2019-09-09T09:00:00.000"), new DateTime("2019-09-12T09:00:00.000"));
        DateTime expResult = new DateTime("2019-09-12T09:00:00.000")
        DateTime result = instance.getEnd();
        assertEquals(expResult, result);
    }

    
}