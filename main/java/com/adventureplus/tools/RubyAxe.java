package com.adventureplus.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class RubyAxe extends ItemAxe{

	public RubyAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "RubyAxe");
		this.setUnlocalizedName("RubyAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
