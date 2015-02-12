package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FlintKnife extends ItemSword {

	public FlintKnife(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "FlintKnife");
		this.setUnlocalizedName("FlintKnife");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
		
	}

}