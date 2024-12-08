package net.pengi.potatoperks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.pengi.potatoperks.PotatoPerks;
import net.pengi.potatoperks.block.custom.PotatoPortal;

import static net.pengi.potatoperks.item.ModItems.PURPLE_POTATO;

public class ModBlocks {
    public static final Block PINK_POTATO_BLOCK = registerBlock("pink_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.FROGLIGHT)
                    .velocityMultiplier(1.25f)

            ));

    public static final Block BLUE_POTATO_BLOCK = registerBlock("blue_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.FROGLIGHT)
                    .jumpVelocityMultiplier(2f)

            ));

    public static final Block ORANGE_POTATO_BLOCK = registerBlock("orange_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.FROGLIGHT)
                    .slipperiness(0.98f)
            ));

    public static final Block PURPLE_POTATO_BLOCK = registerBlock("purple_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.FROGLIGHT)
                    .luminance(state-> 15)
            ));

    public static final Block PETRIFIED_POTATO_ORE = registerBlock("petrified_potato_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POTATO_PORTAL = registerBlock("potato_portal",
            new PotatoPortal(AbstractBlock.Settings.create()
                    .strength(1.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BAMBOO)
            ));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PotatoPerks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PotatoPerks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        PotatoPerks.LOGGER.info("Registering Mod Blocks for " + PotatoPerks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_POTATO_BLOCK);
            entries.add(ModBlocks.BLUE_POTATO_BLOCK);
            entries.add(ModBlocks.ORANGE_POTATO_BLOCK);
            entries.add(ModBlocks.PETRIFIED_POTATO_ORE);
            entries.add(ModBlocks.PURPLE_POTATO_BLOCK);
            entries.add(ModBlocks.POTATO_PORTAL);
        });
    }
    }
