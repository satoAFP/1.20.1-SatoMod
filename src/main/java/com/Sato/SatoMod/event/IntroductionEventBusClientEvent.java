package com.Sato.SatoMod.event;

import com.Sato.SatoMod.entity.SatoEntities;
import com.Sato.SatoMod.entity.tatumi.TatumiZombieModel;
import com.Sato.SatoMod.entity.tatumi.TatumiZombieRenderer;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SatoMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT)
public class IntroductionEventBusClientEvent {
    @SubscribeEvent
    public static void registerLayerDefinitions(
            EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TatumiZombieModel.LAYER_LOCATION,
                TatumiZombieModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderer(
            EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(SatoEntities.TATUMI_ZOMBIE.get(),
                TatumiZombieRenderer::new);
    }
}
