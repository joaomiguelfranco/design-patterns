package com.github.joaomiguelfranco.gildedrose;


import com.github.joaomiguelfranco.gildedrose.rules.*;
import lombok.val;

import java.util.Arrays;
import java.util.List;

public class GildedRose {
    List<ItemProxy> items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items)
                .map(ItemProxy::new)
                .toList();
    }

    public void updateQuality() {
        items.stream()
                .forEach(RuleEngine::new);
    }
}
