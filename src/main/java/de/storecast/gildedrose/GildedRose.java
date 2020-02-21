package de.storecast.gildedrose;

import de.storecast.gildedrose.command.*;

class GildedRose {
    private final Item[] items;

    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASSES_TO_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String CONJURED = "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            final String itemName = item.name;
            Command command;
            switch (itemName) {
                case SULFURAS:
                    command = new SulfurasCommand();
                    break;
                case AGED_BRIE:
                    command = new AgedBrieCommand();
                    break;
                case BACKSTAGE_PASSES_TO_CONCERT:
                    command = new BackStageCommand();
                    break;
                case CONJURED:
                    command = new ConjuredCommand();
                    break;
                default:
                    command = new DefaultCommand();
            }
            command.execute(item);
        }
    }
}
