package com.adventureplus.items;

import net.minecraft.item.Item;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import com.adventureplus.registry.ItemRegistry;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BoneShard extends Item {
	
	public BoneShard() {
		
		GameRegistry.registerItem(this, "BoneShard");
		this.setUnlocalizedName("BoneShard");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
	
}
