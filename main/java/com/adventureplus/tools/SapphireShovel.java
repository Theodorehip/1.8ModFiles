package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireShovel extends ItemSpade{

	public SapphireShovel(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "SapphireShovel");
		this.setUnlocalizedName("SapphireShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
