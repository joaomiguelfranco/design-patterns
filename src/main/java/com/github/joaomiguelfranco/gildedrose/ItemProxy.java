package com.github.joaomiguelfranco.gildedrose;

public class ItemProxy {

    private Item item;

    public ItemProxy(String name, int sellIn, int quality) {
        item = new Item(name, sellIn, quality);
    }

    public ItemProxy(Item item) {
        this.item = item;
    }

    public void incrementQuality() { if( item.quality < 50) item.quality++; }

    public String getName() {
        return item.name;
    }

    public void decrementQuality() {
        if(item.quality > 0 ) item.quality--;
    }

    public void resetQuality() { item.quality = 0; }

    public int getQuality() { return item.quality; }

    public int getSellIn() {
        return item.sellIn;
    }

    public void decrementSellIn() {
        item.sellIn--;
    }



}
