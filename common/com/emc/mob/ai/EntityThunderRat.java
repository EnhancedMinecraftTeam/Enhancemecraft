package com.emc.mob.ai;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: HackerTDog
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.mat.matManager;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityThunderRat extends EntityMob {

	public EntityThunderRat(World par1World) {
		// @Constructor 
		super(par1World);		
		// @Dropped Experience Value
		this.experienceValue = 10;
		// @AI Tasks
    	this.tasks.addTask(0, new EntityAISwimming(this));
    	this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
    	this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    	this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
	// @AI is Enabled
	protected boolean isAIEnabled() { return true; }
	
	protected void func_110147_ax()
	{
	  super.func_110142_aN();
	  this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(6.0D);
	  this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(28.0D);
	  this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(2.0D);
	} 
	
	// @Hurt Sound
	protected String HurtSound() { return "mob.rat.death"; }
	
	// @Step Sound
    protected void playStepSound(int par1, int par2, int par3, int par4) {
    	this.playSound("mob.rat.step", 0.15F, 1.0F);
    }
    
    // @Standard Drop Item
    protected int getDropItemId() { return matManager.essenceLightning.itemID; }
    
    // @Get EnumCreatureAttribute()
    public EnumCreatureAttribute getCreatureAttribute() { return EnumCreatureAttribute.ARTHROPOD; }
    
    // @Parent Living Update() 
    public void onLivingUpdate() { super.onLivingUpdate(); }
    
}
