package net.mcreator.projectmodmaking.client.renderer;

public class ToadRenderer extends MobRenderer<ToadEntity, SlimeModel<ToadEntity>> {

	public ToadRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ToadEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/gltf_embedded_0.png");
	}

}
