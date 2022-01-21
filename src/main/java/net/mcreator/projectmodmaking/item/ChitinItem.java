
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ChitinItem extends Item {
	public ChitinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("chitin");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
