package net.pengi.potatoperks.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.pengi.potatoperks.world.ModPlacedFeatures;

public class ModOreGeneration
    {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.PETRIFIED_POTATO_ORE_PLACED_KEY);

        //Can add Biome Customizations in future HERE


    }
    }