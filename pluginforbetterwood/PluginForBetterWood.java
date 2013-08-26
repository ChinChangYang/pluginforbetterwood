package pluginforbetterwood;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import SackCastellon.betterwood.common.BetterWood;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "PluginForBetterWood", name = "PluginForBetterWood", version = "0.0.1", dependencies = "required-after:SKC-BetterWood")
@NetworkMod(clientSideRequired = false, serverSideRequired = true)
public class PluginForBetterWood {

	// The instance of your mod that Forge uses.
	@Instance("PluginForBetterWood")
	public static PluginForBetterWood instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "pluginforbetterwood.CommonProxy", serverSide = "pluginforbetterwood.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stick
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick), BetterWood.BirchStick);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick), BetterWood.OakStick);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick), BetterWood.SpruceStick);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick), BetterWood.JungleStick);
		
		// Torch
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), BetterWood.BirchTorchOn);
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), BetterWood.OakTorchOn);
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), BetterWood.SpruceTorchOn);
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), BetterWood.JungleTorchOn);
	}
}
