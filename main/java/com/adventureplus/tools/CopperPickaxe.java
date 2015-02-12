package com.adventureplus.tools;


import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperPickaxe extends ItemPickaxe{

	public CopperPickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "CopperPickaxe");
		this.setUnlocalizedName("CopperPickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
