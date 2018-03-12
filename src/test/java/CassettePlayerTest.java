import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void before() {
        cassettePlayer = new CassettePlayer("Sony ", "CP100X");
    }

    @Test
    public void canShowTapeInDeck() {
        assertEquals(false, cassettePlayer.isTapeInDeck());
    }
}
