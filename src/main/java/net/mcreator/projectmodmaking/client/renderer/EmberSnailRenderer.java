package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.projectmodmaking.entity.EmberSnailEntity;
import net.mcreator.projectmodmaking.client.model.Modeltirkys;

public class EmberSnailRenderer extends MobRenderer<EmberSnailEntity, Modeltirkys<EmberSnailEntity>> {
	public EmberSnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltirkys(context.bakeLayer(Modeltirkys.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmberSnailEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/ember_snail.png");
	}
}
