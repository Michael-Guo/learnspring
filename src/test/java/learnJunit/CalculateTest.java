package learnJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(BlockJUnit4ClassRunner.class)
public class CalculateTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add1() throws Exception {
    }

    @Test
    public void sub1() throws Exception {
    }

    @Test
    public void add() throws Exception {
        assertEquals(3, new Calculate().add(1, 1));
    }

    @Test
    public void sub() throws Exception {
        assertEquals(2, new Calculate().sub(3, 1));
    }

}