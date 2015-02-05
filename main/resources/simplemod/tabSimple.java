package simplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import simplemod.init.SimpleItems;

public class tabSimple extends CreativeTabs{
	
	public tabSimple(String par2Str) {
		super(par2Str);
		//this.setBackgroundImageName("background.png");
		
	}
	
	@Override
	public Item getTabIconItem(){
		return SimpleItems.SimpleItem;
	}
}
