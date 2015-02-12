package com.adventureplus.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class IronNugget extends Item{
	
	public IronNugget() {
		GameRegistry.registerItem(this, "IronNugget");
		this.setUnlocalizedName("IronNugget");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}

}
