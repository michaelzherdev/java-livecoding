package de.storecast.gildedrose.command;

import de.storecast.gildedrose.Item;

public class SulfurasCommand implements Command {
    public static final int SULFURAS_QUALITY = 80;

    @Override
    public void execute(Item item) {
        if (item.quality != SULFURAS_QUALITY) {
            throw new IllegalArgumentException("Sulfuras quality should be 80!");
        }
    }
}
