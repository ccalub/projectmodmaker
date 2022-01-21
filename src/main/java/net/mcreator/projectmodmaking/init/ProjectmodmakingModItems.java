
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

import net.mcreator.projectmodmaking.item.RawCrabLegsItem;
import net.mcreator.projectmodmaking.item.OpalItem;
import net.mcreator.projectmodmaking.item.FireChitinItem;
import net.mcreator.projectmodmaking.item.FireChitinArmorItem;
import net.mcreator.projectmodmaking.item.FireAntLArvaeItem;
import net.mcreator.projectmodmaking.item.CritterCatalogueItem;
import net.mcreator.projectmodmaking.item.CookedCrabLegsItem;
import net.mcreator.projectmodmaking.item.ChitinItem;
import net.mcreator.projectmodmaking.item.ChitinArmorItem;
import net.mcreator.projectmodmaking.item.BookofBeastsItem;
import net.mcreator.projectmodmaking.item.AntLarvaeItem;

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
	public static final Item ANT_LARVAE = register(new AntLarvaeItem());
	public static final Item FIRE_CHITIN = register(new FireChitinItem());
	public static final Item FIRE_CHITIN_ARMOR_HELMET = register(new FireChitinArmorItem.Helmet());
	public static final Item FIRE_CHITIN_ARMOR_CHESTPLATE = register(new FireChitinArmorItem.Chestplate());
	public static final Item FIRE_CHITIN_ARMOR_LEGGINGS = register(new FireChitinArmorItem.Leggings());
	public static final Item FIRE_CHITIN_ARMOR_BOOTS = register(new FireChitinArmorItem.Boots());
	public static final Item FIRE_ANT_L_ARVAE = register(new FireAntLArvaeItem());
	public static final Item RED_CRAB = register(new SpawnEggItem(ProjectmodmakingModEntities.RED_CRAB, -4503737, -6544605,
			new Item.Properties().tab(ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER_2)).setRegistryName("red_crab_spawn_egg"));
	public static final Item ORANGE_CRAB = register(new SpawnEggItem(ProjectmodmakingModEntities.ORANGE_CRAB, -26266, -39424,
			new Item.Properties().tab(ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER_2)).setRegistryName("orange_crab_spawn_egg"));
	public static final Item GREEN_CRAB = register(new SpawnEggItem(ProjectmodmakingModEntities.GREEN_CRAB, -3342439, -6711040,
			new Item.Properties().tab(ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER_2)).setRegistryName("green_crab_spawn_egg"));
	public static final Item RAW_CRAB_LEGS = register(new RawCrabLegsItem());
	public static final Item COOKED_CRAB_LEGS = register(new CookedCrabLegsItem());
	public static final Item CRITTER_CATALOGUE = register(new CritterCatalogueItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
