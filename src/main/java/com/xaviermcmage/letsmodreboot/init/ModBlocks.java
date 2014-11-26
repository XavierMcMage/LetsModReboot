package com.xaviermcmage.letsmodreboot.init;

import com.xaviermcmage.letsmodreboot.block.BlockFlag;
import com.xaviermcmage.letsmodreboot.block.BlockGlowFlag;
import com.xaviermcmage.letsmodreboot.block.BlockHardFlag;
import com.xaviermcmage.letsmodreboot.block.BlockLMRB;
import com.xaviermcmage.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB mapleFlag = new BlockFlag();
    public static final BlockLMRB glowFlag = new BlockGlowFlag();
    public static final BlockLMRB hardFlag = new BlockHardFlag();

    public static void init()
    {
        GameRegistry.registerBlock(mapleFlag, "mapleFlag");
        GameRegistry.registerBlock(glowFlag, "glowFlag");
        GameRegistry.registerBlock(hardFlag, "hardFlag");
    }
}
