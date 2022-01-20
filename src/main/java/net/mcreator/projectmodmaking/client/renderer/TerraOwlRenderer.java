package net.mcreator.projectmodmaking.client.renderer;

public class TerraOwlRenderer extends MobRenderer<TerraOwlEntity, Modelcustom_model<TerraOwlEntity>> {

	public TerraOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TerraOwlEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/owllighttexture.png");
	}

}
