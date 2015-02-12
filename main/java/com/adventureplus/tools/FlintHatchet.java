package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FlintHatchet extends ItemAxe{

	public FlintHatchet(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "FlintHatchet");
		this.setUnlocalizedName("FlintHatchet");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
