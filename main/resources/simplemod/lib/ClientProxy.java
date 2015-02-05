package simplemod.lib;

import simplemod.init.SimpleBlocks;
import simplemod.init.SimpleItems;


public class ClientProxy extends CommonProxy{
	
	//Does not change
	@Override
	public void registerRenders(){
		
		SimpleBlocks.registerRenders();
		SimpleItems.registerRenders(); 
		
	}

}
