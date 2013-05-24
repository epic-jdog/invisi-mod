package epic_jdog.invisimod;

import epic_jdog.invisimod.Invisimod;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class InvisiAxe extends ItemAxe
{


public InvisiAxe(int par1, EnumToolMaterial material)
{
super(par1, material); //The super constructor


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
