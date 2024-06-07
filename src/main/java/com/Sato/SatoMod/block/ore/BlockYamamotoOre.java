package com.Sato.SatoMod.block.ore;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class BlockYamamotoOre extends Block {
    public BlockYamamotoOre() {
        super(Properties.of()
                .strength(3.0f,500)  //ブロックの耐久地　爆発耐性
                //.sound(SoundType.ANVIL)               //設置音
                .lightLevel((a)->5)                  //光源レベル
                .requiresCorrectToolForDrops()        //破壊できるツール
        );
    }

    //破壊した時に呼ばれる関数
    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
        //爆発処理
        if (!state.is(newState.getBlock())) {
            world.explode(null, pos.getX(), pos.getY(), pos.getZ(), 2.0F, Level.ExplosionInteraction.BLOCK);
        }
        super.onRemove(state, world, pos, newState, isMoving);
    }
}
