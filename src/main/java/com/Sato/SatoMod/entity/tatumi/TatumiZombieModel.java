package com.Sato.SatoMod.entity.tatumi;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;

public class TatumiZombieModel <T extends Monster> extends HumanoidModel<T> {
    public TatumiZombieModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();

        // Define the model parts here

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
