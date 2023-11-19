
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

import com.monkeysquad.solaria.world.features.ores.TelluriumOreFeature;
import com.monkeysquad.solaria.world.features.ores.DeepslateTelluriumOreFeature;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModFeatures {
	public static void load() {
		register("deepslate_tellurium_ore", new DeepslateTelluriumOreFeature(), DeepslateTelluriumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tellurium_ore", new TelluriumOreFeature(), TelluriumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(SolariaMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(SolariaMod.MODID, registryName)));
	}
}
