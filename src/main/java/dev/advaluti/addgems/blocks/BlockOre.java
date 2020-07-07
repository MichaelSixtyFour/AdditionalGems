package dev.advaluti.addgems.blocks;

import dev.advaluti.addgems.AddGemsMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOre extends Block {

    public BlockOre() {
        super(Properties.create(Material.ROCK));
        setRegistryName(AddGemsMain.MOD_ID, "ore");
    }
}
