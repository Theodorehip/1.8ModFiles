package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.adventureplus.registry.BlockRegistry;
import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlus extends CreativeTabs{
	
	public tabAdventurePlus(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return ItemRegistry.boneShard;
		//return Item.getItemFromBlock(BlockRegistry.millstoneIdle);
	}
}
