package com.jusipat.learningfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryRemovedCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LearningFabric implements ModInitializer {

	public static final String MOD_ID = "lf";

	//Blocks
	private static final Block GUNPOWDER_BLOCK = new GunpowderBlock(FabricBlockSettings.of(Material.SOIL));


	//Items
	private static final Item CREEPER_HEART = new CreeperHeartItem(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(32));
	private static final Item GUNPOWDER_BLOCK_ITEM = new BlockItem(GUNPOWDER_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS));



	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("lf", "creeper_heart"), CREEPER_HEART);
		Registry.register(Registry.BLOCK, new Identifier("lf", "gunpowder_block"), GUNPOWDER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("lf", "gunpowder_block"), GUNPOWDER_BLOCK_ITEM);

	}
}
