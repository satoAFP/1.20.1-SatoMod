package com.Sato.SatoMod.item.tool;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "satomod")
public class ToolSugerFistSword  extends SwordItem {
    public ToolSugerFistSword() {
        super(SatoModTiers.SATO_INGOT, 6, -3.0f, new Properties());
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack=player.getItemInHand(hand);

        if (stack.getItem() instanceof ToolSugerFistSword && !world.isClientSide) {
            Vec3 lookVec = player.getLookAngle();
            double speed = 2.0; // 前方への移動速度

            // プレイヤーが見ている方向に運動を適用
            player.setDeltaMovement(player.getDeltaMovement().add(lookVec.x * speed, 0, lookVec.z * speed));
            player.hurtMarked = true; // プレイヤーを「ダメージを受けた」状態にして動きを同期

            // サウンドを再生し、パーティクルを生成
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDER_DRAGON_FLAP, player.getSoundSource(), 1.0F, 1.0F);
            for (int i = 0; i < 10; i++) {
                world.addParticle(ParticleTypes.CLOUD, player.getX(), player.getY() + player.getBbHeight() / 2.0, player.getZ(), lookVec.x * 0.1, 0.1, lookVec.z * 0.1);
            }
        }

        return InteractionResultHolder.consume(stack);
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        // 攻撃を受けたエンティティを取得
        if (event.getSource().getEntity() instanceof Player) {
            Player player = (Player) event.getSource().getEntity();
            ItemStack weapon = player.getMainHandItem();

            // 手に持っているアイテムがカスタム剣かどうかチェック
            if (weapon.getItem() instanceof ToolSugerFistSword) {
                // プレイヤーに付与されている増強体力効果を取得
                MobEffectInstance currentEffect = player.getEffect(MobEffects.ABSORPTION);

                // 現在の効果が存在しないか、効果レベルが6未満の場合にのみ増強体力を付与
                if (currentEffect == null || currentEffect.getAmplifier() < 2) {  // レベルは0ベースなので5でチェック
                    player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200,
                            currentEffect != null ? currentEffect.getAmplifier() + 1 : 0));
                }
            }
        }
    }
}
