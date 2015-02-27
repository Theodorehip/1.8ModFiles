package com.adventureplus.handler;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.container.ContainerGrindstone;
import com.adventureplus.container.ContainerMillstone;
import com.adventureplus.gui.GuiGrindstone;
import com.adventureplus.gui.GuiMillstone;
import com.adventureplus.tileentity.TileEntityGrindstone;
import com.adventureplus.tileentity.TileEntityMillstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));

		if(entity != null) {
			switch(ID) {

			case AdventurePlusMod.guiIDGrindstone:
				if (entity instanceof TileEntityGrindstone) {
					return new ContainerGrindstone(player.inventory, (TileEntityGrindstone) entity);
				}	

			}
		}
/*
		if(ID == AdventurePlusMod.guiIDCutter) {
			//return ID == AdventurePlusMod.guiIDCutter && world.getBlock(x, y, z) == BlockRegistry.stoneCutter ? new ContainerCutter(player.inventory, world, x, y, z) : null;
		}
*/
		return null;

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));

		if(entity != null) {
			switch(ID){
			case AdventurePlusMod.guiIDGrindstone:
				if (entity instanceof TileEntityGrindstone) {
					return new GuiGrindstone(player.inventory, (TileEntityGrindstone) entity);
				}

			}
		}
		/*
		if(ID == AdventurePlusMod.guiIDCutter) {
			//return ID == AdventurePlusMod.guiIDCutter && world.getBlock(x, y, z) == BlockRegistry.stoneCutter ? new GuiCutter(player.inventory, world, x, y, z) : null;
		}
*/
		return null;
	}
	
	
}
