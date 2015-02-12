package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmeraldPickaxe extends ItemPickaxe{

	public EmeraldPickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "EmeraldPickaxe");
		this.setUnlocalizedName("EmeraldPickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}

