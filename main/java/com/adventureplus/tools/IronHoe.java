package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronHoe extends ItemHoe{
	
	public IronHoe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "IronHoe");
		this.setUnlocalizedName("IronHoe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
