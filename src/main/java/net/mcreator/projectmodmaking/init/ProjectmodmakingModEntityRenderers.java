
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.projectmodmaking.client.renderer.TerraOwlRenderer;
import net.mcreator.projectmodmaking.client.renderer.EmberSnailRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectmodmakingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ProjectmodmakingModEntities.EMBER_SNAIL, EmberSnailRenderer::new);
		event.registerEntityRenderer(ProjectmodmakingModEntities.TERRA_OWL, TerraOwlRenderer::new);
	}
}
