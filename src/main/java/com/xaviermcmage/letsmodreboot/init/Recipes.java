package com.xaviermcmage.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        /*
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mapleFlag), new ItemStack(Items.stick), new ItemStack(Items.stick));
        */

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.glowLeaf), new ItemStack(Items.glowstone_dust), new ItemStack(ModItems.mapleLeaf)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.hardLeaf), new ItemStack(Blocks.obsidian), new ItemStack(ModItems.mapleLeaf)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mapleFlag), "   ", " m ", " s ", 'm', new ItemStack(ModItems.mapleLeaf), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.glowFlag), "   ", " g ", " s ", 'g', new ItemStack(ModItems.glowLeaf), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hardFlag), "   ", " h ", " s ", 'h', new ItemStack(ModItems.hardLeaf), 's', "stickWood"));
    }
}
