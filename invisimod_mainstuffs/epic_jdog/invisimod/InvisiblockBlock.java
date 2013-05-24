package epic_jdog.invisimod;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class InvisiblockBlock extends BlockGlass {

    public InvisiblockBlock(int id, Material material) {
        super(id, material, false);
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("Invisimod:Invisiblock");
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 1;
    }

}