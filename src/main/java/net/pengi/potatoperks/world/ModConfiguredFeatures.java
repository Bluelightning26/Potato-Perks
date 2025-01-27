package net.pengi.potatoperks.world;

import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.pengi.potatoperks.PotatoPerks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.pengi.potatoperks.block.ModBlocks;

import java.util.List;


public class ModConfiguredFeatures {


    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRIFIED_POTATO_ORE_KEY = registerKey("petrified_potato_ore");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overworldPinkPotatoOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PETRIFIED_POTATO_ORE.getDefaultState()));




        register(context, PETRIFIED_POTATO_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPinkPotatoOres, 12));

    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {

        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(PotatoPerks.MOD_ID, name));

    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register
                    (Registerable<ConfiguredFeature<?,
                            ?>> context,
                            RegistryKey<ConfiguredFeature<?,
                            ?>> key,
                            F feature,
                            FC configuration)
        {

        context.register(key, new ConfiguredFeature<>(feature, configuration));

        }



}