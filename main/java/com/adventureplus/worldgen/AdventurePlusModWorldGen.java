package com.adventureplus.worldgen;

import java.util.Random;

import com.adventureplus.AdventurePlusMod;
import com.adventureplus.registry.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class AdventurePlusModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0:
			// generate our surface world
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case -1:
			// generate our Nether World
			generateNether(world, random, chunkX * 16, chunkZ * 16);


		case 1:
			// generate our EnderWorld
			generateEnd(world, random, chunkX * 16, chunkZ * 16);

		}


	}

	private void generateSurface(World world, Random random, int x, int z) {
		// this.addOreSpawn
		this.addOreSpawn(BlockRegistry.copperOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 10, 42, 63);
		this.addOreSpawn(BlockRegistry.silverOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 10, 42, 63);
		this.addOreSpawn(BlockRegistry.jadeOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 10, 42, 63);
		this.addOreSpawn(BlockRegistry.haliteOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 10, 42, 63);
		
		AdventurePlusMod.logger.info("Surface Ores Implemented");
		
		 String s = world.getBiomeGenForCoords(new BlockPos(x, 40, z)).biomeName;
		 this.addOreSpawn(BlockRegistry.sapphireOre, world, random, x, z, 16, 16, 2 + random.nextInt(6), 25, 0, 20);
		
	}

	private void generateNether(World world, Random random, int x, int z) {
		//this.addNetherOreSpawn(BlockRegistry.lavaBrick, world, random, x, z, 16, 16, 4 + random.nextInt(6), 50, 0, 40);
		this.addNetherOreSpawn(BlockRegistry.netherRubyOre, world, random, x, z, 16, 16, 2 + random.nextInt(15), 50, 0, 100);
		//this.addNetherOreSpawn(BlockRegistry.Firerack, world, random, x, z, 16, 16, 1 + random.nextInt(15), 50, 0, 120);
		
		AdventurePlusMod.logger.info("Nether Ores Implemented");

	}

	private void generateEnd(World world, Random random, int x, int z) {
		
		
			
		
		// AdventurePlusMod.logger.info("Ender Ores Implemented");
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for (int i = 0; i < chanceToSpawn; i++) {

			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, new BlockPos(posX, posY, posZ));
		}

	}
	private void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for (int i = 0; i < chanceToSpawn; i++) {

			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, new BlockPos(posX, posY, posZ));
		}

	}
}