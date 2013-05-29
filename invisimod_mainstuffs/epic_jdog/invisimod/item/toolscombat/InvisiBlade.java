package epic_jdog.invisimod.item.toolscombat;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;


public class InvisiBlade extends ItemSword
{


public InvisiBlade(int ID, EnumToolMaterial material)
{
super(ID, material); //The super constructor


}

//If it can be repaired
public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
{
return 7061 == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
}
}