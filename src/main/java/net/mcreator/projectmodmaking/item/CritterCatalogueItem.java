
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CritterCatalogueItem extends Item {
	public CritterCatalogueItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("critter_catalogue");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
