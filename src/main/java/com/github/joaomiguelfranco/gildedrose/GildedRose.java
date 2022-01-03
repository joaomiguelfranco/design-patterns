package com.github.joaomiguelfranco.gildedrose;


import com.github.joaomiguelfranco.gildedrose.rules.RuleEngine;

import java.util.Arrays;
import java.util.List;

public class GildedRose {
    final List<ItemProxy> items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items)
                .map(ItemProxy::new)
                .toList();
    }

    public void updateQuality() {
        items.forEach(RuleEngine::new);
    }
}
