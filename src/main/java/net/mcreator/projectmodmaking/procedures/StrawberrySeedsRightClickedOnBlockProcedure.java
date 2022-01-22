package net.mcreator.projectmodmaking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.projectmodmaking.init.ProjectmodmakingModItems;
import net.mcreator.projectmodmaking.init.ProjectmodmakingModBlocks;

public class StrawberrySeedsRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Blocks.FARMLAND == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ProjectmodmakingModBlocks.STRAWBERRYBUSH_1.defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ProjectmodmakingModItems.STRAWBERRY_SEEDS);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
