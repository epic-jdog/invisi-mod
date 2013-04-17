package epic_jdog.invisimod;

import epic_jdog.invisimod.Invisimod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class InvisiaxeItem extends ItemAxe {
    public InvisiaxeItem(int id, EnumToolMaterial material) {
        super(id, material);
    }
    
    
    public boolean getIsRepairable(ItemStack tool, ItemStack repairItem)
    {
        return repairItem.itemID == Invisimod.invisidiamondItem.itemID;
    }


    public Item setUnlocalizedName(String string) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
