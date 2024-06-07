package com.Sato.SatoMod.regi;

import com.Sato.SatoMod.item.ItemSatoIngot;
import com.Sato.SatoMod.item.armor.ItemYamamotoBoots;
import com.Sato.SatoMod.item.armor.ItemYamamotoChest;
import com.Sato.SatoMod.item.armor.ItemYamamotoLeggings;
import com.Sato.SatoMod.item.tool.*;
import com.Sato.SatoMod.item.yamamoto.ItemRowYamamoto;
import com.Sato.SatoMod.item.armor.ItemYamamotoHelmet;
import com.Sato.SatoMod.item.yamamoto.ItemYamamotoIngot;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SatoModItems {

    //アイテム登録宣言
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SatoMod.MOD_ID);

    //アイテムの登録
    //インゴット
    public static final RegistryObject<Item> SATO_INGOT = ITEMS.register("sato_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_YAMAMOTO = ITEMS.register("raw_yamamoto", ItemRowYamamoto::new);
    public static final RegistryObject<Item> YAMAMOTO_INGOT = ITEMS.register("yamamoto_ingot", ItemYamamotoIngot::new);


    //ツール
    public static final RegistryObject<PickaxeItem> SATO_PICKAXE = ITEMS.register("sato_pickaxe", ToolSatoPickaxe::new);
    public static final RegistryObject<SwordItem> SATO_SWORD = ITEMS.register("sato_sword", ToolSatoSword::new);
    public static final RegistryObject<AxeItem> SATO_AXE = ITEMS.register("sato_axe", ToolSatoAxe::new);
    public static final RegistryObject<HoeItem> SATO_HOE = ITEMS.register("sato_hoe", ToolSatoHoe::new);
    public static final RegistryObject<ShovelItem> SATO_SHOVEL = ITEMS.register("sato_shovel", ToolSatoShovel::new);
    public static final RegistryObject<SwordItem> SUGER_FIST = ITEMS.register("suger_fist", ToolSugerFistSword::new);


    //防具
    public static final RegistryObject<ArmorItem> YAMAMOTO_HELMET = ITEMS.register("yamamoto_helmet", ItemYamamotoHelmet::new);
    public static final RegistryObject<ArmorItem> YAMAMOTO_CHEST = ITEMS.register("yamamoto_chest", ItemYamamotoChest::new);
    public static final RegistryObject<ArmorItem> YAMAMOTO_LEGGINGS = ITEMS.register("yamamoto_leggings", ItemYamamotoLeggings::new);
    public static final RegistryObject<ArmorItem> YAMAMOTO_BOOTS = ITEMS.register("yamamoto_boots", ItemYamamotoBoots::new);


    public static void register(IEventBus eventBus) {
        // レジストリをイベントバスに登録
        ITEMS.register(eventBus);
    }
}
