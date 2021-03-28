import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before () {
        pilot = new Pilot("John", "Captain", "GR596");
    }

    @Test
    public void testCanFly() {
        assertEquals("Ready to Fly", pilot.canFlyPlane());
}
}
