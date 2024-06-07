package com.Sato.SatoMod.regi.tab;

import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SatoModTabs {
    //クリエイティブモードのタブ登録設定
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SatoMod.MOD_ID);

    //タブの作成
    public static final RegistryObject<CreativeModeTab> SATO_MAIN = MOD_TABS.register("sato_main",
            () -> {
                return CreativeModeTab.builder()
                        .icon(() -> new ItemStack(SatoModItems.SATO_INGOT.get()))                //タブのアイコン
                        .title(Component.translatable("itemGroup.sato_main"))  //タブの翻訳
                        .displayItems((param, output) -> {                              //タブ内のアイテム登録
                            for (Item item : SatoMain.items)
                                output.accept(item);
                        }).build();
            });

    //タブ2個目以降
//    public static final RegistryObject<CreativeModeTab> SATO_SUB = MOD_TABS.register("sato_sub",
//            ()->{
//                return CreativeModeTab.builder()
//                        .icon(()->new ItemStack(Blocks.CHERRY_PLANKS))
//                        .title(Component.translatable("itemGroup.sato_sub"))
//                        .withTabsBefore(SatoModTabs.SATO_MAIN.getId())        //タブの順番設定
//                        .displayItems((param,output)->{
//                            for(Item item:SatoMain.items)
//                                output.accept(item);
//                        }).build();
//            });
}
