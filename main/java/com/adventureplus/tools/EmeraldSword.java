package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmeraldSword extends ItemSword{

	public EmeraldSword(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "EmeraldSword");
		this.setUnlocalizedName("EmeraldSword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}