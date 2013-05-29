package epic_jdog.invisimod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class InvisibarrierBlock extends Block{

    
    
    public InvisibarrierBlock(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
    }
    
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    
    @Override
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("Invisimod:Invisiblock");
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }
}
