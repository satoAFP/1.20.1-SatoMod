package com.Sato.SatoMod.datagen;

import com.Sato.SatoMod.datagen.client.IntroductionBlockStateProvider;
import com.Sato.SatoMod.datagen.client.IntroductionItemModelProvider;
import com.Sato.SatoMod.datagen.client.JAJPLanguageProvider;
import com.Sato.SatoMod.datagen.server.IntroductionWorldGetProvider;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SatoMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntroductionDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookUpProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(),new IntroductionItemModelProvider(packOutput,existingFileHelper));

        generator.addProvider(event.includeClient(),new IntroductionBlockStateProvider(packOutput,existingFileHelper));

        generator.addProvider(event.includeClient(),new JAJPLanguageProvider(packOutput));
        // WorldGen
        generator.addProvider(event.includeServer(),
                new IntroductionWorldGetProvider(packOutput, lookUpProvider));
    }
}
