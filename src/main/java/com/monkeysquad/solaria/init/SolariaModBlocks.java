
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
import com.monkeysquad.solaria.block.TelluriumBatteryFullBlock;
import com.monkeysquad.solaria.block.TelluriumBatteryBlock;
import com.monkeysquad.solaria.block.SolarPannelBlock;
import com.monkeysquad.solaria.block.RawTelluriumBlockBlock;
import com.monkeysquad.solaria.block.DeepslateTelluriumOreBlock;
import com.monkeysquad.solaria.block.Battery3Block;
import com.monkeysquad.solaria.block.Battery2Block;
import com.monkeysquad.solaria.block.Battery1Block;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModBlocks {
	public static Block DEEPSLATE_TELLURIUM_ORE;
	public static Block TELLURIUM_ORE;
	public static Block TELLURIUM_BLOCK;
	public static Block RAW_TELLURIUM_BLOCK;
	public static Block TELLURIUM_BATTERY;
	public static Block BATTERY_1;
	public static Block BATTERY_2;
	public static Block BATTERY_3;
	public static Block TELLURIUM_BATTERY_FULL;
	public static Block SOLAR_PANNEL;

	public static void load() {
		DEEPSLATE_TELLURIUM_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "deepslate_tellurium_ore"), new DeepslateTelluriumOreBlock());
		TELLURIUM_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_ore"), new TelluriumOreBlock());
		TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_block"), new TelluriumBlockBlock());
		RAW_TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "raw_tellurium_block"), new RawTelluriumBlockBlock());
		TELLURIUM_BATTERY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_battery"), new TelluriumBatteryBlock());
		BATTERY_1 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "battery_1"), new Battery1Block());
		BATTERY_2 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "battery_2"), new Battery2Block());
		BATTERY_3 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "battery_3"), new Battery3Block());
		TELLURIUM_BATTERY_FULL = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "tellurium_battery_full"), new TelluriumBatteryFullBlock());
		SOLAR_PANNEL = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SolariaMod.MODID, "solar_pannel"), new SolarPannelBlock());
	}

	public static void clientLoad() {
		DeepslateTelluriumOreBlock.clientInit();
		TelluriumOreBlock.clientInit();
		TelluriumBlockBlock.clientInit();
		RawTelluriumBlockBlock.clientInit();
		TelluriumBatteryBlock.clientInit();
		Battery1Block.clientInit();
		Battery2Block.clientInit();
		Battery3Block.clientInit();
		TelluriumBatteryFullBlock.clientInit();
		SolarPannelBlock.clientInit();
	}
}
