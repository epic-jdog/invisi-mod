package epic_jdog.invisimod.item.toolscombat;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class InvisiArmorItem extends ItemArmor implements IArmorTextureProvider {
    
    public InvisiArmorItem(int id, EnumArmorMaterial material, int vlee, int armorslot) {
        super(id, material, armorslot, armorslot);
    }
    
    @Override
    public String getArmorTextureFile(ItemStack itemstack) {
        return "/mods/Invisimod/armor/Invisiarmor.png";
    }
    
    
}
