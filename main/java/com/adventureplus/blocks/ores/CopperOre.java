package com.adventureplus.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.BlockRegistry;

public class CopperOre extends Block{

	public CopperOre(Material material) {
		super(material);
		
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlus);
		this.setUnlocalizedName("CopperOre");
		GameRegistry.registerBlock(this, "CopperOre");
	}
	
	public Block getDropped(int i, Random random, int j){
		return BlockRegistry.copperOre;
	}
	
}
