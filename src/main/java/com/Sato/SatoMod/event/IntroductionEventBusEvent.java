package com.Sato.SatoMod.event;

import com.Sato.SatoMod.entity.SatoEntities;
import com.Sato.SatoMod.entity.tatumi.TatumiZombie;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SatoMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntroductionEventBusEvent {
    @SubscribeEvent
    public static void registerAttributes(
            EntityAttributeCreationEvent event) {
        event.put(SatoEntities.TATUMI_ZOMBIE.get(),
                TatumiZombie.createAttributes().build());
    }
}
