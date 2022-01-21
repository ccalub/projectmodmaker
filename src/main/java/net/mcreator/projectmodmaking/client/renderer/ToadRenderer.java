package net.mcreator.projectmodmaking.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.projectmodmaking.entity.ToadEntity;

public class ToadRenderer extends MobRenderer<ToadEntity, SlimeModel<ToadEntity>> {
	public ToadRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToadEntity entity) {
		return new ResourceLocation("projectmodmaking:textures/gltf_embedded_0.png");
	}
}
