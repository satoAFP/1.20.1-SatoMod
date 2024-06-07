package com.Sato.SatoMod.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.util.thread.EffectiveSide;

@Mod.EventBusSubscriber(modid = "satomod", bus = Bus.FORGE, value = Dist.CLIENT)
public class ArmorEffectHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (event.phase == TickEvent.Phase.END && EffectiveSide.get().isServer()) {
            // プレイヤーがカスタム防具を装着しているかをチェック
            ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
            ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

            if (head.getItem() instanceof ItemYamamotoHelmet &&
                    chest.getItem() instanceof ItemYamamotoChest &&
                    legs.getItem() instanceof ItemYamamotoLeggings &&
                    feet.getItem() instanceof ItemYamamotoBoots) {

                // ポーション効果を付与
//                effect: 付与する効果のタイプ。
//                duration: 効果の持続時間（ティック単位）。
//                amplifier: 効果の強さ。
//                ambient: アンビエント効果かどうか。
//                visible: 効果が画面に表示されるかどうか。
//                showIcon: 効果のアイコンを表示するかどうか。
                player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 20, 1, false, false));
            }
        }
    }
}
