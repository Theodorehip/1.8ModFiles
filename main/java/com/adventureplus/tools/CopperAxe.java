package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperAxe extends ItemAxe{

	public CopperAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "CopperAxe");
		this.setUnlocalizedName("CopperAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
