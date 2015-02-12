package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianShovel extends ItemSpade{

	public ObsidianShovel(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "ObsidianShovel");
		this.setUnlocalizedName("ObsidianShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
