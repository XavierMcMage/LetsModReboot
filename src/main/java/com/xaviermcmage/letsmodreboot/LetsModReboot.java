package com.xaviermcmage.letsmodreboot;

import com.xaviermcmage.letsmodreboot.handler.ConfigurationHandler;
import com.xaviermcmage.letsmodreboot.init.ModBlocks;
import com.xaviermcmage.letsmodreboot.init.ModItems;
import com.xaviermcmage.letsmodreboot.init.Recipes;
import com.xaviermcmage.letsmodreboot.proxy.IProxy;
import com.xaviermcmage.letsmodreboot.reference.Reference;
import com.xaviermcmage.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Network Handling, Mod Config, Initilize Items/blocks
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Register GUIs, Tile Entities, Crafting Recipes. General event handlers
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //Useful for making sure you can interact with other mods after they have loaded
        LogHelper.info("Post Initialization Complete!");
    }

}
