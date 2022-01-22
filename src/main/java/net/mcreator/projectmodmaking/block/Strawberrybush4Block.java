
package net.mcreator.projectmodmaking.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.projectmodmaking.init.ProjectmodmakingModItems;
import net.mcreator.projectmodmaking.init.ProjectmodmakingModBlocks;

import java.util.List;
import java.util.Collections;

public class Strawberrybush4Block extends Block {
	public Strawberrybush4Block() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRASS).strength(1f, 10f).noCollission().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("strawberrybush_4");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ProjectmodmakingModItems.STRAWBERRY));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ProjectmodmakingModBlocks.STRAWBERRYBUSH_4, renderType -> renderType == RenderType.cutout());
	}
}
