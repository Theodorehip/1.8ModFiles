package com.adventureplus.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import com.adventureplus.registry.ItemRegistry;

public class SapphireArmor extends ItemArmor {

	public SapphireArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusArmor);

	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == ItemRegistry.armorSapphireHelm
				|| itemstack.getItem() == ItemRegistry.armorSapphireChest
				|| itemstack.getItem() == ItemRegistry.armorSapphireBoots) {

			return References.MODID + ":textures/model/sapphire_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorSapphireLegs) {

			return References.MODID + ":textures/model/sapphire_layer_2.png";

		} else
			return null;

	}
}