
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.monkeysquad.solaria.client.model.Modelgrenade;

@Environment(EnvType.CLIENT)
public class SolariaModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelgrenade.LAYER_LOCATION, Modelgrenade::createBodyLayer);
	}
}
