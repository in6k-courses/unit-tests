package com.in6k.tests.first;

import org.junit.Test;

public class SelfVerifyingPrincipleTest {
    @Test
    public void doNotUseConsoleLoggingForManualResultTests() throws Exception {
        int result = 2 + 2;
        System.out.println(result);
    }
}
