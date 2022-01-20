
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ProjectmodmakingModTabs {
	public static CreativeModeTab TAB_PROJECT_MOD_MAKER;
	public static CreativeModeTab TAB_AAAAAAAAHHHH;

	public static void load() {
		TAB_PROJECT_MOD_MAKER = new CreativeModeTab("tabproject_mod_maker") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AIR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAAAAAAAHHHH = new CreativeModeTab("tabaaaaaaaahhhh") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AMETHYST_CLUSTER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
