
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.monkeysquad.solaria.init;

import com.monkeysquad.solaria.procedures.TelluriumBatteryUpdateTickProcedure;
import com.monkeysquad.solaria.procedures.Batterycharge3Procedure;
import com.monkeysquad.solaria.procedures.Batterycharge2Procedure;
import com.monkeysquad.solaria.procedures.Batterycharge1Procedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class SolariaModProcedures {
	public static void load() {
		new TelluriumBatteryUpdateTickProcedure();
		new Batterycharge1Procedure();
		new Batterycharge2Procedure();
		new Batterycharge3Procedure();
	}
}
