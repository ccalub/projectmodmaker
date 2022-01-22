package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.projectmodmaking.entity.OrangeCrabEntity;
import net.mcreator.projectmodmaking.client.model.Modelcustom_model;

public class OrangeCrabRenderer extends MobRenderer<OrangeCrabEntity, Modelcustom_model<OrangeCrabEntity>> {
	public OrangeCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeCrabEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/orange_crab_texture.png");
	}
}
