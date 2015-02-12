package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianHoe extends ItemHoe{
	
	public ObsidianHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "ObsidianHoe");
		this.setUnlocalizedName("ObsidianHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
