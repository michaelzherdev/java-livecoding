package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public class ConjuredCommand extends DefaultCommand {

    @Override
    public void execute(Item item) {
        super.execute(item);
        decrementQuality(item);
    }
}
