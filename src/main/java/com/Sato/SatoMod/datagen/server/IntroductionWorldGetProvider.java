package com.Sato.SatoMod.datagen.server;

import com.Sato.SatoMod.worldgen.biome.IntroductionBiomeModifiers;
import com.Sato.SatoMod.worldgen.features.IntroductionOreFeatures;
import com.Sato.SatoMod.worldgen.placement.IntroductionOrePlacemnt;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class IntroductionWorldGetProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, IntroductionOreFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, IntroductionOrePlacemnt::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, IntroductionBiomeModifiers::bootstrap);

    public IntroductionWorldGetProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(SatoMod.MOD_ID));
    }
}
