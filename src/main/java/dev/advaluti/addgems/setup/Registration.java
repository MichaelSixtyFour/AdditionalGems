package dev.advaluti.addgems.setup;

import dev.advaluti.addgems.blocks.*;
import dev.advaluti.addgems.items.GemBase;
import dev.advaluti.addgems.world.OreGen;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.advaluti.addgems.AddGemsMain.MOD_ID;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //GEMS
    public static final RegistryObject<GemBase> GEMAMETHYST = ITEMS.register("gemamethyst", GemBase::new);
    public static final RegistryObject<GemBase> GEMONYX = ITEMS.register("gemonyx", GemBase::new);
    public static final RegistryObject<GemBase> GEMPERIDOT = ITEMS.register("gemperidot", GemBase::new);
    public static final RegistryObject<GemBase> GEMSAPPHIRE = ITEMS.register("gemsapphire", GemBase::new);
    public static final RegistryObject<GemBase> GEMTOPAZ = ITEMS.register("gemtopaz", GemBase::new);
    public static final RegistryObject<GemBase> GEMRUBY = ITEMS.register("gemruby", GemBase::new);

    //GEM ORES
    public static final RegistryObject<OreAmethyst> OREAMETHYST = BLOCKS.register("oreamethyst", OreAmethyst::new);
    public static final RegistryObject<Item> OREAMETHYST_ITEM = ITEMS.register("oreamethyst", () -> new BlockItem(OREAMETHYST.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<OreOnyx> OREONYX = BLOCKS.register("oreonyx", OreOnyx::new);
    public static final RegistryObject<Item> OREONYX_ITEM = ITEMS.register("oreonyx", () -> new BlockItem(OREONYX.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<OrePeridot> OREPERIDOT = BLOCKS.register("oreperidot", OrePeridot::new);
    public static final RegistryObject<Item> OREPERIDOT_ITEM = ITEMS.register("oreperidot", () -> new BlockItem(OREPERIDOT.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<OreSapphire> ORESAPPHIRE = BLOCKS.register("oresapphire", OreSapphire::new);
    public static final RegistryObject<Item> ORESAPPHIRE_ITEM = ITEMS.register("oresapphire", () -> new BlockItem(ORESAPPHIRE.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<OreTopaz> ORETOPAZ = BLOCKS.register("oretopaz", OreTopaz::new);
    public static final RegistryObject<Item> ORETOPAZ_ITEM = ITEMS.register("oretopaz", () -> new BlockItem(ORETOPAZ.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<OreRuby> ORERUBY = BLOCKS.register("oreruby", OreRuby::new);
    public static final RegistryObject<Item> ORERUBY_ITEM = ITEMS.register("oreruby", () -> new BlockItem(ORERUBY.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    //GEM BLOCKS

    public static final RegistryObject<GemBlockBase> BLOCKAMETHYST = BLOCKS.register("blockamethyst", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKAMETHYST_ITEM = ITEMS.register("blockamethyst", () -> new BlockItem(BLOCKAMETHYST.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<GemBlockBase> BLOCKONYX = BLOCKS.register("blockonyx", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKONYX_ITEM = ITEMS.register("blockonyx", () -> new BlockItem(BLOCKONYX.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<GemBlockBase> BLOCKPERIDOT = BLOCKS.register("blockperidot", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKPERIDOT_ITEM = ITEMS.register("blockperidot", () -> new BlockItem(BLOCKPERIDOT.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<GemBlockBase> BLOCKSAPPHIRE = BLOCKS.register("blocksapphire", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKSAPPHIRE_ITEM = ITEMS.register("blocksapphire", () -> new BlockItem(BLOCKSAPPHIRE.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<GemBlockBase> BLOCKTOPAZ = BLOCKS.register("blocktopaz", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKTOPAZ_ITEM = ITEMS.register("blocktopaz", () -> new BlockItem(BLOCKTOPAZ.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    public static final RegistryObject<GemBlockBase> BLOCKRUBY = BLOCKS.register("blockruby", GemBlockBase::new);
    public static final RegistryObject<Item> BLOCKRUBY_ITEM = ITEMS.register("blockruby", () -> new BlockItem(BLOCKRUBY.get(), new Item.Properties().group(ModSetup.ADDGEMS_GROUP)));

    //ORE GEN
    public static void modSetup(final FMLCommonSetupEvent event) {
        OreGen.OreGenerate();
    }

}
