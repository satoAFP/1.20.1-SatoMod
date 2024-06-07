package com.Sato.SatoMod.entity.tatumi;

import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "satomod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SatoMod.MOD_ID);

    public static final RegistryObject<EntityType<TatumiZombie>> CUSTOM_ZOMBIE = ENTITY_TYPES.register("tatumi_zombie",
            () -> EntityType.Builder.of(TatumiZombie::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.95F)
                    .build(new ResourceLocation(SatoMod.MOD_ID, "tatumi_zombie").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

//    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SatoMod.MOD_ID);
//    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SatoMod.MOD_ID);
//
//    public static final RegistryObject<EntityType<TatumiZombie>> CUSTOM_ZOMBIE = ENTITY_TYPES.register("tatumi_model",
//            () -> EntityType.Builder.of(TatumiZombie::new, MobCategory.MONSTER)
//                    .sized(0.6F, 1.95F)
//                    .build("tatumi_model"));
//
//    public static final RegistryObject<Item> CUSTOM_ZOMBIE_SPAWN_EGG = ITEMS.register("tatumi_model_spawn_egg",
//            () -> new SpawnEggItem(CUSTOM_ZOMBIE.get(), 0x00FF00, 0x0000FF, new Item.Properties()));
//
//    public static void register(IEventBus eventBus) {
//        ENTITY_TYPES.register(eventBus);
//        ITEMS.register(eventBus);
//    }
}

