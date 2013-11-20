package com.emc.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelThunderRat extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Tail;
    ModelRenderer Head;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Teeth;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
  
  public ModelThunderRat()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 7, 5, 6);
      Body.setRotationPoint(0F, 16F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 20, 18);
      Tail.addBox(0F, 0F, 0F, 4, 1, 1);
      Tail.setRotationPoint(7F, 18F, 3F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0.1115358F, 0.2974289F);
      Head = new ModelRenderer(this, 0, 15);
      Head.addBox(0F, 0F, 0F, 3, 4, 4);
      Head.setRotationPoint(-3F, 16.6F, 1F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 0, 29);
      Ear1.addBox(0F, 0F, 0F, 1, 2, 2);
      Ear1.setRotationPoint(-2F, 16F, 0.2666667F);
      Ear1.setTextureSize(64, 64);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 0, 29);
      Ear2.addBox(0F, 0F, 0F, 1, 2, 2);
      Ear2.setRotationPoint(-2F, 16F, 3.6F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 29, 0);
      Nose.addBox(0F, 0F, 0F, 2, 1, 2);
      Nose.setRotationPoint(-5F, 18F, 2F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Teeth = new ModelRenderer(this, 41, 0);
      Teeth.addBox(0F, 0F, 0F, 1, 2, 2);
      Teeth.setRotationPoint(-4F, 19F, 2F);
      Teeth.setTextureSize(64, 64);
      Teeth.mirror = true;
      setRotation(Teeth, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 38, 6);
      Leg1.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg1.setRotationPoint(1F, 20.46667F, -0.2666667F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 38, 6);
      Leg2.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg2.setRotationPoint(5F, 20.5F, -0.3F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 38, 6);
      Leg3.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg3.setRotationPoint(1F, 20.5F, 5.166667F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 38, 6);
      Leg4.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg4.setRotationPoint(5F, 20.5F, 5.2F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 31, 18);
      Tail2.addBox(0F, 0F, 0F, 4, 1, 1);
      Tail2.setRotationPoint(9.8F, 19F, 3F);
      Tail2.setTextureSize(64, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0.7807508F, 0.2230717F);
      Tail3 = new ModelRenderer(this, 42, 18);
      Tail3.addBox(0F, 0F, 0F, 4, 1, 1);
      Tail3.setRotationPoint(12F, 19.7F, 1.133333F);
      Tail3.setTextureSize(64, 64);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 1.858931F, 0.0113601F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Tail.render(f5);
    Head.render(f5);
    Ear1.render(f5);
    Ear2.render(f5);
    Nose.render(f5);
    Teeth.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  this.Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	  this.Leg1.rotateAngleY = 0.0F;
	  
	  this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.Leg2.rotateAngleY = 0.0F;
	  
	  this.Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	  this.Leg3.rotateAngleY = 0.0F;
	  
	  this.Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	  this.Leg4.rotateAngleY = 0.0F;
	  
	  this.Head.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.Head.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.Tail2.rotateAngleX = f3;
      this.Tail3.rotateAngleX = f3;
  }

}
