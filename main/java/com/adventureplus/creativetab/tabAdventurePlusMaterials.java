package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlusMaterials extends CreativeTabs{
	
	public tabAdventurePlusMaterials(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return null;
		//return ItemRegistry.obsidianDust;
	}
}
