package com.emc.mob.render;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: afrodaydude, nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.mob.ai.entityMiner;
import com.emc.mob.model.modelMiner;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class renderMiner extends RenderLiving {
	
	protected modelMiner model;

    private static final ResourceLocation MinerTextures = new ResourceLocation("emc:textures/mobs/Miner.png");
	
	public renderMiner(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((modelMiner)mainModel);
	}
	
	public void RenderMiner(entityMiner entity, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}

	public void doRenerLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		RenderMiner((entityMiner)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
		RenderMiner((entityMiner)entity, d0, d1, d2, f, f1);
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return MinerTextures;
	}

	protected ResourceLocation func_110775_a(Entity entity) {
		return MinerTextures;
	}
	
	
}
