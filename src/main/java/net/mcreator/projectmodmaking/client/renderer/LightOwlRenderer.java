package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.projectmodmaking.entity.LightOwlEntity;
import net.mcreator.projectmodmaking.client.model.Modelcustom_model;

public class LightOwlRenderer extends MobRenderer<LightOwlEntity, Modelcustom_model<LightOwlEntity>> {
	public LightOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LightOwlEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/owllighttexture.png");
	}
}
