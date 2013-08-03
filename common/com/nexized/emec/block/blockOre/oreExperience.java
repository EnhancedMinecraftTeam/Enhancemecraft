package com.nexized.emec.block.blockOre;

import com.nexized.emec.common.instance.loaderOre;
import com.nexized.emec.lib.modInfo;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class oreExperience extends BlockOre {
	
	public oreExperience(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0F);
	}

	public void dropBlockAsItemWithChance(World world, int par2, int par3, int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(world, par2, par3, par4, par5, par6, par7);

		if (this.idDropped(par5, world.rand, par7) != this.blockID) {
			int addExp = 0;

			if (blockID == loaderOre.OreExp.blockID) {
				addExp = MathHelper.getRandomIntegerInRange(world.rand, 2, 7);
			}

			dropXpOnBlockBreak(world, par2, par3, par4, addExp);
		}
	}
	
	public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon(modInfo.MODID + ":oreExperience");
    }
}
