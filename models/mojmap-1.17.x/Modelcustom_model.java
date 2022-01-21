// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart legs;
	private final ModelPart mane;

	public Modelcustom_model(ModelPart root) {
		this.legs = root.getChild("legs");
		this.mane = root.getChild("mane");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(21, 13)
						.addBox(-3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 1.0F, 0.0F, 1.0F, -5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, 1.0F, 0.0F, 1.0F, -5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, 1.0F, 6.0F, 1.0F, -7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 1.0F, 6.0F, 1.0F, -7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(0.0F, -6.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 20)
						.addBox(-3.0F, -6.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, -5.0F));

		PartDefinition body = legs.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(18, 0)
						.addBox(-2.0F, -6.0F, 6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(-2.0F, -4.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -6.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-2.0F, -7.0F, 3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 9)
						.addBox(-2.0F, -8.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, -13.0F, 7.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
						.addBox(0.0F, -14.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(-3.0F, -14.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 11)
						.addBox(-2.0F, -12.0F, 8.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -9.0F, 8.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.0F, -10.0F, 11.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-1.5F, -15.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, -7.0F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = legs.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(14, 17)
						.addBox(-1.5F, -8.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
						.addBox(-1.5F, -3.0F, 0.0F, 1.0F, -3.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(19, 20)
						.addBox(-1.5F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition mane = partdefinition.addOrReplaceChild("mane",
				CubeListBuilder.create().texOffs(16, 5)
						.addBox(-3.0F, -12.0F, 6.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(-3.0F, -9.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legs.render(poseStack, buffer, packedLight, packedOverlay);
		mane.render(poseStack, buffer, packedLight, packedOverlay);
	}
}