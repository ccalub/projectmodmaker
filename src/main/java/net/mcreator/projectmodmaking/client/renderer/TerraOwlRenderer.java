package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.projectmodmaking.entity.TerraOwlEntity;

public class TerraOwlRenderer extends MobRenderer<TerraOwlEntity, ChickenModel<TerraOwlEntity>> {
	public TerraOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TerraOwlEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/owllighttexture.png");
	}
}
