package com.github.joaomiguelfranco.gildedrose.rules;

import com.github.joaomiguelfranco.gildedrose.ItemProxy;
import lombok.val;

import java.util.Arrays;
import java.util.List;

public class RuleEngine {

    private final List<RuleBase> ruleList = Arrays.asList(
            new RuleBackstage(),
            new RuleBrie(),
            new RuleSulfuras()
    );

    public RuleEngine(ItemProxy item) {
        val rule = findRule(item);
        rule.updateItem(item);
    }

    private RuleBase findRule(ItemProxy item) {
        return ruleList
                .stream()
                .filter(ruleBase -> ruleBase.isMatch(item))
                .findAny()
                .orElseGet(RuleDefault::new);
    }

}
