package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireHoe extends ItemHoe{
	
	public SapphireHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "SapphireHoe");
		this.setUnlocalizedName("SapphireHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
