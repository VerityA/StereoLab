import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer(3, "Sony ", "CDP100X");
    }

    @Test
    public void canGetNumberOfCDs() {
        assertEquals(3, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canGetModel() {
        assertEquals("CDP100X", cdPlayer.getModel());
    }

    @Test
    public void canGetMake()  {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canSwitchOn() {
        assertEquals("Sony CDP100X is switched on", cdPlayer.switchOn());
    }

    @Test
    public void canPlay() {
        assertEquals("I am playing...lalalalalaaaa", cdPlayer.play());
    }

    @Test
    public void canStop() {
        assertEquals("(silence)", cdPlayer.stop());
    }

}
