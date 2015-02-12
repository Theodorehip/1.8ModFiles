package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronAxe extends ItemAxe{

	public IronAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "IronAxe");
		this.setUnlocalizedName("IronAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
