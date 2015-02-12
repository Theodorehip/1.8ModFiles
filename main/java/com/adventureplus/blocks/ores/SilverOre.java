package com.adventureplus.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.BlockRegistry;

public class SilverOre extends Block{

	public SilverOre(Material material) {
		super(material);
		
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlus);
		this.setUnlocalizedName("SilverOre");
		GameRegistry.registerBlock(this, "SilverOre");
	}
	
	public Block getDropped(int i, Random random, int j){
		return BlockRegistry.silverOre;
	}
}
