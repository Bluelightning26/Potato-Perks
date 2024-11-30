package net.pengi.potatoperks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.pengi.potatoperks.PotatoPerks;

public class ModBlocks {
    public static final Block PINK_POTATO_BLOCK = registerBlock("pink_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA)
                    .velocityMultiplier(1.25f)

            ));

    public static final Block BLUE_POTATO_BLOCK = registerBlock("blue_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA)
                    .jumpVelocityMultiplier(2f)

            ));

    public static final Block ORANGE_POTATO_BLOCK = registerBlock("orange_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA)
            ));

    public static final Block PETRIFIED_POTATO_ORE = registerBlock("petrified_potato_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)
            ));

    public static final Block PURPLE_POTATO_BLOCK = registerBlock("purple_potato_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA)
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
        });
    }
    }
