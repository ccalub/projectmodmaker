package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.projectmodmaking.entity.TerraOwlEntity;
import net.mcreator.projectmodmaking.client.model.Modelcustom_model;

public class TerraOwlRenderer extends MobRenderer<TerraOwlEntity, Modelcustom_model<TerraOwlEntity>> {
	public TerraOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TerraOwlEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/owllighttexture.png");
	}
}
