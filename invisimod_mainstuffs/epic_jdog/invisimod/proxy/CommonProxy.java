package epic_jdog.invisimod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
    public void registerRenderInformation() {
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
    
    public void registerTiles() {
        
    }
    
    public void registerBlocks() {
        
    }
    
    public void addNames() {
        
    }
    
    public void addRecipes() {
        
    }
}

