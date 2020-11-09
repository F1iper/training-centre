package lesson1.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTestSuite {

    private Range range;

    @Before
    public void setUp() {
        range = new Range(10,20);
    }

    @Test
    public void testIsRangeTrue() {
        assertTrue(range.isRange(15));
        assertFalse(range.isRange(21));
//        assertNull("Is this null?", range);
        assertNotNull("Is this not null?", range);
        assertEquals(10, range.getLowerBound());
        assertNotEquals(10, range.getUpperBound());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLowerBoundHigherThenUpperBound() {
        Range range = new Range(20, 10);
    }

    @Test
    public void shouldHaveProperErrorMessage() {
        try {
            new Range (20,10);
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException e) {
            assertEquals("LowerBound is bigger then UpperBound!", e.getMessage());
        }
    }

    @Test
    public void shouldSayThat15IsInRange() {

        assertTrue(range.isRange(15));
    }

    @Test
    public void shouldSayThat5IsNotInRange() {
        assertFalse(range.isRange(5));
    }

}
