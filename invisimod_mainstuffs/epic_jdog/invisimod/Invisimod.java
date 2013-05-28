package epic_jdog.invisimod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import epic_jdog.invisimod.item.InvisidiamondItem;
import epic_jdog.invisimod.item.InvisidustItem;
import epic_jdog.invisimod.item.toolscombat.InvisiArmorItem;
import epic_jdog.invisimod.item.toolscombat.InvisiAxe;
import epic_jdog.invisimod.item.toolscombat.InvisiHoe;
import epic_jdog.invisimod.item.toolscombat.InvisiPickaxe;
import epic_jdog.invisimod.item.toolscombat.InvisiShovel;
import epic_jdog.invisimod.networking.ServerPacketHandler;
import epic_jdog.invisimod.networking.ClientPacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import epic_jdog.invisimod.proxy.CommonProxy;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.block.EnumMobType;

@Mod(modid = Invisimod.modID, name = "Invisimod", version = "0.0.5")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "Invisimod" }, packetHandler = ClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "Invisimod" }, packetHandler = ServerPacketHandler.class))
public class Invisimod {

    public static EnumToolMaterial InvisibladeMat = EnumHelper.addToolMaterial(
            "Invisiblade", 3, 900, 7.8F, 3, 15);
    public static EnumToolMaterial InvisiaxeMat = EnumHelper.addToolMaterial(
            "Invisiaxe", 3, 250, 6.0F, 2, 14);

    public static Item invisiBlade = new InvisiBlade(7061, InvisibladeMat)
            .setUnlocalizedName("Invisiblade");

    private final static Item invisidustItem = new InvisidustItem(7055)
            .setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(63)
            .setUnlocalizedName("Invisidust");
    public final static Item invisidiamondItem = new InvisidiamondItem(7060)
            .setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(63)
            .setUnlocalizedName("Invisidiamond");

    private final static Item invisihelmetItem = new InvisiArmorItem(7056,
            EnumArmorMaterial.DIAMOND, ModLoader.addArmor("Invisiarmor"), 0)
            .setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName(
                    "Invisihelmet");
    private final static Item invisichestplateItem = new InvisiArmorItem(7057,
            EnumArmorMaterial.DIAMOND, ModLoader.addArmor("Invisiarmor"), 1)
            .setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName(
                    "Invisichestplate");
    private final static Item invisileggingsItem = new InvisiArmorItem(7058,
            EnumArmorMaterial.DIAMOND, ModLoader.addArmor("Invisiarmor"), 2)
            .setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName(
                    "Invisileggings");
    private final static Item invisibootsItem = new InvisiArmorItem(7059,
            EnumArmorMaterial.DIAMOND, ModLoader.addArmor("Invisiarmor"), 3)
            .setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName(
                    "Invisiboots");

    public static Item invisiAxe = new InvisiAxe(7062, InvisiaxeMat)
            .setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(
                    "InvisiAxe");
    public static Item invisiHoe = new InvisiHoe(7063, InvisiaxeMat)
            .setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(
                    "InvisiHoe");
    public static Item invisiPickaxe = new InvisiPickaxe(7064, InvisiaxeMat)
            .setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(
                    "InvisiPickaxe");
    public static Item invisiShovel = new InvisiShovel(7065, InvisiaxeMat)
            .setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(
                    "InvisiShovel");

    private final static Block invisiblockBlock = new InvisiblockBlock(1500,
            Material.rock).setCreativeTab(CreativeTabs.tabMisc).setHardness(2F)
            .setResistance(11).setUnlocalizedName("Invisiblock");

    private final static Block invisiplateBlock = new InvisiplateBlock(1501,
            "Invisimod:Invisiblock", Material.circuits, EnumMobType.everything)
            .setCreativeTab(CreativeTabs.tabRedstone).setHardness(2F)
            .setResistance(11).setUnlocalizedName("Invisiplate");

    public static final String modID = "Invisimod";
    // The instance of your mod that Forge uses.
    @Instance("Invisimod")
    public static Invisimod instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "epic_jdog.invisimod.proxy.ClientProxy", serverSide = "epic_jdog.invisimod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
    }

    @Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderInformation();

        LanguageRegistry.addName(invisidustItem, "Invisidust");
        LanguageRegistry.addName(invisiblockBlock, "Invisiblock");
        LanguageRegistry.addName(invisihelmetItem, "Invisisuit Helmet");
        LanguageRegistry.addName(invisiplateBlock, "Invisiplate");
        LanguageRegistry.addName(invisichestplateItem, "Invisisuit Chestplate");
        LanguageRegistry.addName(invisileggingsItem, "Invisisuit Leggings");
        LanguageRegistry.addName(invisibootsItem, "Invisisuit Boots");
        LanguageRegistry.addName(invisidiamondItem, "Invisidiamond");
        LanguageRegistry.addName(invisiBlade, "Invisiblade");
        LanguageRegistry.addName(invisiAxe, "Invisiaxe");
        LanguageRegistry.addName(invisiPickaxe, "Invisipickaxe");
        LanguageRegistry.addName(invisiHoe, "Invisihoe?!");
        LanguageRegistry.addName(invisiShovel, "Invisishovel");

        ItemStack diamondStack = new ItemStack(Item.diamond);
        ItemStack invisidiamondStack = new ItemStack(invisidiamondItem);
        ItemStack invisidustStack = new ItemStack(invisidustItem);
        ItemStack netherrackStack = new ItemStack(Block.netherrack);
        ItemStack cobbleStack = new ItemStack(Block.cobblestone);
        ItemStack stoneStack = new ItemStack(Block.stone);
        ItemStack glowstoneStack = new ItemStack(Item.lightStoneDust);
        ItemStack gunpowdahStack = new ItemStack(Item.gunpowder);
        ItemStack goldenCarrotStack = new ItemStack(Item.goldenCarrot);

        GameRegistry.registerBlock(invisiblockBlock, "invisiblockBlock");
        GameRegistry.registerBlock(invisiplateBlock, "invisiplateBlock");

        GameRegistry.addRecipe(new ItemStack(Invisimod.invisidustItem), "x  ",
                "  y", " z ", 'x', glowstoneStack, 'y', gunpowdahStack, 'z',
                goldenCarrotStack);

        GameRegistry.addShapelessRecipe(new ItemStack(invisiblockBlock),
                netherrackStack, invisidustStack);
        GameRegistry.addShapelessRecipe(new ItemStack(invisiblockBlock),
                cobbleStack, invisidustStack);
        GameRegistry.addShapelessRecipe(new ItemStack(invisiblockBlock),
                stoneStack, invisidustStack);
        GameRegistry.addShapelessRecipe(invisidiamondStack, diamondStack,
                invisidustStack);

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }
}