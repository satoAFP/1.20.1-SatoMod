package com.Sato.SatoMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockSatoIngotBlock extends Block {
    public BlockSatoIngotBlock() {
        super(Properties.of()
                .strength(2.0f,50)  //ブロックの耐久地　爆発耐性
                //.sound(SoundType.ANVIL)               //設置音
                .lightLevel((a)->15)                  //光源レベル
                .requiresCorrectToolForDrops()        //破壊できるツール
        );
    }
}
