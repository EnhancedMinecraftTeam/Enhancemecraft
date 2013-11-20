package com.emc.mob.ai;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: afrodaydude, nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	}
	
	// @AI is Enabled
	protected boolean isAIEnabled() { return true; }
	
	protected void func_110147_ax()
	{
	  super.func_110142_aN();
	  this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(25.0D); //Health
	  this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D); //Attack
	  this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.13D); //Speed
	} 
	// What He Holds
	protected void addRandomArmor(){
		this.setCurrentItemOrArmor(0, new ItemStack(Item.pickaxeIron));
		}
	
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
    public EnumCreatureAttribute getCreatureAttribute() { return EnumCreatureAttribute.ARTHROPOD; }
    
    // @Parent Living Update() 
    public void onLivingUpdate() { super.onLivingUpdate(); }
    
}
