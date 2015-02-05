package simplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import simplemod.SimpleMod;

public class SimpleBlock extends Block{
	
	//Doesn't change at all except for textures (removed all texturing part!)
	public SimpleBlock(Material material){
		super(material);
		
		setUnlocalizedName("SimpleBlock");
		setCreativeTab(SimpleMod.tabSimple);
	}
		
	
}