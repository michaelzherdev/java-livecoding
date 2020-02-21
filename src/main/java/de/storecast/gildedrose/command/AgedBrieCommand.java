package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public class AgedBrieCommand implements Command {
    @Override
    public void execute(Item item) {
        item.sellIn--;
        if (item.quality < MAX_QUALITY && item.sellIn < 0) {
            item.quality += 2;
        } else if (item.quality < MAX_QUALITY) {
            item.quality += 1;
        }
    }
}
