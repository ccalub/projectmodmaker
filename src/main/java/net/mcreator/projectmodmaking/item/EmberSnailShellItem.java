
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class EmberSnailShellItem extends Item {
	public EmberSnailShellItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ember_snail_shell");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
