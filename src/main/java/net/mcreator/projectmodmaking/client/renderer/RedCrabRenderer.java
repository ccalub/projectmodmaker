package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.projectmodmaking.entity.RedCrabEntity;
import net.mcreator.projectmodmaking.client.model.Modelcustom_model;

public class RedCrabRenderer extends MobRenderer<RedCrabEntity, Modelcustom_model<RedCrabEntity>> {
	public RedCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedCrabEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/red_crab_texture.png");
	}
}
