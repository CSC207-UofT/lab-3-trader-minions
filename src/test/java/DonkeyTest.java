import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * This file contains sample JUnit test cases for Donkey.java
 * You should NOT modify this file!
 */

public class DonkeyTest {
    Donkey d;

    @Before
    public void setUp() throws Exception {
        d = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hee-haw!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(8, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(9, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(7, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, d.getPrice());
    }

}