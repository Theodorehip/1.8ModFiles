package com.adventureplus.items;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Sapphire extends Item {
	public Sapphire() {
		
		GameRegistry.registerItem(this, "Sapphire");
		this.setUnlocalizedName("Sapphire");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}
