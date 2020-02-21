package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public class DefaultCommand implements Command {

    @Override
    public void execute(Item item) {
        item.sellIn--;
        decrementQuality(item);
    }

    protected void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
            if (item.quality > 0 && item.sellIn < 0) {
                item.quality--;
            }
        }
    }
}
