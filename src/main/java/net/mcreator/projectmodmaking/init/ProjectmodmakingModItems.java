
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectmodmakingModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMBER_SNAIL = register(
			new SpawnEggItem(ProjectmodmakingModEntities.EMBER_SNAIL, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("ember_snail_spawn_egg"));
	public static final Item LIGHT_OWL = register(
			new SpawnEggItem(ProjectmodmakingModEntities.LIGHT_OWL, -9808060, -12766687, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("light_owl_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
