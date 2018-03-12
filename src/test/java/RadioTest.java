import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Radio 1", "Sony " ,"DAB100X");
    }

    @Test
    public void canTuneIntoStation() {
        assertEquals("Tuned into Radio 1", radio.tune());
    }
}
