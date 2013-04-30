package gmk.mods;

import gmk.mods.blocks.BlockCompressedCobblestone;
import gmk.mods.blocks.BlockCompressedCobblestone2x;
import gmk.mods.blocks.BlockCompressedCobblestone3x;
import gmk.mods.blocks.BlockCompressedCobblestone4x;
import gmk.mods.blocks.BlockCompressedCobblestone5x;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Mod made in Brazil
//Mod made by Bielk809
//Mod Version 0.5
//Mod for Minecraft 1.5.1
//Mod v0.5 stated 04/29/2013 at 21:21

@Mod(modid = "CompressedCobblestone", name = "CompressedCobblestone", version = "Mod 0.5 / MC 1.5.1") 
@NetworkMod(clientSideRequired = true, serverSideRequired = false)  

public class CompressedCobblestoneMod 
{
	public static Block compCobble;
	public static Block compCobble2x;
	public static Block compCobble3x;
	public static Block compCobble4x;
	public static Block compCobble5x;

       @PreInit
       public void load(FMLPreInitializationEvent event)
       {
              
       }

       @Init
       public void load(FMLInitializationEvent event)
       {
              //Compressed Cobblestone:
              compCobble = new BlockCompressedCobblestone(1500, Material.rock).setUnlocalizedName("compCobble").setCreativeTab(CreativeTabs.tabBlock).setResistance(15.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
              LanguageRegistry.addName(compCobble, "Compressed Cobblestone");
              GameRegistry.registerBlock(compCobble);
              GameRegistry.addRecipe(new ItemStack(compCobble, 1), new Object [] {"##", "##", '#', Block.cobblestone});
              GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 4), new Object [] {"#", '#', compCobble});
      		  GameRegistry.addRecipe(new ItemStack(Block.cobblestoneWall, 24), new Object[] {"###", "###", '#', compCobble});
         	  GameRegistry.addRecipe(new ItemStack(Block.stairsCobblestone, 16), new Object[] {"#  ", "## ", "###", '#', compCobble});
          	  GameRegistry.addSmelting(compCobble.blockID, new ItemStack(Block.stone, 4), 2.0F);
              
          	  //Compressed Cobblestone 2x:
              compCobble2x = new BlockCompressedCobblestone2x(1501, Material.rock).setUnlocalizedName("compCobble2x").setCreativeTab(CreativeTabs.tabBlock).setResistance(20.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
              LanguageRegistry.addName(compCobble2x, "Compressed Cobblestone 2x");
              GameRegistry.registerBlock(compCobble2x);
              GameRegistry.addRecipe(new ItemStack(compCobble2x, 1), new Object [] {"##", "##", '#', compCobble});
              GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 16), new Object [] {"#", '#', compCobble2x});
              
              //Compressed Cobblestone 3x:
              compCobble3x = new BlockCompressedCobblestone3x(1502, Material.rock).setUnlocalizedName("compCobble3x").setCreativeTab(CreativeTabs.tabBlock).setResistance(25.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
              LanguageRegistry.addName(compCobble3x, "Compressed Cobblestone 3x");
              GameRegistry.registerBlock(compCobble3x);
              GameRegistry.addRecipe(new ItemStack(compCobble3x, 1), new Object [] {"##", "##", '#', compCobble2x});
              GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 64), new Object [] {"#", '#', compCobble3x});
              
              //Compressed Cobblestone 4x:
              compCobble4x = new BlockCompressedCobblestone4x(1503, Material.rock).setUnlocalizedName("compCobble4x").setCreativeTab(CreativeTabs.tabBlock).setResistance(35.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
              LanguageRegistry.addName(compCobble4x, "Compressed Cobblestone 4x");
              GameRegistry.registerBlock(compCobble4x);
              GameRegistry.addRecipe(new ItemStack(compCobble4x, 1), new Object [] {"##", "##", '#', compCobble3x});
              GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 256), new Object [] {"#", '#', compCobble4x});
              
              //Compressed Cobblestone 5x:
              compCobble5x = new BlockCompressedCobblestone5x(1504, Material.rock).setUnlocalizedName("compCobble5x").setCreativeTab(CreativeTabs.tabBlock).setResistance(40.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
              LanguageRegistry.addName(compCobble5x, "Compressed Cobblestone 5x");
              GameRegistry.registerBlock(compCobble5x);
              GameRegistry.addRecipe(new ItemStack(compCobble5x, 1), new Object [] {"##", "##", '#', compCobble4x});
              GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 1024), new Object [] {"#", '#', compCobble5x});
              
       }

       @PostInit
       public void load(FMLPostInitializationEvent event)
       {

       }
      
}
