package com.adventureplus.registry;

import net.minecraft.init.Items;

import com.adventureplus.handler.ModifyingHandler;

public class TabsRegistry {
	
	public static void RemoveCreativeTab(){
		
		ModifyingHandler.removeTabs(Items.iron_sword);
		ModifyingHandler.removeTabs(Items.iron_pickaxe);
		ModifyingHandler.removeTabs(Items.iron_shovel);
		ModifyingHandler.removeTabs(Items.iron_axe);
		ModifyingHandler.removeTabs(Items.iron_hoe);
		
		ModifyingHandler.removeTabs(Items.bed);
	}

}
