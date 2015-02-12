package com.adventureplus.blocks.ores;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.BlockRegistry;
import com.adventureplus.registry.ItemRegistry;

public class NetherRubyOre extends Block{

	public NetherRubyOre(Material material) {
		super(material);
		
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlus);
		this.setUnlocalizedName("NetherRubyOre");
		GameRegistry.registerBlock(this, "NetherRubyOre");
	}
	
	public Item getItemDropped(int i, Random random, int j) {

		return ItemRegistry.ruby;
	}
			


	public int quantityDropped(Random random) {
		return 1;
	}

	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0) {
			int j = random.nextInt(fortune + 2) - 1;

			if (j < 0) {
				j = 0;
			}

			return quantityDropped(random) * (j + 1);
		} else {
			return quantityDropped(random);
		}
	}
	
	protected boolean canSilkHarvest()
    {
        return true;
    }
}
