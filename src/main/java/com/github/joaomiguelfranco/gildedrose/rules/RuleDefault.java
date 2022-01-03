package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;

public class RuleDefault implements RuleBase{


    @Override
    public boolean isMatch(ItemProxy item) {
        return true;
    }

    @Override
    public void updateItem(ItemProxy item) {
        item.decrementQuality();
        item.decrementSellIn();

        if (item.getSellIn() < 0) {
            item.decrementQuality();
        }
    }
}
