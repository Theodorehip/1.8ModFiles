package com.adventureplus.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class Rock extends Item {
	public Rock() {
		GameRegistry.registerItem(this, "Rock");
		this.setUnlocalizedName("Rock");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}