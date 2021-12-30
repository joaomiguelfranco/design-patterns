package com.github.joaomiguelfranco.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGildedRose {

    @Test
    void testWithFooAndQualityUnder50() {
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
    void testWithFooAndSellinEqual0() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testWithFooAndSellingOver0() {
        Item[] items = new Item[] { new Item("foo", 11, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void testWithFooAndQualityUnder0() {
        Item[] items = new Item[] { new Item("foo", -1, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void testWithAgedBrieAndQualityUnder50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 5) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void testWithAgedBrieAndQualityEqual50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testWithAgedBrieAndQualityOver50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testWithbackstageBrieAndQualityEqual50AndSellin0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testWithBackstageBrieAndQualityOver50AndSellin0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin11() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 11) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin12() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 12) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin6() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 6) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void testWithBackstageAndQualityUnder50AndSellin7() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 7) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void testWithbackstageBrieAndQualityEqual50AndSellinOver0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testWithBackstageBrieAndQualityOver50AndSellinOver0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 5) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityEqual50AndSellin0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityOver50AndSellin0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin10() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 5) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin11() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 11) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin12() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 12) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin6() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 6) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityUnder50AndSellin7() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 7) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityEqual50AndSellinOver0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 50) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testWithSulfurasAndQualityOver50AndSellinOver0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 51) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
    }


}
