package epic_jdog.invisimod;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class InvisiArmorItem extends ItemArmor{

    public InvisiArmorItem(int id, EnumArmorMaterial material,
            int vlee, int armorslot) {
        super(id, material, armorslot, armorslot);
        // TODO Auto-generated constructor stub
    }
public String getArmorTextureFile (ItemStack itemstack) {
    return "/mods/Invisimod/armor/invisiarmor_1.png";
}






}
