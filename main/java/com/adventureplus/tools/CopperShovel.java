package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperShovel extends ItemSpade{

	public CopperShovel(ToolMaterial material) {
		super(material);
		
		GameRegistry.registerItem(this, "CopperShovel");
		this.setUnlocalizedName("CopperShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
