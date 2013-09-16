package com.emc.mob.ai;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: afrodaydude, nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.EnumCreatureAttribute;
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

public class entityMiner extends EntityMob {

	public entityMiner(World par1World) {
		// @Constructor 
		super(par1World);		
		// @Dropped Experience Value
		this.experienceValue = 10;
		// @AI Tasks
    	this.tasks.addTask(0, new EntityAISwimming(this));
    	this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
    	this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    	this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));        
    	this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
    	this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false));
    	this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, false));
    	this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false));
        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false));
        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, false));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false));
        this.tasks.addTask(11, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(12, new EntityAILookIdle(this));
        this.targetTasks.addTask(13, new EntityAIHurtByTarget(this, true));
	}
	
	// @AI is Enabled
	protected boolean isAIEnabled() { return true; }
	
	// @Hurt Sound
	protected String HurtSound() { return "mob.zombie.death"; }
	
	// @Step Sound
    protected void playStepSound(int par1, int par2, int par3, int par4) {
    	this.playSound("mob.zombie.step", 0.15F, 1.0F);
    }
    
    // @Standard Drop Item
    protected int getDropItemId() { return Item.pickaxeIron.itemID; }
    
    // @Rare Drop Item
    protected void dropRareDrop(int par1) {
    	switch (this.rand.nextInt(3)) {
    	case 0:
    		this.dropItem(Item.pickaxeDiamond.itemID, 1);
    	break;
    	}
    }
    
    // @Get EnumCreatureAttribute()
    public EnumCreatureAttribute getCreatureAttribute() { return EnumCreatureAttribute.UNDEAD; }
    
    // @Parent Living Update() 
    public void onLivingUpdate() { super.onLivingUpdate(); }
    
}
