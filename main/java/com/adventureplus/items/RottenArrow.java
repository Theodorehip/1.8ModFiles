package com.adventureplus.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class RottenArrow extends Item{
	
	public RottenArrow() {
		GameRegistry.registerItem(this, "RottenArrow");
		this.setUnlocalizedName("RottenArrow");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}

}
