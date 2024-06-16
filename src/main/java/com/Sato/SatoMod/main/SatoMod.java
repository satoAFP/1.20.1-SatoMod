package com.Sato.SatoMod.main;
import com.Sato.SatoMod.entity.SatoEntities;
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

        //タブ追加
        SatoModTabs.MOD_TABS.register(bus);

        //アイテム追加
        SatoModItems.ITEMS.register(bus);

        //ブロック追加
        SatoModBlocks.Blocks.BLOCKS.register(bus);
        SatoModBlocks.BlockItems.BLOCK_ITEMS.register(bus);

        SatoEntities.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    };



}
