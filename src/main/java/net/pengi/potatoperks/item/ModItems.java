package net.pengi.potatoperks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pengi.potatoperks.PotatoPerks;

public class ModItems {

    public static final Item PINK_POTATO = registerItem("pink_potato", new Item(new Item.Settings()));

    public static final Item BLUE_POTATO = registerItem("blue_potato", new Item(new Item.Settings()));

    public static final Item ORANGE_POTATO = registerItem("orange_potato", new Item(new Item.Settings()));

    public static final Item PURPLE_POTATO = registerItem("purple_potato", new Item(new Item.Settings()));

    public static final Item COOKED_PINK_POTATO = registerItem("cooked_pink_potato",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_PINK_POTATO)));

    public static final Item COOKED_BLUE_POTATO = registerItem("cooked_blue_potato",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_BLUE_POTATO)));

    public static final Item COOKED_ORANGE_POTATO = registerItem("cooked_orange_potato", new Item
            (new Item.Settings().food(ModFoodComponents.COOKED_ORANGE_POTATO)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PotatoPerks.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PotatoPerks.LOGGER.info("Registering Mod Items for " + PotatoPerks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        entries.add(PINK_POTATO);
        entries.add(BLUE_POTATO);
        entries.add(ORANGE_POTATO);
        entries.add(PURPLE_POTATO);

        entries.add(COOKED_PINK_POTATO);
        entries.add(COOKED_BLUE_POTATO);
        entries.add(COOKED_ORANGE_POTATO);

        } );
    }
}
