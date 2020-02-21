package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public class BackStageCommand implements Command {
    @Override
    public void execute(Item item) {
        item.sellIn--;
        if (item.sellIn >= 0) {
            if (item.sellIn < 5) {
                incrementQuality(item, 3);
            } else if (item.sellIn < 10) {
                incrementQuality(item, 2);
            } else {
                incrementQuality(item, 1);
            }
        } else {
            item.quality = 0;
        }
    }

    private void incrementQuality(Item item, int times) {
        if (item.quality < MAX_QUALITY && item.sellIn < 0) {
            item.quality += 2 * times;
        } else if (item.quality < MAX_QUALITY) {
            item.quality += times;
        }
    }
}
