package com.adventureplus.items;

import net.minecraft.item.Item;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BoneShard extends Item {
	
	private final String name = "boneShard";
	
	public BoneShard() {
		
		GameRegistry.registerItem(this, name);
		this.setUnlocalizedName("boneShard");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
		this.setMaxStackSize(64);
		
	}
	
	public String getName(){
		
		return name;
	}
}
