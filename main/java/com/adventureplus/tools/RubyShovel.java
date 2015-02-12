package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyShovel extends ItemSpade{

	public RubyShovel(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "RubyShovel");
		this.setUnlocalizedName("RubyShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
