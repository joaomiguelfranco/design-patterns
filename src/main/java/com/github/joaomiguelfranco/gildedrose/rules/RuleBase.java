package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;

public interface RuleBase {
    boolean isMatch(ItemProxy item);
    void updateItem(ItemProxy item);
}
