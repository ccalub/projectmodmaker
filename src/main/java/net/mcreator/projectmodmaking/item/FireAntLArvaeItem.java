
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

public class FireAntLArvaeItem extends Item {
	public FireAntLArvaeItem() {
		super(new Item.Properties().tab(ProjectmodmakingModTabs.TAB_PROJECT_MOD_MAKER_2).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("fire_ant_l_arvae");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Used to spawn a fire ant!"));
	}
}
