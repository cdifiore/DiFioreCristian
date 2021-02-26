/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unibo.wenvusage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Before public void setup(){
        System.out.println("setup");
    }


    @Test public void testAppHasAGreeting() {
        System.out.println("testAppHasAGreeting");
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testAnotherKo(){
        System.out.println("testAnotherKo");
     //  fail();
    }

    @Test public void testAnotherOk(){
        System.out.println("testAnotherOK");
        assertTrue(2==2);
    }

    @After public void terminate(){
        System.out.println("Terminate");
    }
}
