package com.Sato.SatoMod.regi;

import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SatoModTags {

    //ブロックタグ登録用クラス
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SATO_INGOT_TOOL=tag("needs_sato_ingot_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SatoMod.MOD_ID, name));
        }
    }

    //アイテムタグ登録用クラス
    public static class Items {

        //タグ名設定
        public static final TagKey<Item> SATO_SERIES=tag("sato_series");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SatoMod.MOD_ID, name));
        }
    }

}
