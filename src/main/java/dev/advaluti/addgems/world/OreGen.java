package dev.advaluti.addgems.world;

import dev.advaluti.addgems.setup.AddGemsConfig;
import dev.advaluti.addgems.setup.Registration;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void OreGenerate() {
        for(Biome biome : ForgeRegistries.BIOMES) {

            //GEMS
            if(AddGemsConfig.enableAmethyst.get()) {
                ConfiguredPlacement AmethystGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCAmethyst.get(), AddGemsConfig.MinHeightAmethyst.get(), 0, AddGemsConfig.MaxHeightAmethyst.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREAMETHYST.get().getDefaultState(), AddGemsConfig.VSAmethyst.get())).withPlacement(AmethystGen));
            }

            if(AddGemsConfig.enableOnyx.get()) {
                ConfiguredPlacement OnyxGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCOnyx.get(), AddGemsConfig.MinHeightOnyx.get(), 0, AddGemsConfig.MaxHeightOnyx.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREONYX.get().getDefaultState(), AddGemsConfig.VSOnyx.get())).withPlacement(OnyxGen));
            }

            if(AddGemsConfig.enablePeridot.get()) {
                ConfiguredPlacement PeridotGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCPeridot.get(), AddGemsConfig.MinHeightPeridot.get(), 0, AddGemsConfig.MaxHeightPeridot.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREPERIDOT.get().getDefaultState(), AddGemsConfig.VSPeridot.get())).withPlacement(PeridotGen));
            }

            if(AddGemsConfig.enableRuby.get()) {
                ConfiguredPlacement RubyGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCRuby.get(), AddGemsConfig.MinHeightRuby.get(), 0, AddGemsConfig.MaxHeightRuby.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORERUBY.get().getDefaultState(), AddGemsConfig.VSRuby.get())).withPlacement(RubyGen));
            }

            if(AddGemsConfig.enableSapphire.get()) {
                ConfiguredPlacement SapphireGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCSapphire.get(), AddGemsConfig.MinHeightSapphire.get(), 0, AddGemsConfig.MaxHeightSapphire.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESAPPHIRE.get().getDefaultState(), AddGemsConfig.VSSapphire.get())).withPlacement(SapphireGen));
            }

            if(AddGemsConfig.enableTopaz.get()) {
                ConfiguredPlacement TopazGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(AddGemsConfig.VPCTopaz.get(), AddGemsConfig.MinHeightTopaz.get(), 0, AddGemsConfig.MaxHeightTopaz.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETOPAZ.get().getDefaultState(), AddGemsConfig.VSTopaz.get())).withPlacement(TopazGen));
            }

        }
    }
}
