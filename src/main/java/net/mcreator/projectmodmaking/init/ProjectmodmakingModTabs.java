
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ProjectmodmakingModTabs {
	public static CreativeModeTab TAB_PROJECT_MOD_MAKER;

	public static void load() {
		TAB_PROJECT_MOD_MAKER = new CreativeModeTab("tabproject_mod_maker") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ProjectmodmakingModItems.BOOKOF_BEASTS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
