package com.Sato.SatoMod.datagen.client;


import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModBlocks;
import com.Sato.SatoMod.regi.SatoModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, SatoMod.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.sato_main","佐藤MOD");

        addItem(SatoModItems.SATO_INGOT, "シュガライトインゴット");
        addItem(SatoModItems.SATO_PICKAXE, "シュガライトのツルハシ");
        addItem(SatoModItems.SATO_SWORD, "シュガライトの剣");
        addItem(SatoModItems.SATO_AXE, "シュガライトの斧");
        addItem(SatoModItems.SATO_HOE, "シュガライトのクワ");
        addItem(SatoModItems.SATO_SHOVEL, "シュガライトのシャベル");
        addItem(SatoModItems.SUGER_FIST, "シュガーフィスト");

        addItem(SatoModItems.RAW_YAMAMOTO, "ヤマモティウムの原石");
        addItem(SatoModItems.YAMAMOTO_INGOT, "ヤマモティウムインゴット");
        addItem(SatoModItems.YAMAMOTO_HELMET, "ヤマモティウムヘルメット");
        addItem(SatoModItems.YAMAMOTO_CHEST, "ヤマモティウムチェストプレート");
        addItem(SatoModItems.YAMAMOTO_LEGGINGS, "ヤマモティウムレギンス");
        addItem(SatoModItems.YAMAMOTO_BOOTS, "ヤマモティウムブーツ");

        addBlock(SatoModBlocks.Blocks.SATO_INGOT_BLOCK, "シュガライトブロック");
        addBlock(SatoModBlocks.Blocks.YAMAMOTO_ORE_BLOCK, "ヤマモティウム鉱石");
        addBlock(SatoModBlocks.Blocks.DEEPSLATE_YAMAMOTO_ORE_BLOCK, "深層ヤマモティウム鉱石");

//        {
//            "itemGroup.sato_main" : "佐藤MOD",
//
//                "item.satomod.sato_ingot" : "シュガライトインゴット",
//                "item.satomod.sato_pickaxe" : "シュガライトのツルハシ",
//                "item.satomod.sato_sword" : "シュガライトの剣",
//                "item.satomod.sato_axe" : "シュガライトの斧",
//                "item.satomod.sato_hoe" : "シュガライトのクワ",
//                "item.satomod.sato_shovel" : "シュガライトのシャベル",
//                "block.satomod.sato_ingot_block" : "シュガライトブロック",
//
//                "block.satomod.yamamoto_ore_block" : "ヤマモティウム鉱石",
//                "block.satomod.deepslate_yamamoto_ore_block" : "深層ヤマモティウム鉱石",
//                "item.satomod.raw_yamamoto" : "ヤマモティウムの原石",
//                "item.satomod.yamamoto_ingot" : "ヤマモティウムインゴット",
//                "item.satomod.yamamoto_helmet" : "ヤマモティウムヘルメット",
//                "item.satomod.yamamoto_chest" : "ヤマモティウムチェストプレート",
//                "item.satomod.yamamoto_leggings" : "ヤマモティウムレギンス",
//                "item.satomod.yamamoto_boots" : "ヤマモティウムブーツ"
//        }
    }
}
