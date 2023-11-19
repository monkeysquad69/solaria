/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import com.monkeysquad.solaria.item.TelluriumIngotItem;
import com.monkeysquad.solaria.item.RawTelluriumItem;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModItems {
	public static Item DEEPSLATE_TELLURIUM_ORE;
	public static Item TELLURIUM_ORE;
	public static Item TELLURIUM_INGOT;
	public static Item RAW_TELLURIUM;
	public static Item TELLURIUM_BLOCK;
	public static Item RAW_TELLURIUM_BLOCK;

	public static void load() {
		DEEPSLATE_TELLURIUM_ORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "deepslate_tellurium_ore"), new BlockItem(SolariaModBlocks.DEEPSLATE_TELLURIUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(DEEPSLATE_TELLURIUM_ORE));
		TELLURIUM_ORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "tellurium_ore"), new BlockItem(SolariaModBlocks.TELLURIUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(TELLURIUM_ORE));
		TELLURIUM_INGOT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "tellurium_ingot"), new TelluriumIngotItem());
		RAW_TELLURIUM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "raw_tellurium"), new RawTelluriumItem());
		TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "tellurium_block"), new BlockItem(SolariaModBlocks.TELLURIUM_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(TELLURIUM_BLOCK));
		RAW_TELLURIUM_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "raw_tellurium_block"), new BlockItem(SolariaModBlocks.RAW_TELLURIUM_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(RAW_TELLURIUM_BLOCK));
	}

	public static void clientLoad() {
	}
}
