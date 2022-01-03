package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;

public class RuleBrie implements RuleBase {

    @Override
    public boolean isMatch(ItemProxy item) {
        return item.getName().equals("Aged Brie");
    }

    @Override
    public void updateItem(ItemProxy item) {
        item.incrementQuality();
        item.decrementSellIn();

        if (item.getSellIn() < 0) {
            item.incrementQuality();
        }
    }
}
