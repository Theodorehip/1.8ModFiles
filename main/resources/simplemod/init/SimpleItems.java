package simplemod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import simplemod.SimpleMod;
import simplemod.lib.References;

public class SimpleItems {
	
	//Declare the Item
	public static Item SimpleItem;
	
	
	//Initialize it! (Can be done when declaring but it makes the code more clean)
	public static void init(){
		
		SimpleItem = new Item().setUnlocalizedName("SimpleItem").setCreativeTab(SimpleMod.tabSimple);
		
	}
	
	
	//GameRegistry same as 1.7!
	public static void register(){
		
		GameRegistry.registerItem(SimpleItem, SimpleItem.getUnlocalizedName().substring(5));

		
	}

	
	//ADDED IN 1.8!
	//Declares the render for the Item
	public static void registerRenders(){
		
		registerRender(SimpleItem);

	}
	
	//Renders the Item (Not, you don't need to put your item here, it's using a variable item,
	//which is declared in registerRenders() )
	public static void registerRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
