package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmeraldHoe extends ItemHoe{
	
	public EmeraldHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "EmeraldHoe");
		this.setUnlocalizedName("EmeraldHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
