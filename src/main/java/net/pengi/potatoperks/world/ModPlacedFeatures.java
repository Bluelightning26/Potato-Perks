package net.pengi.potatoperks.world;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.pengi.potatoperks.PotatoPerks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;


import java.util.List;


public class ModPlacedFeatures
    {


    public static final RegistryKey<PlacedFeature> PETRIFIED_POTATO_ORE_PLACED_KEY = registerKey("petrified_potato_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context, PETRIFIED_POTATO_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PETRIFIED_POTATO_ORE_KEY),
                ModOrePlacement.modifiersWithCount
                        (16,
                                HeightRangePlacementModifier.trapezoid
                                        (YOffset.fixed(-30),
                                        YOffset.fixed(80))));
        //Upper and lower limits for Ore Gen
        //Trap = Triangle Shaped (More @ bottom of world)



    }



    public static RegistryKey<PlacedFeature> registerKey(String name) {

        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(PotatoPerks.MOD_ID, name));

        }



    private static void register
            (Registerable<PlacedFeature> context,
             RegistryKey<PlacedFeature> key,
             RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)

        {

        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));

        }



    private static <FC extends FeatureConfig, F extends Feature<FC>> void register
            (Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
             RegistryEntry<ConfiguredFeature<?, ?>> configuration,
           PlacementModifier... modifiers)
        {

        register(context, key, configuration, List.of(modifiers));

        }



}