package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireSword extends ItemSword{

	public SapphireSword(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "SapphireSword");
		this.setUnlocalizedName("SapphireSword");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
