package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianAxe extends ItemAxe{

	public ObsidianAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "ObsidianAxe");
		this.setUnlocalizedName("ObsidianAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
