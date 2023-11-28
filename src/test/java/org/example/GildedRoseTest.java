package org.example;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GildedRoseTest {
    @Test
    void test() {
        CombinationApprovals.verifyAllCombinations(
            this::doUpdateQuality,
            new String[]{"anyItem"},
            range(-1, 5),
            range(-1, 5)
        );
    }

    private Item doUpdateQuality(String name, Integer sellIn, Integer quality) {
        final Item item = new Item(name, sellIn, quality);
        final GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();
        return item;
    }

    private Integer[] range(int min, int max) {
        return IntStream.range(min, max).boxed().toArray(Integer[]::new);
    }
}
