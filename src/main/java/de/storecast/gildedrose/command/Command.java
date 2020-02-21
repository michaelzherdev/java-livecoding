package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public interface Command {
    int MAX_QUALITY = 50;

    void execute(Item item);
}
