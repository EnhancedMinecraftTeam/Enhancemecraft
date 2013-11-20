package com.emc.mob.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderNetherMen extends RenderLiving{

	private static final ResourceLocation NetherMen = new ResourceLocation("emc:textures/mobs/NetherMen.png");
	
	public RenderNetherMen(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return NetherMen;
	}

}
