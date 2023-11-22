package com.monkeysquad.solaria.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import com.monkeysquad.solaria.init.SolariaModBlocks;

public class TelluriumBatteryUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SolariaModBlocks.SOLAR_PANNEL) {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world instanceof Level _lvl3 && _lvl3.isDay()) {
				world.setBlock(BlockPos.containing(x, y, z), SolariaModBlocks.BATTERY_1.defaultBlockState(), 3);
			}
		}
	}
}
