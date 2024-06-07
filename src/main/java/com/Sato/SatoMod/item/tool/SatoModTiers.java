package com.Sato.SatoMod.item.tool;

import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModItems;
import com.Sato.SatoMod.regi.SatoModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class SatoModTiers {
    //tooltierの作成
    public static final ForgeTier SATO_INGOT=new ForgeTier(5,50,10.0f,3.0f,30, SatoModTags.Blocks.NEEDS_SATO_INGOT_TOOL,()-> Ingredient.of(SatoModItems.SATO_INGOT.get()));

    //tierのソート
    static {
        TierSortingRegistry.registerTier(SATO_INGOT,new ResourceLocation(SatoMod.MOD_ID,"sato_ingot"), List.of(Tiers.NETHERITE),List.of());
    }


}


