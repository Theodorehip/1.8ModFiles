package com.adventureplus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.adventureplus.registry.BlockRegistry;

public class tabAdventurePlusDeco extends CreativeTabs{
	
	public tabAdventurePlusDeco(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return Item.getItemFromBlock(Blocks.glowstone);
		//return Item.getItemFromBlock(BlockRegistry.lantern);
	}
}
