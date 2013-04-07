package epic_jdog.invisimod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class InvisidustItem extends Item {

    public InvisidustItem(int par1) {
        super(par1);
        // TODO Auto-generated constructor stub
    }
    
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Invisimod:invisidust");
    }



}
