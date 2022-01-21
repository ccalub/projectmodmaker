
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.projectmodmaking.item.OpalItem;
import net.mcreator.projectmodmaking.item.ChitinItem;
import net.mcreator.projectmodmaking.item.ChitinArmorItem;
import net.mcreator.projectmodmaking.item.BookofBeastsItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectmodmakingModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMBER_SNAIL = register(
			new SpawnEggItem(ProjectmodmakingModEntities.EMBER_SNAIL, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("ember_snail_spawn_egg"));
	public static final Item BOOKOF_BEASTS = register(new BookofBeastsItem());
	public static final Item TERRA_OWL = register(
			new SpawnEggItem(ProjectmodmakingModEntities.TERRA_OWL, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("terra_owl_spawn_egg"));
	public static final Item CHITIN = register(new ChitinItem());
	public static final Item CHITIN_ARMOR_HELMET = register(new ChitinArmorItem.Helmet());
	public static final Item CHITIN_ARMOR_CHESTPLATE = register(new ChitinArmorItem.Chestplate());
	public static final Item CHITIN_ARMOR_LEGGINGS = register(new ChitinArmorItem.Leggings());
	public static final Item CHITIN_ARMOR_BOOTS = register(new ChitinArmorItem.Boots());
	public static final Item OPAL = register(new OpalItem());
	public static final Item OPAL_ORE = register(ProjectmodmakingModBlocks.OPAL_ORE, ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
