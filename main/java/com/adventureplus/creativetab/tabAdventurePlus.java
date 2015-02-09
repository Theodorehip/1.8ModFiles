package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.adventureplus.registry.BlockRegistry;
import com.adventureplus.registry.ItemRegistry;

public class tabAdventurePlus extends CreativeTabs{
	
	public tabAdventurePlus(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return Item.getItemFromBlock(Blocks.furnace);
		//return Item.getItemFromBlock(BlockRegistry.millstoneIdle);
	}
}
