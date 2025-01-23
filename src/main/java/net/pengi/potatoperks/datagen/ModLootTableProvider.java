package net.pengi.potatoperks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pengi.potatoperks.block.ModBlocks;
import net.pengi.potatoperks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
    {
    public ModLootTableProvider(FabricDataOutput dataOutput,
                           CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_POTATO_BLOCK );
        addDrop(ModBlocks.BLUE_POTATO_BLOCK);
        addDrop(ModBlocks.ORANGE_POTATO_BLOCK );
        addDrop(ModBlocks.PURPLE_POTATO_BLOCK);

        addDrop(ModBlocks.POTATO_PORTAL);

        addDrop(ModBlocks.PETRIFIED_POTATO_ORE, oreDrops(ModBlocks.PETRIFIED_POTATO_ORE, ModItems.PINK_POTATO));

    }
    }
