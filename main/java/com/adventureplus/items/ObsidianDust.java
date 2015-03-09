package com.adventureplus.items;

import com.adventureplus.AdventurePlusMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianDust extends Item {
	public ObsidianDust() {
		GameRegistry.registerItem(this, "ObsidianDust");
		this.setUnlocalizedName("ObsidianDust");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusMaterials);
	}
}
