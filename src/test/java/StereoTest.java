import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    CassettePlayer cassettePlayer;
    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Forth 1", "Sony", "DAB200X");
        stereo = new Stereo("Amy's Stereo", cdPlayer, cassettePlayer, radio );


    }
  @Test
    public void canTuneRadio() {
        assertEquals("Tuned into Forth 1", stereo.tuneRadio());
  }
}
