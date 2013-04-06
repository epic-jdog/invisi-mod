package epic_jdog.invisimod;

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

@Mod(modid=Invisimod.modID, name="Invisimod", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Invisimod {
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
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}