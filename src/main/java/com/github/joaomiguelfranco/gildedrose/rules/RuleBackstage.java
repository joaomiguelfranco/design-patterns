package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;

public class RuleBackstage implements RuleBase{

    @Override
    public boolean isMatch(ItemProxy item) {
        return item.getName().equals("Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public void updateItem(ItemProxy item) {
        item.incrementQuality();

        if (item.getSellIn() < 11) {
            item.incrementQuality();
        }

        if (item.getSellIn() < 6) {
            item.incrementQuality();
        }
        item.decrementSellIn();

        if (item.getSellIn() < 0) {
            item.resetQuality();
        }
    }
}
