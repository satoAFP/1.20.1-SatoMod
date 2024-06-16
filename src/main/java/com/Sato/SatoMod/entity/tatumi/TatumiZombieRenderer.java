package com.Sato.SatoMod.entity.tatumi;

import com.Sato.SatoMod.main.SatoMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TatumiZombieRenderer extends MobRenderer<TatumiZombie,TatumiZombieModel<TatumiZombie>> {

    private static final ResourceLocation TATUMI_ZOMBIE_LOCATION =
            new ResourceLocation(SatoMod.MOD_ID,
                    "textures/entity/tatumi_model.png");

    public TatumiZombieRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TatumiZombieModel<>(pContext.bakeLayer(TatumiZombieModel.LAYER_LOCATION)), 0.25f);//影の大きさ
    }

    @Override
    public ResourceLocation getTextureLocation(TatumiZombie tatumiZombie) {
        return TATUMI_ZOMBIE_LOCATION;
    }
}
