package net.mcreator.projectmodmaking.client.renderer;

public class EmberSnailRenderer extends MobRenderer<EmberSnailEntity, Modeltirkys<EmberSnailEntity>> {

	public EmberSnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltirkys(context.bakeLayer(Modeltirkys.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(EmberSnailEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/ember_snail.png");
	}

}
