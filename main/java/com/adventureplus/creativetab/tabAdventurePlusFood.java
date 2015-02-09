package com.adventureplus.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.adventureplus.registry.BlockRegistry;
import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlusFood extends CreativeTabs{
	
	public tabAdventurePlusFood(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return Items.potato;
		//return ItemRegistry.tomato;
	}
}
