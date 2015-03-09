package com.adventureplus.items;

import com.adventureplus.AdventurePlusMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronDust extends Item {
	public IronDust() {
		GameRegistry.registerItem(this, "IronDust");
		this.setUnlocalizedName("IronDust");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}
