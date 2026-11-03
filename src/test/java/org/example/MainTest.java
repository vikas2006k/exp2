package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {

        String expected = "Regression Testing using Maven";
        String actual = "Regression Testing using Maven";

        assertEquals(expected, actual);
    }

    @Test
    public void testAddition() {

        int a = 10;
        int b = 20;

        assertEquals(30, a + b);
    }
}