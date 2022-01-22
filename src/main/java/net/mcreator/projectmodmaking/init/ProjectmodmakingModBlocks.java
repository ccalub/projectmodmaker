
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

import net.mcreator.projectmodmaking.block.StrawberryBushBlock;
import net.mcreator.projectmodmaking.block.StrawberryBush3Block;
import net.mcreator.projectmodmaking.block.StrawberryBush2Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectmodmakingModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block STRAWBERRY_BUSH = register(new StrawberryBushBlock());
	public static final Block STRAWBERRY_BUSH_2 = register(new StrawberryBush2Block());
	public static final Block STRAWBERRY_BUSH_3 = register(new StrawberryBush3Block());

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
			StrawberryBushBlock.registerRenderLayer();
			StrawberryBush2Block.registerRenderLayer();
			StrawberryBush3Block.registerRenderLayer();
		}
	}
}
