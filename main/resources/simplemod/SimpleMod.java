package simplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import simplemod.init.SimpleBlocks;
import simplemod.init.SimpleItems;
import simplemod.lib.CommonProxy;
import simplemod.lib.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)

public class SimpleMod {
	
	//Does not change except for preInit
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	
	public static CreativeTabs tabSimple = new tabSimple("tabSimple");
		
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		//Events, NOTE: I only added The Block and Item Registry because the others didn't change
		//(well I think they didn't but at least, I know that crafting is the same!)
		SimpleBlocks.init();
		SimpleBlocks.register();
		
		SimpleItems.init();
		SimpleItems.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
	}

}
