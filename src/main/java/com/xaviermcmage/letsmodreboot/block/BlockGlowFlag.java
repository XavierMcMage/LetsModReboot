package com.xaviermcmage.letsmodreboot.block;

import net.minecraft.block.material.Material;

public class BlockGlowFlag extends BlockLMRB
{
    public BlockGlowFlag()
    {
        super(Material.glass);
        this.setBlockName("glowFlag");
        this.setBlockTextureName("glowFlag");
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeGlass);
        this.setHardness(0.5F);
    }

}
