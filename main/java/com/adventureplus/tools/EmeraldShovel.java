package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmeraldShovel extends ItemSpade{

	public EmeraldShovel(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "EmeraldShovel");
		this.setUnlocalizedName("EmeraldShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
