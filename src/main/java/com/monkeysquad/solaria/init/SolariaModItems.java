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

import com.monkeysquad.solaria.item.TelluriumItem;
import com.monkeysquad.solaria.item.RawTelluriumItem;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModItems {
	public static Item RAW_TELLURIUM;
	public static Item TELLURIUM;
	public static Item TELLURIUMORE;

	public static void load() {
		RAW_TELLURIUM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "raw_tellurium"), new RawTelluriumItem());
		TELLURIUM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "tellurium"), new TelluriumItem());
		TELLURIUMORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SolariaMod.MODID, "telluriumore"), new BlockItem(SolariaModBlocks.TELLURIUMORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(TELLURIUMORE));
	}

	public static void clientLoad() {
	}
}
