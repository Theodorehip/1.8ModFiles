package com.adventureplus.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import com.adventureplus.registry.ItemRegistry;

public class RubyArmor extends ItemArmor {

	public RubyArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusArmor);
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == ItemRegistry.armorRubyHelm
				|| itemstack.getItem() == ItemRegistry.armorRubyChest
				|| itemstack.getItem() == ItemRegistry.armorRubyBoots) {

			return References.MODID + ":textures/model/ruby_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorRubyLegs) {

			return References.MODID + ":textures/model/ruby_layer_2.png";

		} else
			return null;

	}
}
