package gmk.mods.test;

import gmk.mods.block.BlockCompressedCobblestone2x;
import gmk.mods.test.block.BlockSheep;
import gmk.mods.test.item.ItemTest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "TestMod", name = "TestMod", version = "Mod 0.1 / MC 1.5.1") 
@NetworkMod(clientSideRequired = true, serverSideRequired = false)  

public class TestMod 
{
	
	public static Item test; //<- Item Name
	public static Block blockSheep;

	@Instance("TestMod")
    public static TestMod instance;

    @PreInit
    public void load(FMLPreInitializationEvent event)
    {
           
    }

    @Init
    public void load(FMLInitializationEvent event)
    {
    	  test = new ItemTest(3805).setUnlocalizedName("stick"); //<- Only the name of your texture, without .png , you have to put the texture in \minecraft.jar\textures\items
	      GameRegistry.registerItem(test, "ItemName");
	      LanguageRegistry.addName(test, "TEST");
	      
	      blockSheep = new BlockSheep(3806).setUnlocalizedName("wood").setCreativeTab(CreativeTabs.tabBlock).setResistance(20.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
          LanguageRegistry.addName(blockSheep, "Block Sheep");
          GameRegistry.registerBlock(blockSheep);
    }
    
    @PostInit
    public void load(FMLPostInitializationEvent event)
    {

    }
}
