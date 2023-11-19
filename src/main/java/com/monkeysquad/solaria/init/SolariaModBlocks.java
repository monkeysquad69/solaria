
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.monkeysquad.solaria.block.TelluriumoreBlock;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModBlocks {
	public static Block TELLURIUMORE;

	public static void load() {
		TELLURIUMORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "telluriumore"), new TelluriumoreBlock());
	}

	public static void clientLoad() {
		TelluriumoreBlock.clientInit();
	}
}
