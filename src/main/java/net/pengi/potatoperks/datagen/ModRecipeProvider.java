package net.pengi.potatoperks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.pengi.potatoperks.block.ModBlocks;
import net.pengi.potatoperks.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
    {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> POTATO_BLOCK_SMELTABLES = List.of(ModBlocks.PETRIFIED_POTATO_ORE);


        offerSmelting(exporter, POTATO_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.POTATO_PORTAL, 0.25f, 200,
                "potato_portal");
        offerBlasting(exporter, POTATO_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.POTATO_PORTAL, 0.25f, 100, "potato_portal");


        /* IMPORTANT!!!
         Do all other smelt/blast/smoke json files by hand

         - couldn't work and spent much time searching for a fix :(
         */
//

//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_POTATO, RecipeCategory.MISC, ModBlocks.PINK_POTATO_BLOCK);
//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORANGE_POTATO, RecipeCategory.MISC, ModBlocks.ORANGE_POTATO_BLOCK);
//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_POTATO, RecipeCategory.MISC, ModBlocks.PURPLE_POTATO_BLOCK);
//        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_POTATO, RecipeCategory.MISC, ModBlocks.BLUE_POTATO_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_POTATO_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.PINK_POTATO)
                .criterion(hasItem(ModItems.PINK_POTATO), conditionsFromItem(ModItems.PINK_POTATO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUE_POTATO_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.BLUE_POTATO)
                .criterion(hasItem(ModItems.BLUE_POTATO), conditionsFromItem(ModItems.BLUE_POTATO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORANGE_POTATO_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ORANGE_POTATO)
                .criterion(hasItem(ModItems.ORANGE_POTATO), conditionsFromItem(ModItems.ORANGE_POTATO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PURPLE_POTATO_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.PURPLE_POTATO)
                .criterion(hasItem(ModItems.PURPLE_POTATO), conditionsFromItem(ModItems.PURPLE_POTATO))
                .offerTo(exporter);

        new ShapelessRecipeJsonBuilder(RecipeCategory.MISC, ModItems.PINK_POTATO, 9)
                .input(ModBlocks.PINK_POTATO_BLOCK)
                .criterion(hasItem(ModBlocks.PINK_POTATO_BLOCK), conditionsFromItem(ModBlocks.PINK_POTATO_BLOCK))
                .offerTo(exporter);

        new ShapelessRecipeJsonBuilder(RecipeCategory.MISC, ModItems.PURPLE_POTATO, 9)
                .input(ModBlocks.PURPLE_POTATO_BLOCK)
                .criterion(hasItem(ModBlocks.PURPLE_POTATO_BLOCK), conditionsFromItem(ModBlocks.PURPLE_POTATO_BLOCK))
                .offerTo(exporter);

        new ShapelessRecipeJsonBuilder(RecipeCategory.MISC, ModItems.ORANGE_POTATO, 9)
                .input(ModBlocks.ORANGE_POTATO_BLOCK)
                .criterion(hasItem(ModBlocks.ORANGE_POTATO_BLOCK), conditionsFromItem(ModBlocks.ORANGE_POTATO_BLOCK))
                .offerTo(exporter);

        new ShapelessRecipeJsonBuilder(RecipeCategory.MISC, ModItems.BLUE_POTATO, 9)
                .input(ModBlocks.BLUE_POTATO_BLOCK)
                .criterion(hasItem(ModBlocks.BLUE_POTATO_BLOCK), conditionsFromItem(ModBlocks.BLUE_POTATO_BLOCK))
                .offerTo(exporter);

    }
    }
