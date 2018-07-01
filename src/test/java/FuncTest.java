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
    public void checkSumm1() {
        assertEquals(12, tm.summ(11,1));
    }

    @Test
    public void checkSumm2() {
        assertEquals(0, tm.summ(2,-2));
    }

    @Test
    public void checkSumm3() {
        assertEquals(10, tm.summ(-11,21));
    }

    @Test
    public void checkSumm4() {
        assertEquals(-9, tm.summ(11,-20));
    }
}
