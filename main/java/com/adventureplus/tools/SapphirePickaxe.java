package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphirePickaxe extends ItemPickaxe{

	public SapphirePickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "SapphirePickaxe");
		this.setUnlocalizedName("SapphirePickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}

