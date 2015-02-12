package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireAxe extends ItemAxe{

	public SapphireAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "SapphireAxe");
		this.setUnlocalizedName("SapphireAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
