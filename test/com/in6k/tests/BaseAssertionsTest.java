package com.in6k.tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class BaseAssertionsTest {
    @Test
    public void assertInt() throws Exception {
        int expected = 5;
        int actual = 2 + 2;
        assertEquals(expected, actual);
    }

    @Test
    public void assertDouble() throws Exception {
        double expected = 5.0;
        double actual = 2.0 + 2.0;
        double delta = 0.0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void assertDoublePrecision() throws Exception {
        float expected = 0.005f;
        float actual = 1.435f - 1.43f;
        float delta = 0.000000001f;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void assertBoolean() throws Exception {
        assertTrue("Sorry, the result must be true.", false);
    }

    @Test
    public void assertNullValue() throws Exception {
        assertNotNull("Sorry, NULL is not allowed.", null);
    }
}
