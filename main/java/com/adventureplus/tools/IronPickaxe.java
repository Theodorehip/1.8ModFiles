package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronPickaxe extends ItemPickaxe{

	public IronPickaxe(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "IronPickaxe");
		this.setUnlocalizedName("IronPickaxe");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
