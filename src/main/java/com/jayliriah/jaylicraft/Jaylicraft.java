package com.jayliriah.jaylicraft;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Jaylicraft.MODID)
public final class Jaylicraft {
	
	public static final String MODID = "jaylicraft";
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public Jaylicraft() {
		LOGGER.debug("Hello from Jaylicraft!");
	}
}
