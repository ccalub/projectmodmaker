
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.projectmodmaking.init.ProjectmodmakingModTabs;

import java.util.List;

public class AntLarvaeItem extends Item {
	public AntLarvaeItem() {
		super(new Item.Properties().tab(ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER_2).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ant_larvae");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Spawns an ant!"));
	}
}
