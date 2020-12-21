package com.jusipat.learningfabric;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class GunpowderBlock extends Block {
	public GunpowderBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack itemStack = player.getMainHandStack();
		if(itemStack.getItem().equals(Items.FLINT)) {
			//System.out.println("Debug true");
			world.setBlockState(pos.offset(Direction.UP), Blocks.FIRE.getDefaultState());
		}

		return super.onUse(state, world, pos, player, hand, hit);
	}
}
