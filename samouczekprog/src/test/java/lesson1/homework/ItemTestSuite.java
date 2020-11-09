package lesson1.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ItemTestSuite {

    @Test
    public void twoItemsWithSamePriceAndNameShouldBeEqual() {
        assertEquals(new Item("item", 122.22), new Item("item", 122.22));
    }

    @Test
    public void itemsWithDifferentNamesArentEqual() {
        assertNotEquals(new Item("item", 122.22), new Item("item2", 122.22));
    }

    @Test
    public void itemsWithDifferentPriceArentEqual() {
        assertNotEquals(new Item("item", 122.33), new Item("item", 122.22));
    }

    @Test
    public void itemsWithTheSameNameShouldHaveSameHash() {
        assertEquals(new Item("item", 122.22).hashCode(), new Item("item", 122.22).hashCode());
    }

    public void itemsWithDifferentNameShouldHaveDifferentHashCode() {
        assertNotEquals(new Item("item1", 123).hashCode(), new Item("item2", 321).hashCode());
    }

    @Test
    public void itemsWithDifferentPriceAndTheSameNameShouldBeOrdered() {
        assertEquals(-1, new Item("item1", 0.1).compareTo(new Item("item1", 0.2)));
    }
}
