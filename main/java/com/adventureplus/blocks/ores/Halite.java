package com.adventureplus.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.BlockRegistry;

public class Halite extends Block{

	public Halite(Material material) {
		super(material);
		
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlus);
		this.setUnlocalizedName("Halite");
		GameRegistry.registerBlock(this, "Halite");
	}
	
	public Block getDropped(int i, Random random, int j){
		return BlockRegistry.copperOre;
	}
	
}		

