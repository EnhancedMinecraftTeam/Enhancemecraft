package com.emc.mob.render;

import com.emc.mob.model.ModelOstrich;
import com.emc.mob.model.modelMiner;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderOstrich extends RenderLiving{

	private static final ResourceLocation Ostrich = new ResourceLocation("emc:textures/mobs/Ostrich.png");
	
	public RenderOstrich(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return Ostrich;
	}

}
