package com.github.joaomiguelfranco.gildedrose;

public record ItemProxy(Item item) {

    public void incrementQuality() {
        if (item.quality < 50) item.quality++;
    }

    public String getName() {
        return item.name;
    }

    public void decrementQuality() {
        if (item.quality > 0) item.quality--;
    }

    public void resetQuality() {
        item.quality = 0;
    }

    public int getQuality() {
        return item.quality;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public void decrementSellIn() {
        item.sellIn--;
    }
}
