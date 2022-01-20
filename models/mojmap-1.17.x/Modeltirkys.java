// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltirkys<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tirkys"), "main");
	private final ModelPart shell;
	private final ModelPart body;

	public Modeltirkys(ModelPart root) {
		this.shell = root.getChild("shell");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition shell = partdefinition.addOrReplaceChild("shell",
				CubeListBuilder.create().texOffs(0, 9)
						.addBox(2.0F, -5.1584F, 0.9336F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(16, 9)
						.addBox(6.0F, -3.1584F, 1.9336F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(15, 0)
						.addBox(1.0F, -3.1584F, 1.9336F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-4.0F, 22.0F, -2.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r1 = shell
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.0664F, -3.1584F, -5.0F, 1.0F, 3.0F, 2.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(12, 9)
						.addBox(1.0F, -4.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-2.0F, -4.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 17)
						.addBox(1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 5)
						.addBox(-2.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		shell.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}
}