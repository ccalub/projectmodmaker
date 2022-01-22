
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.projectmodmaking.block.Trawberrybush3Block;
import net.mcreator.projectmodmaking.block.Strawberrybush4Block;
import net.mcreator.projectmodmaking.block.Strawberrybush2Block;
import net.mcreator.projectmodmaking.block.Strawberrybush1Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectmodmakingModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block STRAWBERRYBUSH_1 = register(new Strawberrybush1Block());
	public static final Block STRAWBERRYBUSH_2 = register(new Strawberrybush2Block());
	public static final Block TRAWBERRYBUSH_3 = register(new Trawberrybush3Block());
	public static final Block STRAWBERRYBUSH_4 = register(new Strawberrybush4Block());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Strawberrybush1Block.registerRenderLayer();
			Strawberrybush2Block.registerRenderLayer();
			Trawberrybush3Block.registerRenderLayer();
			Strawberrybush4Block.registerRenderLayer();
		}
	}
}
