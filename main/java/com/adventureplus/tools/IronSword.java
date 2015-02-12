package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronSword extends ItemSword{

	public IronSword(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "IronSword");
		this.setUnlocalizedName("IronSword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
