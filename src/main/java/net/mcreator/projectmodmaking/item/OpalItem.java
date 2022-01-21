
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OpalItem extends Item {
	public OpalItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("opal");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
