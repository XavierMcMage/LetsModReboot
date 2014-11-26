package com.xaviermcmage.letsmodreboot.block;

public class BlockHardFlag extends BlockLMRB
{
    public BlockHardFlag()
    {
        super();
        this.setBlockName("hardFlag");
        this.setBlockTextureName("hardFlag");
        this.setHardness(50F);
        this.setResistance(2000F);
        this.setHarvestLevel("pickaxe", 3);
    }
}
