package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianSword extends ItemSword{

	public ObsidianSword(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "ObsidianSword");
		this.setUnlocalizedName("ObsidianSword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
