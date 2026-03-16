package com.example.template;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.MOD_NAME, version = ExampleMod.VERSION)
public final class ExampleMod {

    public static final String MOD_ID = "example_mod";
    public static final String MOD_NAME = "Example Mod";
    public static final String VERSION = "1.0.0";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public ExampleMod() {
    }
}
