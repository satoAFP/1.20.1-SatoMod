package com.Sato.SatoMod.entity.tatumi;

import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class TatumiZombieRenderer extends MobRenderer<TatumiZombie, TatumiZombieModel<TatumiZombie>> {
    private static final ResourceLocation CUSTOM_ZOMBIE_TEXTURE = new ResourceLocation("satomod", "textures/entity/tatumi_model.png");

    public TatumiZombieRenderer(EntityRendererProvider.Context context) {
        super(context, new TatumiZombieModel<>(context.bakeLayer(ModelLayers.ZOMBIE)), 0.5F);

    }

    @Override
    public ResourceLocation getTextureLocation(TatumiZombie entity) {
        return CUSTOM_ZOMBIE_TEXTURE;
    }

}
