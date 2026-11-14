package de.manuel.notacryptominer;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotACryptoMiner implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("notacryptominer");

    @Override
    public void onInitialize() {
        LOGGER.info("Ich bin kein Cryptominer. Ehrlich.");
    }
}