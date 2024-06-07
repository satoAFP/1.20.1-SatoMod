package com.Sato.SatoMod.worldgen.biome;

import com.Sato.SatoMod.worldgen.placement.IntroductionOrePlacemnt;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class IntroductionBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ORIHALCON_ORE =
            createKey("add_orihalcon_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        // 鉱石が生成されるバイオームを設定
        HolderGetter<PlacedFeature> placedFeatures =
                context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ORIHALCON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(IntroductionOrePlacemnt.ORE_YAMAMOTO)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS,
                new ResourceLocation(SatoMod.MOD_ID, name));
    }
}
