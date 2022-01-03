package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;
import lombok.val;

public class RuleEngine {

    private final RuleBuilder ruleBuilder = new RuleBuilder();

    public RuleEngine(ItemProxy item) {
        val rule = findRule(item);
        rule.updateItem(item);
    }

    private RuleBase findRule(ItemProxy item) {
        return ruleBuilder
                .build()
                .stream()
                .filter(ruleBase -> ruleBase.isMatch(item))
                .findFirst()
                .orElseThrow(() -> new AssertionError("Rule for item "+ item.getName() + " not found!"));
    }

}
