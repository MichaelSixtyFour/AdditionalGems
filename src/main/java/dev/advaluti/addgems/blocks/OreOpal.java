package dev.advaluti.addgems.blocks;

import dev.advaluti.addgems.AddGemsConfig;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreOpal extends Block {

    public OreOpal() {
            super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(AddGemsConfig.HarvestOpal.get())
        );
}
}
