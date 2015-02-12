package com.adventureplus;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.adventureplus.crafting.CraftingHandler;
import com.adventureplus.handler.GuiHandler;
import com.adventureplus.lib.CommonProxy;
import com.adventureplus.lib.References;
import com.adventureplus.registry.*;
import com.adventureplus.creativetab.*;
import com.adventureplus.items.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

//This Class is very organized, Please keep it that way.

//ModID Stuffs
@Mod(modid = References.MODID, version = References.VERSION, name = References.Name)
public class AdventurePlusMod {
	
    //Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
	
    public static final int guiIDMillstone = 1;
    public static final int guiIDCutter = 2;
    
    
	@Instance(References.MODID)
	public static AdventurePlusMod instance;
	
	
	//Proxy Stuff
	@SidedProxy(clientSide = References.Client, serverSide = References.Common)
	public static CommonProxy proxy;
	
	
	//AdventurePlus CreativeTabs
	public static CreativeTabs tabAdventurePlus = new tabAdventurePlus(CreativeTabs.getNextID(), "tabAdventurePlus");
	public static CreativeTabs tabAdventurePlusTools = new tabAdventurePlusTools(CreativeTabs.getNextID(), "tabAdventurePlusTools");
	public static CreativeTabs tabAdventurePlusArmor = new tabAdventurePlusArmor(CreativeTabs.getNextID(), "tabAdventurePlusArmor");
	public static CreativeTabs tabAdventurePlusMaterials = new tabAdventurePlusMaterials(CreativeTabs.getNextID(), "tabAdventurePlusMaterials");
	public static CreativeTabs tabAdventurePlusFood = new tabAdventurePlusFood(CreativeTabs.getNextID(), "tabAdventurePlusFood");
	public static CreativeTabs tabAdventurePlusMisc = new tabAdventurePlusMisc(CreativeTabs.getNextID(), "tabAdventurePlusMisc");
	public static CreativeTabs tabAdventurePlusDeco = new tabAdventurePlusDeco(CreativeTabs.getNextID(), "tabAdventurePlusDeco");

	
	//Used to send some Log INFO/ERROR/STDOUT...
	//public static Logger logger = LogManager.getLogger("AdventurePlus");
    public static final Logger logger = LogManager.getLogger();
	
  //Misc
    
    
  	//WorldGen
  	//AdventurePlusModWorldGen eventWorldGen = new AdventurePlusModWorldGen();
  	
  	
    //Enchantment
  	//Doesn't work yet
    //public static final Enchantment Piercing = new Piercing(199, 5);
  	
      
      @EventHandler
      public void preinit(FMLInitializationEvent event)
      {  
      	
      	//Events
      	//MinecraftForge.EVENT_BUS.register(new CustomDropsEvent());
      }
      
      
      @EventHandler
      public void init(FMLInitializationEvent event)
      {   	
      	
        logger.info("Initializing Adventure+ Mod " + References.VERSION);

    	  
      	//Game Registry
  		logger.info("Registering Items, Blocks, and Entities");
  		
      	ItemRegistry.Register();
      	BlockRegistry.Register();
      	EntityRegistryMod.Register();
  		
  		//Spawn ores
  		logger.info("World Generation");
  	    //GameRegistry.registerWorldGenerator(eventWorldGen, 0);
  		
  		//testing generating random chest
  		//needs spawn-rate tweak
  		ChestGenRegistry.RegisterGeneration();

  		TabsRegistry.RemoveCreativeTab();
  		
  		logger.info("Registering Recipes Stuffs");
  		RecipeRegistry.RemoveRecipes();
  		RecipeRegistry.RegisterCrafting();
  	    RecipeRegistry.RegisterSmelting();
  		
  	    
  		logger.info("Render Entities");
  		//Tile Entity Registry
  		//GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");
  		//EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 4, this, 80, 3, true);


      	//Register your GUI handler
  		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
  		FMLCommonHandler.instance().bus().register(new CraftingHandler());
  		
  		//MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cottonSeeds), 1);
  		
  		
  		//Register your renderer in your proxy.
  		proxy.registerRenderThings();
  		proxy.registerTileEntitySpecialRenderer();
  		
  		
  		//1.8 RENDERING THINGS
		if (event.getSide() == Side.CLIENT) {
			
		ItemRegistry.Render();
		BlockRegistry.Render();
		
  		}

  		logger.info("Mod loaded");

      }  

      /*
      @SubscribeEvent
      public void on(BlockEvent.HarvestDropsEvent event){
      	
      		if (event.block.isEqualTo(Blocks.bookshelf, null)){
      			
      		}
      	}
      */

}
