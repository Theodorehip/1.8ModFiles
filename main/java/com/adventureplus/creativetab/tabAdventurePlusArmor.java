package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlusArmor extends CreativeTabs{
	
	public tabAdventurePlusArmor(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return ItemRegistry.boneShard;
		//return ItemRegistry.armorObsidianChest;
	}
}
