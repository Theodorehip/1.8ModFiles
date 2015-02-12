package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianPickaxe extends ItemPickaxe{

	public ObsidianPickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "ObsidianPickaxe");
		this.setUnlocalizedName("ObsidianPickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}

