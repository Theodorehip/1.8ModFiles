package simplemod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import simplemod.blocks.SimpleBlock;
import simplemod.lib.References;

public class SimpleBlocks {
	//This class is basically the same thing as SimpleItems, except for a few things...
	
	
	
	public static Block SimpleBlock;
	
	public static void init(){
		
		SimpleBlock = new SimpleBlock(Material.rock);
	}

	
	public static void register(){
		//															This changes V
		GameRegistry.registerBlock(SimpleBlock, SimpleBlock.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		
		registerRender(SimpleBlock);
	}
	
	public static void registerRender(Block block){
		
		//And here! Now you are telling the game to get the item from the block! 
		//Which means... No more Item class for the block!
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
