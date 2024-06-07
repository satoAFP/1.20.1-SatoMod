package com.Sato.SatoMod.item.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class ItemYamamotoLeggings extends ArmorItem {
    public ItemYamamotoLeggings() {

        super(YamamoroArmorMaterials.YAMAMOTO_INGOT, Type.LEGGINGS, new Properties());
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.LEGS) {
            return "satomod:textures/models/armor/yamamoto_layer_2.png";
        } else {
            return "satomod:textures/models/armor/yamamoto_layer_1.png";
        }
    }
}
