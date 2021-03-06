package gmk.mods.blocks;

//Mod made in Brazil
//Mod made by Bielk809
//Mod Version 0.5
//Mod for Minecraft 1.5.1
//Mod v0.5 stated 04/29/2013 at 21:21

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedCobblestone2x extends Block
{
	public BlockCompressedCobblestone2x(int par1, Material par2Material) 
	{
		super(par1, par2Material);
		
	}
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    
    {
        return 16;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    
    {
    	return Block.cobblestone.blockID;
    }
}
