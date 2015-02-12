package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperHoe extends ItemHoe{
	
	public CopperHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "CopperHoe");
		this.setUnlocalizedName("CopperHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
