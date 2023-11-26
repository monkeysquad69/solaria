
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import com.monkeysquad.solaria.entity.GrenadeEntity;
import com.monkeysquad.solaria.SolariaMod;

public class SolariaModEntities {
	public static EntityType<GrenadeEntity> GRENADE;

	public static void load() {
		GRENADE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(SolariaMod.MODID, "grenade"), createArrowEntityType(GrenadeEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
