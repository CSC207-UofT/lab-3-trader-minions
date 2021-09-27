/*
 * This file contains sample JUnit test cases for EamonMa.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class EamonMaTest {
    EamonMa e;

    @Before
    public void setUp() throws Exception {
        e = new EamonMa();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Eamon Ma", e.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, e.getPrice());
    }

}