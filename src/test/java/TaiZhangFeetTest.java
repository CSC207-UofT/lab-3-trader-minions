/*
 * This file contains sample JUnit test cases for EamonMa.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class TaiZhangFeetTest {
    TaiZhangFeet t;

    @Before
    public void setUp() throws Exception {
        t = new TaiZhangFeet();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("moo", t.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(-100, t.getPrice());
    }

}