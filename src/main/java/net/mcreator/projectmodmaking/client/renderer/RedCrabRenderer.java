package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.projectmodmaking.entity.RedCrabEntity;

public class RedCrabRenderer extends MobRenderer<RedCrabEntity, SpiderModel<RedCrabEntity>> {
	public RedCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedCrabEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/red_crab_texture.png");
	}
}
