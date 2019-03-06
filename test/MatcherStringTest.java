package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherStringTest {
    MatcherString obj;
    @Before
    public void setUp() throws Exception {
        obj = new MatcherString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void strMatcher() {
        assertEquals("4-6 10-12 27-29",obj.strMatcher("She sells seashells by the seashore","se"));
        assertEquals("4-6 10-12",obj.strMatcher("She sells seashells","se"));
        assertEquals("0-0",obj.strMatcher("",""));
        
    }
}
