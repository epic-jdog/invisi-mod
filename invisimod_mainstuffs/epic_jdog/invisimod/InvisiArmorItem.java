package epic_jdog.invisimod;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;

public class InvisiArmorItem extends ItemArmor implements IArmorTextureProvider {
    
    public InvisiArmorItem(int id, EnumArmorMaterial material, int vlee, int armorslot) {
        super(id, material, armorslot, armorslot);
    }
    
    @Override
    public String getArmorTextureFile(ItemStack itemstack) {
        return "/mods/Invisimod/armor/Invisiarmor.png";
    }
    
    
}
