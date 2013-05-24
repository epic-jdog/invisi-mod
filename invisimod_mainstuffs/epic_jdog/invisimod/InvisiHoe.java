package epic_jdog.invisimod;

import epic_jdog.invisimod.Invisimod;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class InvisiHoe extends ItemHoe
{


public InvisiHoe(int par1, EnumToolMaterial material)
{
super(par1, material); //The super constructor


}

    public boolean getIsRepairable(ItemStack tool, ItemStack repairItem)
    {
        return repairItem.itemID == Invisimod.invisidiamondItem.itemID;
    }


  
    
    
}
