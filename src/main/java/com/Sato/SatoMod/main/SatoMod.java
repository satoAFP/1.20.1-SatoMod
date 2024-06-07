package com.Sato.SatoMod.main;
import com.Sato.SatoMod.entity.tatumi.ModEntities;
import com.Sato.SatoMod.entity.tatumi.ModEventSubscriberForge;
import com.Sato.SatoMod.entity.tatumi.TatumiZombie;
import com.Sato.SatoMod.entity.tatumi.TatumiZombieRenderer;
import com.Sato.SatoMod.regi.SatoModBlocks;
import com.Sato.SatoMod.regi.SatoModItems;
import com.Sato.SatoMod.regi.tab.SatoModTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import  net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("satomod")
public class SatoMod {

    //モッド名呼び出し用
    public  static  final String MOD_ID="satomod";

    public SatoMod()
    {
        //クラス生成宣言
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        //タブ追加
        SatoModTabs.MOD_TABS.register(bus);

        //アイテム追加
        SatoModItems.ITEMS.register(bus);

        //ブロック追加
        SatoModBlocks.Blocks.BLOCKS.register(bus);
        SatoModBlocks.BlockItems.BLOCK_ITEMS.register(bus);


        ModEntities.register(bus);

        bus.addListener(this::onClientSetup);
        bus.addListener(ModEventSubscriber::registerRenderers);
        bus.addListener(ModEventSubscriber::registerAttributes);
        forgeEventBus.addListener(ModEventSubscriberForge::onSpawnPlacementRegister);

        MinecraftForge.EVENT_BUS.register(this);
    };


    private void onClientSetup(final FMLClientSetupEvent event) {
        // クライアント側のセットアップ処理
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ModEventSubscriber {
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntities.CUSTOM_ZOMBIE.get(), TatumiZombieRenderer::new);
        }

        @SubscribeEvent
        public static void registerAttributes(EntityAttributeCreationEvent event) {
            event.put(ModEntities.CUSTOM_ZOMBIE.get(), TatumiZombie.createAttributes().build());
        }
    }

}
