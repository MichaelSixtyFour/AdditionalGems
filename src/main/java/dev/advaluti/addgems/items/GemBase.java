package dev.advaluti.addgems.items;

import dev.advaluti.addgems.setup.ModSetup;
import net.minecraft.item.Item;

public class GemBase extends Item {

    public GemBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.ADDGEMS_GROUP)
        );
    }
}
