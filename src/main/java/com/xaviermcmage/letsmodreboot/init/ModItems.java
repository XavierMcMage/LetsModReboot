package com.xaviermcmage.letsmodreboot.init;

import com.xaviermcmage.letsmodreboot.item.ItemGlowLeaf;
import com.xaviermcmage.letsmodreboot.item.ItemHardLeaf;
import com.xaviermcmage.letsmodreboot.item.ItemLMRB;
import com.xaviermcmage.letsmodreboot.item.ItemMapleLeaf;
import com.xaviermcmage.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB glowLeaf = new ItemGlowLeaf();
    public static final ItemLMRB hardLeaf = new ItemHardLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(glowLeaf, "glowLeaf");
        GameRegistry.registerItem(hardLeaf, "hardLeaf");
    }
}
