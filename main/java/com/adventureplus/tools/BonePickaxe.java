package com.adventureplus.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;

public class BonePickaxe extends ItemPickaxe{

	public BonePickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "BonePickaxe");
		this.setUnlocalizedName("BonePickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
