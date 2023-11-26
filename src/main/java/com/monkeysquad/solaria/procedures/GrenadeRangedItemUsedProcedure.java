package com.monkeysquad.solaria.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class GrenadeRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == (int) (7 * 20)) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
