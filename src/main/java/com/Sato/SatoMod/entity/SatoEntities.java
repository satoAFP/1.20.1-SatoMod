package com.Sato.SatoMod.entity;

import com.Sato.SatoMod.entity.tatumi.TatumiZombie;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SatoEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
                    SatoMod.MOD_ID);
    public static final RegistryObject<EntityType<TatumiZombie>> TATUMI_ZOMBIE =
            ENTITY_TYPES.register("tatumi_model",
                    () -> EntityType.Builder.of(TatumiZombie::new, MobCategory.MONSTER)
                            .build("tatumi_model"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
