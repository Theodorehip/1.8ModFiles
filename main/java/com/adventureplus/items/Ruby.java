package com.adventureplus.items;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Ruby extends Item {
	public Ruby() {
		
		GameRegistry.registerItem(this, "Ruby");
		this.setUnlocalizedName("Ruby");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}
