package net.pengi.potatoperks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.pengi.potatoperks.block.ModBlocks;
import net.pengi.potatoperks.item.ModItems;

public class ModModelProvider extends FabricModelProvider
    {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_POTATO_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POTATO_PORTAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PETRIFIED_POTATO_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.PINK_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BLUE_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_PINK_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_ORANGE_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_PURPLE_POTATO, Models.GENERATED);



    }
    }
