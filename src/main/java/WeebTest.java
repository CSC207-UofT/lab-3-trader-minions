import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeebTest {
    Weeb w;

    @Before
    public void setUp() throws Exception{
        w = new Weeb();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed(){
        assertEquals(30, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestupgradeSpeed(){
        w.upgradeSpeed();
        assertEquals(50, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestgetPrice(){
        assertEquals(30, w.getPrice());
    }

}
