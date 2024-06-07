package com.Sato.SatoMod.worldgen.features;

import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class IntroductionOreFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> YAMAMOTO_ORE_KEY=
            createKey("yamamoto_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stone=new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslate=new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> yamamotoOres= List.of(
                OreConfiguration.target(stone,
                        SatoModBlocks.Blocks.YAMAMOTO_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslate,
                        SatoModBlocks.Blocks.DEEPSLATE_YAMAMOTO_ORE_BLOCK.get().defaultBlockState())
        );

        FeatureUtils.register(context,YAMAMOTO_ORE_KEY, Feature.ORE,
                new OreConfiguration(yamamotoOres,9));
    }

    public static ResourceKey<ConfiguredFeature<?,?>> createKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE,
                new ResourceLocation(SatoMod.MOD_ID,name));
    }
}
