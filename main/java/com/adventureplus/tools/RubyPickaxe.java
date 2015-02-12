package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyPickaxe extends ItemPickaxe{

	public RubyPickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "RubyPickaxe");
		this.setUnlocalizedName("RubyPickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}

