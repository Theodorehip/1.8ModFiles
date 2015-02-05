package com.adventureplus.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import com.adventureplus.registry.ItemRegistry;

public class ObsidianArmor extends ItemArmor {

	public ObsidianArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusArmor);
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == ItemRegistry.armorObsidianHelm
				|| itemstack.getItem() == ItemRegistry.armorObsidianChest
				|| itemstack.getItem() == ItemRegistry.armorObsidianBoots) {

			return References.MODID + ":textures/model/obsidian_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorObsidianLegs) {

			return References.MODID + ":textures/model/obsidian_layer_2.png";

		} else
			return null;

	}
}
