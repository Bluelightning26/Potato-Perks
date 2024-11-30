package net.pengi.potatoperks;

import net.fabricmc.api.ModInitializer;

import net.pengi.potatoperks.block.ModBlocks;
import net.pengi.potatoperks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoPerks implements ModInitializer {
	public static final String MOD_ID = "potatoperks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}