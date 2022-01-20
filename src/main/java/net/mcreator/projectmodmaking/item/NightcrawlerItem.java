
package net.mcreator.projectmodmaking.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class NightcrawlerItem extends Item {

	public NightcrawlerItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("nightcrawler");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Used to tame owls."));
	}

}
