package com.github.joaomiguelfranco.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGildedRose {

    @Test
    void testWithFoo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testWithFooAndQualityEqualTo50() {
        Item[] items = new Item[] { new Item("foo", 0, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }

    @Test
    void testWithFooAndQualityOver50() {
        Item[] items = new Item[] { new Item("foo", 0, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void testWithAgedBrie() {

    }
}
