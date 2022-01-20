// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart wings;
	private final ModelPart feet;
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.wings = root.getChild("wings");
		this.feet = root.getChild("feet");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wings = partdefinition.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightwing_r1 = wings.addOrReplaceChild("rightwing_r1",
				CubeListBuilder.create().texOffs(18, 19).addBox(4.0F, -11.0F, -2.2F, 1.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, -0.0873F));

		PartDefinition leftwing_r1 = wings.addOrReplaceChild("leftwing_r1",
				CubeListBuilder.create().texOffs(0, 25).addBox(-5.0F, -11.0F, -2.2F, 1.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0873F));

		PartDefinition feet = partdefinition.addOrReplaceChild("feet",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-2.5F, -2.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -2.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 1)
						.addBox(0.5F, 0.0F, 1.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-3.5F, 0.0F, 1.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(-3.0F, -17.0F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(-4.0F, -18.0F, 4.3F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_r1 = bb_main.addOrReplaceChild("tail_r1",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-3.0F, -8.0F, -3.3F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.0F, -2.8F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition scarf_r1 = bb_main
				.addOrReplaceChild("scarf_r1",
						CubeListBuilder.create().texOffs(18, 7).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 4.0F, 6.0F,
								new CubeDeformation(0.4F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		wings.render(poseStack, buffer, packedLight, packedOverlay);
		feet.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}