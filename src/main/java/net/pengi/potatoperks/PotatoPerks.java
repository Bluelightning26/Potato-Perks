package net.pengi.potatoperks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.pengi.potatoperks.block.ModBlocks;
import net.pengi.potatoperks.item.ModItems;
import net.pengi.potatoperks.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoPerks implements ModInitializer {
	public static final String MOD_ID = "potatoperks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//Orange Potato fuel, V = ticks
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_POTATO_BLOCK, 6000);

		//World Gen Alteration
		ModWorldGeneration.generateModWorldGen();
	}
}