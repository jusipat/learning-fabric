package com.jusipat.learningfabric;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

public class CreeperHeartItem extends Item {

	public CreeperHeartItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
		if(hand ==Hand.MAIN_HAND) {
			System.out.println("On hand");
		}
		if(hand ==hand.OFF_HAND) {
			System.out.println("Off hand");
		}
		return super.use(world, playerEntity, hand);
	}
}
