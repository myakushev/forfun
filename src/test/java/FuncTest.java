import com.yak.test.TestsMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncTest {
    private TestsMethods tm;

    @Before
    public void init() {
        tm = new TestsMethods();
    }

    @After
    public void tearDown() {
        tm = null;
    }

    @Test
    public void checkSumm() {
        assertEquals(12, tm.summ(11,1));

        assertEquals(0, tm.summ(2,-9));

        assertEquals(10, tm.summ(-11,21));

        assertEquals(-9, tm.summ(11,-20));
    }
}
