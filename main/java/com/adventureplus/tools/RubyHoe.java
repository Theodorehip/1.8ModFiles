package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyHoe extends ItemHoe{
	
	public RubyHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "RubyHoe");
		this.setUnlocalizedName("RubyHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
