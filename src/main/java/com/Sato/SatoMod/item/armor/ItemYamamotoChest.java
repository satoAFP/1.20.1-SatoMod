package com.Sato.SatoMod.item.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.thread.EffectiveSide;
import org.jetbrains.annotations.Nullable;

public class ItemYamamotoChest extends ArmorItem {
    public ItemYamamotoChest() {

        super(YamamoroArmorMaterials.YAMAMOTO_INGOT, Type.CHESTPLATE, new Properties());
    }


    //テクスチャの設定
    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.LEGS) {
            return "satomod:textures/models/armor/yamamoto_layer_2.png";
        } else {
            return "satomod:textures/models/armor/yamamoto_layer_1.png";
        }
    }

}
