package com.Sato.SatoMod.datagen.client;

import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionItemModelProvider extends ItemModelProvider {
    public IntroductionItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SatoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        basicItem(SatoModItems.SATO_INGOT.get());
        basicItem(SatoModItems.SATO_SHOVEL.get());
        basicItem(SatoModItems.SATO_HOE.get());
        basicItem(SatoModItems.SATO_PICKAXE.get());
        basicItem(SatoModItems.SATO_SWORD.get());
        basicItem(SatoModItems.SATO_AXE.get());
        basicItem(SatoModItems.YAMAMOTO_INGOT.get());
        basicItem(SatoModItems.RAW_YAMAMOTO.get());
        basicItem(SatoModItems.YAMAMOTO_HELMET.get());
        basicItem(SatoModItems.YAMAMOTO_CHEST.get());
        basicItem(SatoModItems.YAMAMOTO_LEGGINGS.get());
        basicItem(SatoModItems.YAMAMOTO_BOOTS.get());
        basicItem(SatoModItems.SUGER_FIST.get());


    }

    public void itemWithBlock(RegistryObject<Block> block) {
        this.getBuilder(ForgeRegistries.BLOCKS.getKey(block.get()).getPath())
                .parent(new ModelFile.UncheckedModelFile(
                        SatoMod.MOD_ID + ":block/" +
                                ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    public void trapdoor(RegistryObject<Block> block) {
        this.getBuilder(ForgeRegistries.BLOCKS.getKey(block.get()).getPath())
                .parent(new ModelFile.UncheckedModelFile(
                        SatoMod.MOD_ID + ":block/" +
                                ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }
    public void fence(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(SatoMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void button(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(SatoMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private void sapling(RegistryObject<Block> block) {
        this.withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SatoMod.MOD_ID,"block/" + block.getId().getPath()));
    }

}
