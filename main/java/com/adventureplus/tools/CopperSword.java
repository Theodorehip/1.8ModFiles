package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperSword extends ItemSword{

	public CopperSword(ToolMaterial material) {
		super(material);
		//GameRegistry.registerItem(this, "CopperSword");
		this.setUnlocalizedName("CopperSword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
