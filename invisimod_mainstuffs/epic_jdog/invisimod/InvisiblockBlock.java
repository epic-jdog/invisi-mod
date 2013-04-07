package epic_jdog.invisimod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class InvisiblockBlock extends Block {

        public InvisiblockBlock (int id, Material material) {
                super(id, material);
        }
        
        @Override
        public void registerIcons(IconRegister iconRegister)
        {
            blockIcon = iconRegister.registerIcon("Invisimod:Invisiblock");
        }

}