import org.junit.*;

import static org.junit.Assert.*;

public class Eamonmatest {
    Eamonma eamon;

    @Before
    public void setUp() throws Exception{
        eamon = new Eamonma();
    }

    @Test
    public void testGetItemName() throws  Exception{
        assertEquals("eamon ma", eamon.getItemName());
    }

}
