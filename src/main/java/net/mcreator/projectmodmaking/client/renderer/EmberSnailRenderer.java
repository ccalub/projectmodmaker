package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.projectmodmaking.entity.EmberSnailEntity;

public class EmberSnailRenderer extends MobRenderer<EmberSnailEntity, SpiderModel<EmberSnailEntity>> {
	public EmberSnailRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmberSnailEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/ember_snail.png");
	}
}
