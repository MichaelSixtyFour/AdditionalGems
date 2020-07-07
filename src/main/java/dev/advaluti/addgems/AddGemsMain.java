package dev.advaluti.addgems;

import dev.advaluti.addgems.setup.AddGemsConfig;
import dev.advaluti.addgems.setup.ClientSetup;
import dev.advaluti.addgems.setup.ModSetup;
import dev.advaluti.addgems.setup.Registration;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AddGemsMain.MOD_ID)
public class AddGemsMain {

    public static final String MOD_ID = "addgems";

    private static final Logger LOGGER = LogManager.getLogger();

    public AddGemsMain() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AddGemsConfig.spec);

        Registration.init();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Registration::modSetup);
    }
}
