package com.adventureplus.tools;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class RubySword extends ItemSword{

	public RubySword(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "RubySword");
		this.setUnlocalizedName("RubySword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
