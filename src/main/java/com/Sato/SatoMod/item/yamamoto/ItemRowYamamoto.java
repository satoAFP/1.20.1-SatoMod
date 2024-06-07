package com.Sato.SatoMod.item.yamamoto;

import com.Sato.SatoMod.regi.SatoModTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemRowYamamoto extends Item {

    public ItemRowYamamoto() {
        super(new Properties().stacksTo(64));
    }

    @SubscribeEvent
    public static void onExplosionDetonate(ExplosionEvent.Detonate event) {


        event.getAffectedEntities().removeIf(entity ->
                entity instanceof net.minecraft.world.entity.item.ItemEntity itemEntity &&
                        itemEntity.getItem().getItem() instanceof ItemRowYamamoto
        );
    }
}
