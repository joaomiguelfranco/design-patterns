package com.github.joaomiguelfranco.gildedrose.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleBuilder {
    private final List<RuleBase> ruleList = new ArrayList<>();

    public RuleBuilder() {
        withBackstage();
        withAgedBrie();
        withSulfuras();
    }

    public void withAgedBrie() {
        ruleList.add(new RuleBrie());
    }

    public void withBackstage() {
        ruleList.add(new RuleBackstage());
    }

    public void withSulfuras() {
        ruleList.add(new RuleSulfuras());
    }

    public List<RuleBase> build() {
        ruleList.add(new RuleDefault());
        return ruleList;
    }
}
