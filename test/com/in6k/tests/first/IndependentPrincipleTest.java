package com.in6k.tests.first;


import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class IndependentPrincipleTest {

    public static int result = 0;

    @Test
    public void test2() throws Exception {
        result += 4;
        assertEquals(4, result);
    }

    @Test
    @Ignore
    public void test1() throws Exception {
        result += 2;
        assertEquals(2, result);
    }
}
