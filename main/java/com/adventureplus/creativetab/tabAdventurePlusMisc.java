package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlusMisc extends CreativeTabs{
	
	public tabAdventurePlusMisc(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return Items.iron_ingot;
		//return ItemRegistry.ironGear;
	}
}
