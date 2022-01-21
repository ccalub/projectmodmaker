package net.mcreator.projectmodmaking.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("projectmodmaking", "modelcustom_model"),
			"main");
	public final ModelPart body;
	public final ModelPart legs;
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-3.0F, -2.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-4.0F, -2.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leg8_r1 = legs.addOrReplaceChild("leg8_r1",
				CubeListBuilder.create().texOffs(12, 8).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -0.5F, 4.5F, -0.3491F, 0.6545F, -0.5236F));
		PartDefinition leg7_r1 = legs.addOrReplaceChild("leg7_r1",
				CubeListBuilder.create().texOffs(12, 10).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -0.5F, 4.5F, -0.3491F, -0.6545F, 0.5236F));
		PartDefinition leg6_r1 = legs.addOrReplaceChild("leg6_r1",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -0.5F, 2.5F, -0.1309F, 0.2618F, -0.3927F));
		PartDefinition leg5_r1 = legs.addOrReplaceChild("leg5_r1",
				CubeListBuilder.create().texOffs(14, 6).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -0.5F, 2.5F, -0.1309F, -0.2618F, 0.3927F));
		PartDefinition leg4_r1 = legs.addOrReplaceChild("leg4_r1",
				CubeListBuilder.create().texOffs(15, 13).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -0.5F, 0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition leg3_r1 = legs.addOrReplaceChild("leg3_r1",
				CubeListBuilder.create().texOffs(8, 14).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leg2_r1 = legs.addOrReplaceChild("leg2_r1",
				CubeListBuilder.create().texOffs(15, 15).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -0.5F, -1.5F, 0.2182F, -0.5672F, -0.4363F));
		PartDefinition leg1_r1 = legs.addOrReplaceChild("leg1_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -0.5F, -1.5F, 0.2182F, 0.5672F, 0.4363F));
		PartDefinition bb_main = partdefinition
				.addOrReplaceChild(
						"bb_main", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -6.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(1.0F, -6.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		legs.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
