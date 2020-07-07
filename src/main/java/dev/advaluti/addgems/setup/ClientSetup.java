package dev.advaluti.addgems.setup;

import dev.advaluti.addgems.AddGemsMain;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onTooltipPre(RenderTooltipEvent.Pre event) {
        Item item = event.getStack().getItem();
        if (item.getRegistryName().getNamespace().equals(AddGemsMain.MOD_ID)) {
            event.setMaxWidth(200);
        }
    }
}
