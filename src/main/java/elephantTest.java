/*
This file tests the class elephant.java using JUnit test cases.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class elephantTest {
    elephant e;

    @Before
    public void setUp() throws Exception {
        e = new elephant();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("eEEEEEEEEee", e.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(420, e.getPrice());
    }
}
