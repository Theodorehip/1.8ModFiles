package simplemod.items;

import java.util.Random;

import net.minecraft.item.Item;

import simplemod.SimpleMod;

public class SimpleItem extends Item{
	
	//Doesn't change at all except for textures (removed all texturing part!)
	public SimpleItem(){
		setUnlocalizedName("SimpleItem");
		setCreativeTab(SimpleMod.tabSimple);
	}
		
	
}