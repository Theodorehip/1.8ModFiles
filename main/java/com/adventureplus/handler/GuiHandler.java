package com.adventureplus.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

//import com.millstone.MillstoneMod;
//import com.millstone.container.ContainerCutter;
//import com.millstone.container.ContainerMillstone;
//import com.millstone.gui.GuiCutter;
//import com.millstone.gui.GuiMillstone;
//import com.millstone.registry.BlockRegistry;
//import com.millstone.tileentity.TileEntityMillstone;

import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));

/*
		if(entity != null) {
			switch(ID) {

			case MillstoneMod.guiIDMillstone:
				if (entity instanceof TileEntityMillstone) {
					return new ContainerMillstone(player.inventory, (TileEntityMillstone) entity);
				}	

			}
		}

		if(ID == MillstoneMod.guiIDCutter) {
			return ID == MillstoneMod.guiIDCutter && world.getBlock(x, y, z) == BlockRegistry.stoneCutter ? new ContainerCutter(player.inventory, world, x, y, z) : null;
		}

		return null;

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(entity != null) {
			switch(ID){
			case MillstoneMod.guiIDMillstone:
				if (entity instanceof TileEntityMillstone) {
					return new GuiMillstone(player.inventory, (TileEntityMillstone) entity);
				}

			}
		}
		
		if(ID == MillstoneMod.guiIDCutter) {
			return ID == MillstoneMod.guiIDCutter && world.getBlock(x, y, z) == BlockRegistry.stoneCutter ? new GuiCutter(player.inventory, world, x, y, z) : null;
		}
*/
		return null;
	}
	


	

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	
}
}