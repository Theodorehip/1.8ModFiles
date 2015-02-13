package com.adventureplus.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.adventureplus.container.ContainerMillstone;
import com.adventureplus.lib.References;
import com.adventureplus.tileentity.TileEntityMillstone;


public class GuiMillstone extends GuiContainer {
	
	public static final ResourceLocation bground = new ResourceLocation(References.MODID + ":" + "textures/gui/MillstoneGuiExample.png");
	
	public TileEntityMillstone millstone;

	public GuiMillstone(InventoryPlayer inventoryPlayer, TileEntityMillstone entity) {
		super(new ContainerMillstone(inventoryPlayer, entity));
		
		this.millstone = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}


	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		
		String name = this.millstone.hasCustomInventoryName() ? this.millstone.getInventoryName() : I18n.format("Millstone", new Object[0]);
		this.fontRendererObj.drawString("Grindstone", 83 - this.fontRendererObj.getStringWidth(name) / 2, 12, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	
		if(this.millstone.isBurning()) {
			int k = this.millstone.getBurnTimeRemainingScaled(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
		}
		
		int k = this.millstone.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
	}

}