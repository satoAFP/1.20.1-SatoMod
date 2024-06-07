package com.Sato.SatoMod.worldgen.placement;

import com.Sato.SatoMod.worldgen.features.IntroductionOreFeatures;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class IntroductionOrePlacemnt {
    public static final ResourceKey<PlacedFeature> ORE_YAMAMOTO =
            createKey("ore_orihalcon");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        // 鉱石の配置情報を設定
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures =
                context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, ORE_YAMAMOTO,
                configuredFeatures.getOrThrow(IntroductionOreFeatures.YAMAMOTO_ORE_KEY),
                commonOrePlacement(10,//生成数　90はめっちゃ高い
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), //生成される高さ
                                VerticalAnchor.absolute(20))));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE,
                new ResourceLocation(SatoMod.MOD_ID, name));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    private static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
