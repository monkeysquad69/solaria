
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.monkeysquad.solaria.block.TelluriumOreBlock;
import com.monkeysquad.solaria.block.TelluriumBlockBlock;
import com.monkeysquad.solaria.block.RawTelluriumBlockBlock;
import com.monkeysquad.solaria.block.DeepslateTelluriumOreBlock;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModBlocks {
	public static Block DEEPSLATE_TELLURIUM_ORE;
	public static Block TELLURIUM_ORE;
	public static Block TELLURIUM_BLOCK;
	public static Block RAW_TELLURIUM_BLOCK;

	public static void load() {
		DEEPSLATE_TELLURIUM_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "deepslate_tellurium_ore"), new DeepslateTelluriumOreBlock());
		TELLURIUM_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_ore"), new TelluriumOreBlock());
		TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_block"), new TelluriumBlockBlock());
		RAW_TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "raw_tellurium_block"), new RawTelluriumBlockBlock());
	}

	public static void clientLoad() {
		DeepslateTelluriumOreBlock.clientInit();
		TelluriumOreBlock.clientInit();
		TelluriumBlockBlock.clientInit();
		RawTelluriumBlockBlock.clientInit();
	}
}
