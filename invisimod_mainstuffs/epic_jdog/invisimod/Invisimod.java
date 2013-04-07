package epic_jdog.invisimod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
@Mod(modid=Invisimod.modID, name="Invisimod", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Invisimod {
        
    private final static Item invisidustItem = new InvisidustItem(7055).setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(63).setUnlocalizedName("Invisidust");
    public static final String modID="Invisimod";
        // The instance of your mod that Forge uses.
        @Instance("Invisimod")
        public static Invisimod instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="epic_jdog.invisimod.ClientProxy", serverSide="epic_jdog.invisimod.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderInformation();
        
                LanguageRegistry.addName(invisidustItem,"Invisi-Dust");
        
                ItemStack glowstoneStack = new ItemStack(Item.lightStoneDust);
                ItemStack gunpowdahStack = new ItemStack(Item.gunpowder);
                ItemStack goldenCarrotStack = new ItemStack(Item.goldenCarrot);

                GameRegistry.addRecipe(new ItemStack(Invisimod.invisidustItem), "x  ", "  y", " z ",
                        'x', glowstoneStack, 'y', gunpowdahStack, 'z', goldenCarrotStack);
        
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}