package net.mcreator.projectmodmaking.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.projectmodmaking.init.ProjectmodmakingModBlocks;

public class StrawberrySeedsRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), ProjectmodmakingModBlocks.STRAWBERRY_BUSH.defaultBlockState(), 3);
	}
}
