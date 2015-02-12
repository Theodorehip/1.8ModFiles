package com.adventureplus.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class Flax extends Item {
	public Flax() {
		GameRegistry.registerItem(this, "Flax");
		this.setUnlocalizedName("Flax");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}
