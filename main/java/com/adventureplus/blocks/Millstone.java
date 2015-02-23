package com.adventureplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.lib.References;
import com.adventureplus.registry.BlockRegistry;
import com.adventureplus.tileentity.TileEntityMillstone;

import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Millstone extends BlockContainer {
	
	private final boolean isActive;
	
	private static boolean keepInventory;
	private Random rand = new Random();
	



	public Millstone(boolean isActive) {
		super(Material.iron);
		this.isActive = isActive;
		this.setUnlocalizedName("Millstone");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlus);
		

	}
	
	//Retruns what item is dropped when broken
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock((BlockRegistry.millstone));
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, new BlockPos(x, y, z), this.getDefaultState());
		this.setDefaultDirection(world, x, y, z);
	}

	//Some stuff to set the front
	private void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
			BlockPos b0l = new BlockPos(x,y,z);
			BlockPos b1l = new BlockPos(x, y, z - 1);
			BlockPos b2l = new BlockPos(x, y, z + 1);
			BlockPos b3l = new BlockPos(x - 1, y, z);
			BlockPos b4l = new BlockPos(x + 1, y, z);
			
			IBlockState b1a = world.getBlockState(b1l);
			IBlockState b2a = world.getBlockState(b2l);
			IBlockState b3a = world.getBlockState(b3l);
			IBlockState b4a = world.getBlockState(b4l);
			
			Block b1 = b1a.getBlock();
			Block b2 = b2a.getBlock();
			Block b3 = b3a.getBlock();
			Block b4 = b4a.getBlock();
			
			byte b0 = 3;
			
			if(b1.canBeReplacedByLeaves(world, b1l) && !b2.canBeReplacedByLeaves(world, b2l)) {
				b0 = 3;	
			}
			
			if(b2.canBeReplacedByLeaves(world, b2l) && !b1.canBeReplacedByLeaves(world, b1l)) {
				b0 = 2;	
			}
			
			if(b3.canBeReplacedByLeaves(world, b3l) && !b4.canBeReplacedByLeaves(world, b4l)) {
				b0 = 5;	
			}
			
			if(b4.canBeReplacedByLeaves(world, b4l) && !b3.canBeReplacedByLeaves(world, b3l)) {
				b0 = 4;	
			}
			
			world.setBlockState(b0l, world.getBlockState(b0l), b0);
		}
		
	}
	//When you right click the block, this is activated.
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if(!world.isRemote) {
			FMLNetworkHandler.openGui(player, AdventurePlusMod.instance, AdventurePlusMod.guiIDMillstone, world, x, y, z);
		}
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityMillstone();
	}
	
	//Add things like particals in here
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		if(this.isActive) {
			//int direction = world.getBlockMetadata(x, y, z);
		}
	}
	
	//Some more placement stuff
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;
		BlockPos pos = new BlockPos(x,y,z);
		
		if(l == 0) {
			world.setBlockState(pos, world.getBlockState(pos), 2);
		}
		
		if(l == 1) {
			world.setBlockState(pos, world.getBlockState(pos), 5);
		}
		
		if(l == 2) {
			world.setBlockState(pos, world.getBlockState(pos), 3);
		}
		
		if(l == 3) {
			world.setBlockState(pos, world.getBlockState(pos), 4);
		}
		
		if(itemstack.hasDisplayName()) {
			((TileEntityMillstone)world.getTileEntity(new BlockPos(x, y, z))).setGuiDisplayName(itemstack.getDisplayName());
		}
	}

	//Updates the millstone from idle to active.
	public static void updateMillstoneState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {
		
		TileEntity tileentity = worldObj.getTileEntity(new BlockPos(xCoord, yCoord, zCoord));
		keepInventory = true;
		
		if(active) {
			worldObj.setBlockState(new BlockPos(xCoord, yCoord, zCoord), BlockRegistry.millstone.getDefaultState());
			
		}else{
			worldObj.setBlockState(new BlockPos(xCoord, yCoord, zCoord), BlockRegistry.millstone.getDefaultState());
		}
		
		keepInventory = false;
		
		worldObj.setBlockState(new BlockPos(xCoord, yCoord, zCoord), BlockRegistry.millstone.getDefaultState(), 2);
		
		if(tileentity != null) {
			tileentity.validate();
			worldObj.setTileEntity(new BlockPos(xCoord, yCoord, zCoord), tileentity);
		}
	}
	
	//What happens when you break the block
	public void breakBlock(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
		if(!keepInventory) {
			TileEntityMillstone tileentity = (TileEntityMillstone) world.getTileEntity(new BlockPos(x, y, z));
			
			if(tileentity != null) {
				for(int i = 0; i < tileentity.getSizeInventory(); i++) {
					ItemStack itemstack = tileentity.getStackInSlot(i);
					
					if(itemstack != null) {
						float f = this.rand.nextFloat() * 0.8F + 0.1F;
						float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
						float f2 = this.rand.nextFloat() * 0.8F + 0.1F;
						
						while(itemstack.stackSize > 0) {
							int j = this.rand.nextInt(21) + 10;
							
							if(j > itemstack.stackSize) {
								j = itemstack.stackSize;
							}
							
							itemstack.stackSize -= j;
							
							EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));
							
							if(itemstack.hasTagCompound()) {
								item.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
							}
							
							world.spawnEntityInWorld(item);
						}
					}
				}
				//dont know what this function IS. need to know to implement it in 1.8
				//world.func_147453_f(new BlockPos(x, y, z), oldblock);
			}
		}
		
		super.breakBlock(world, new BlockPos(x, y, z), oldblock.getDefaultState());
	}
	
	//Just return your millstone idle.
	public Item getItem(World world, int x, int y, int z) {
		return Item.getItemFromBlock(BlockRegistry.millstone);
	}

}