package dev.advaluti.addgems.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

public class ModSetup {

    public static final ItemGroup ADDGEMS_GROUP = new ItemGroup("addgems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.BLOCKONYX.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {

    }
}
