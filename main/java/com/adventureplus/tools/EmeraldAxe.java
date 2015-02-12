package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmeraldAxe extends ItemAxe{

	public EmeraldAxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "EmeraldAxe");
		this.setUnlocalizedName("EmeraldAxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
