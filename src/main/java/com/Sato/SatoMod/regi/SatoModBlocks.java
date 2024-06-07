package com.Sato.SatoMod.regi;

import com.Sato.SatoMod.block.BlockSatoIngotBlock;
import com.Sato.SatoMod.block.ore.BlockDeepslateYamamotoOre;
import com.Sato.SatoMod.block.ore.BlockYamamotoOre;
import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SatoModBlocks {

    public static class Blocks {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SatoMod.MOD_ID);
        public static final RegistryObject<Block> SATO_INGOT_BLOCK = BLOCKS.register("sato_ingot_block", BlockSatoIngotBlock::new);
        public static final RegistryObject<Block> YAMAMOTO_ORE_BLOCK = BLOCKS.register("yamamoto_ore_block", BlockYamamotoOre::new);
        public static final RegistryObject<Block> DEEPSLATE_YAMAMOTO_ORE_BLOCK = BLOCKS.register("deepslate_yamamoto_ore_block", BlockDeepslateYamamotoOre::new);

    }


    public static class BlockItems {

        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SatoMod.MOD_ID);
        public static final RegistryObject<Item> SATO_INGOT_BLOCK = BLOCK_ITEMS.register("sato_ingot_block",
                () -> new BlockItem(Blocks.SATO_INGOT_BLOCK.get(), new Item.Properties().fireResistant()));
        public static final RegistryObject<Item> YAMAMOTO_ORE_BLOCK = BLOCK_ITEMS.register("yamamoto_ore_block",
                () -> new BlockItem(Blocks.YAMAMOTO_ORE_BLOCK.get(), new Item.Properties().fireResistant()));
        public static final RegistryObject<Item> DEEPSLATE_YAMAMOTO_ORE_BLOCK = BLOCK_ITEMS.register("deepslate_yamamoto_ore_block",
                () -> new BlockItem(Blocks.DEEPSLATE_YAMAMOTO_ORE_BLOCK.get(), new Item.Properties().fireResistant()));
    }


}
