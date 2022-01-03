package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;

public class RuleSulfuras implements RuleBase {

    @Override
    public boolean isMatch(ItemProxy item) {
        return item.getName().equals("Sulfuras, Hand of Ragnaros");
    }

    @Override
    public void updateItem(ItemProxy item) {
        // intentionally empty
    }
}
