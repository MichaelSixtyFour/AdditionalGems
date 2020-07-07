package dev.advaluti.addgems.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class AddGemsConfig {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_GEMS = "gems";

    public static final String CATEGORY_AMETHYST = "amethyst";
    public static final String CATEGORY_ONYX = "onyx";
    public static final String CATEGORY_PERIDOT = "peridot";
    public static final String CATEGORY_RUBY = "ruby";
    public static final String CATEGORY_SAPPHIRE = "sapphire";
    public static final String CATEGORY_TOPAZ = "topaz";

    public static ForgeConfigSpec spec;

    public static ForgeConfigSpec.BooleanValue enableOreGen;

    public static ForgeConfigSpec.BooleanValue enableAmethyst;
    public static ForgeConfigSpec.IntValue VSAmethyst;
    public static ForgeConfigSpec.IntValue VPCAmethyst;
    public static ForgeConfigSpec.IntValue MinHeightAmethyst;
    public static ForgeConfigSpec.IntValue MaxHeightAmethyst;

    public static ForgeConfigSpec.BooleanValue enableOnyx;
    public static ForgeConfigSpec.IntValue VSOnyx;
    public static ForgeConfigSpec.IntValue VPCOnyx;
    public static ForgeConfigSpec.IntValue MinHeightOnyx;
    public static ForgeConfigSpec.IntValue MaxHeightOnyx;

    public static ForgeConfigSpec.BooleanValue enablePeridot;
    public static ForgeConfigSpec.IntValue VSPeridot;
    public static ForgeConfigSpec.IntValue VPCPeridot;
    public static ForgeConfigSpec.IntValue MinHeightPeridot;
    public static ForgeConfigSpec.IntValue MaxHeightPeridot;

    public static ForgeConfigSpec.BooleanValue enableRuby;
    public static ForgeConfigSpec.IntValue VSRuby;
    public static ForgeConfigSpec.IntValue VPCRuby;
    public static ForgeConfigSpec.IntValue MinHeightRuby;
    public static ForgeConfigSpec.IntValue MaxHeightRuby;

    public static ForgeConfigSpec.BooleanValue enableSapphire;
    public static ForgeConfigSpec.IntValue VSSapphire;
    public static ForgeConfigSpec.IntValue VPCSapphire;
    public static ForgeConfigSpec.IntValue MinHeightSapphire;
    public static ForgeConfigSpec.IntValue MaxHeightSapphire;

    public static ForgeConfigSpec.BooleanValue enableTopaz;
    public static ForgeConfigSpec.IntValue VSTopaz;
    public static ForgeConfigSpec.IntValue VPCTopaz;
    public static ForgeConfigSpec.IntValue MinHeightTopaz;
    public static ForgeConfigSpec.IntValue MaxHeightTopaz;

    public static ForgeConfigSpec.IntValue HarvestAmethyst;
    public static ForgeConfigSpec.IntValue HarvestOnyx;
    public static ForgeConfigSpec.IntValue HarvestPeridot;
    public static ForgeConfigSpec.IntValue HarvestSapphire;
    public static ForgeConfigSpec.IntValue HarvestTopaz;
    public static ForgeConfigSpec.IntValue HarvestRuby;

    static {

        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        BUILDER.comment("General settings").push(CATEGORY_GENERAL);
        enableOreGen = BUILDER.comment("Enable all ore generation (default: true)").define("enableOreGen", true);
        BUILDER.pop();

        BUILDER.comment("Gems").push(CATEGORY_GEMS);

            BUILDER.comment("Amethyst settings").push(CATEGORY_AMETHYST);
            enableAmethyst = BUILDER.comment("Enable Amethyst ore generation (default: true)").define("enableAmethyst", true);
            VSAmethyst = BUILDER.comment("Vein size").defineInRange("VSAmethyst",4, 0, 50);
            VPCAmethyst = BUILDER.comment("Veins per chunk").defineInRange("VPCAmethyst",2, 0, 50);
            MinHeightAmethyst = BUILDER.comment("Minimum height").defineInRange("MinHeightAmethyst",2, 0, 255);
            MaxHeightAmethyst = BUILDER.comment("Maximum height").defineInRange("MaxHeightAmethyst",16, 0, 255);
            HarvestAmethyst = BUILDER.comment("Harvest level").defineInRange("HarvestAmethyst",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Onyx settings").push(CATEGORY_ONYX);
            enableOnyx = BUILDER.comment("Enable Onyx ore generation (default: true)").define("enableOnyx", true);
            VSOnyx = BUILDER.comment("Vein size").defineInRange("VSOnyx",4, 0, 50);
            VPCOnyx = BUILDER.comment("Veins per chunk").defineInRange("VPCOnyx",2, 0, 50);
            MinHeightOnyx = BUILDER.comment("Minimum height").defineInRange("MinHeightOnyx",2, 0, 255);
            MaxHeightOnyx = BUILDER.comment("Maximum height").defineInRange("MaxHeightOnyx",16, 0, 255);
            HarvestOnyx = BUILDER.comment("Harvest level").defineInRange("HarvestOnyx",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Peridot settings").push(CATEGORY_PERIDOT);
            enablePeridot = BUILDER.comment("Enable Peridot ore generation (default: true)").define("enablePeridot", true);
            VSPeridot = BUILDER.comment("Vein size").defineInRange("VSPeridot",4, 0, 50);
            VPCPeridot = BUILDER.comment("Veins per chunk").defineInRange("VPCPeridot",2, 0, 50);
            MinHeightPeridot = BUILDER.comment("Minimum height").defineInRange("MinHeightPeridot",2, 0, 255);
            MaxHeightPeridot = BUILDER.comment("Maximum height").defineInRange("MaxHeightPeridot",16, 0, 255);
            HarvestPeridot = BUILDER.comment("Harvest level").defineInRange("HarvestPeridot",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Ruby settings").push(CATEGORY_RUBY);
            enableRuby = BUILDER.comment("Enable Ruby ore generation (default: true)").define("enableRuby", true);
            VSRuby = BUILDER.comment("Vein size").defineInRange("VSRuby",4, 0, 50);
            VPCRuby = BUILDER.comment("Veins per chunk").defineInRange("VPCRuby",2, 0, 50);
            MinHeightRuby = BUILDER.comment("Minimum height").defineInRange("MinHeightRuby",2, 0, 255);
            MaxHeightRuby = BUILDER.comment("Maximum height").defineInRange("MaxHeightRuby",16, 0, 255);
            HarvestRuby = BUILDER.comment("Harvest level").defineInRange("HarvestRuby",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Sapphire settings").push(CATEGORY_SAPPHIRE);
            enableSapphire = BUILDER.comment("Enable Sapphire ore generation (default: true)").define("enableSapphire", true);
            VSSapphire = BUILDER.comment("Vein size").defineInRange("VSSapphire",4, 0, 50);
            VPCSapphire = BUILDER.comment("Veins per chunk").defineInRange("VPCSapphire",2, 0, 50);
            MinHeightSapphire = BUILDER.comment("Minimum height").defineInRange("MinHeightSapphire",2, 0, 255);
            MaxHeightSapphire = BUILDER.comment("Maximum height").defineInRange("MaxHeightSapphire",16, 0, 255);
            HarvestSapphire = BUILDER.comment("Harvest level").defineInRange("HarvestSapphire",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Topaz settings").push(CATEGORY_TOPAZ);
            enableTopaz = BUILDER.comment("Enable Topaz ore generation (default: true)").define("enableTopaz", true);
            VSTopaz = BUILDER.comment("Vein size").defineInRange("VSTopaz",4, 0, 50);
            VPCTopaz = BUILDER.comment("Veins per chunk").defineInRange("VPCTopaz",2, 0, 50);
            MinHeightTopaz = BUILDER.comment("Minimum height").defineInRange("MinHeightTopaz",2, 0, 255);
            MaxHeightTopaz = BUILDER.comment("Maximum height").defineInRange("MaxHeightTopaz",16, 0, 255);
            HarvestTopaz = BUILDER.comment("Harvest level").defineInRange("HarvestTopaz",2, 0, 4);
            BUILDER.pop();

        BUILDER.pop();

        spec = BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
