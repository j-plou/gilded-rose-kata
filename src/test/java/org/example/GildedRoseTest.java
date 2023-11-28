package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GildedRoseTest {
    @Test
    void test() {
        final Item item = new Item("foo", 5, 5);
        final GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertThat(item.quality).isEqualTo(4);
        assertThat(item.sellIn).isEqualTo(4);
    }
}
