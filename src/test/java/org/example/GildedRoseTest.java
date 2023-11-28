package org.example;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GildedRoseTest {
    @Test
    void test() {
        CombinationApprovals.verifyAllCombinations(
            this::doUpdateQuality,
            new String[]{"anyItem"},
            new Integer[]{5},
            new Integer[]{5}
        );
    }

    private Item doUpdateQuality(String name, Integer sellIn, Integer quality) {
        final Item item = new Item(name, sellIn, quality);
        final GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();
        return item;
    }
}
