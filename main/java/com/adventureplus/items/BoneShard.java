package com.adventureplus.items;

import net.minecraft.item.Item;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BoneShard extends Item {
	
	private final String name = "BoneShard";
	
	public BoneShard() {
		
		GameRegistry.registerItem(this, name);
		this.setUnlocalizedName(References.MODID + "_" + name);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
		
	}
	
	public String getName(){
		
		return name;
	}
}
