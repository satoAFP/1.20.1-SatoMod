package com.Sato.SatoMod.regi.tab;

import com.Sato.SatoMod.regi.SatoModBlocks;
import com.Sato.SatoMod.regi.SatoModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class SatoMain {

    public  static  final Item[] items={
            //アイテム
            //インゴット
            SatoModItems.SATO_INGOT.get(),
            SatoModItems.RAW_YAMAMOTO.get(),
            SatoModItems.YAMAMOTO_INGOT.get(),

            //ツール
            SatoModItems.SATO_PICKAXE.get(),
            SatoModItems.SATO_SWORD.get(),
            SatoModItems.SATO_AXE.get(),
            SatoModItems.SATO_HOE.get(),
            SatoModItems.SATO_SHOVEL.get(),
            SatoModItems.SUGER_FIST.get(),

            //防具
            SatoModItems.YAMAMOTO_HELMET.get(),
            SatoModItems.YAMAMOTO_CHEST.get(),
            SatoModItems.YAMAMOTO_LEGGINGS.get(),
            SatoModItems.YAMAMOTO_BOOTS.get(),


            //ブロック
            SatoModBlocks.BlockItems.SATO_INGOT_BLOCK.get(),
            SatoModBlocks.BlockItems.YAMAMOTO_ORE_BLOCK.get(),
            SatoModBlocks.BlockItems.DEEPSLATE_YAMAMOTO_ORE_BLOCK.get(),
    };


}
