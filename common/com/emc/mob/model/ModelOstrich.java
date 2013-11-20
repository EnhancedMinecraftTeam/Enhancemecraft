package com.emc.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOstrich extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Neck;
    ModelRenderer Body4;
    ModelRenderer RightWing;
    ModelRenderer Body2;
    ModelRenderer LeftWing;
    ModelRenderer Head;
    ModelRenderer Mouth;
    ModelRenderer Leg2;
    ModelRenderer Leg1;
  
  public ModelOstrich()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 16, 12, 14);
      Body.setRotationPoint(-5F, -5F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 27);
      Neck.addBox(0F, 0F, 0F, 4, 18, 4);
      Neck.setRotationPoint(1F, -22F, 2F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Body4 = new ModelRenderer(this, 22, 36);
      Body4.addBox(0F, 0F, 0F, 12, 7, 1);
      Body4.setRotationPoint(-3F, -2F, -1F);
      Body4.setTextureSize(64, 32);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0F);
      RightWing = new ModelRenderer(this, 22, 36);
      RightWing.addBox(0F, 0F, 0F, 12, 7, 1);
      RightWing.setRotationPoint(12F, -2F, 1F);
      RightWing.setTextureSize(64, 32);
      RightWing.mirror = true;
      setRotation(RightWing, 0F, -1.59868F, 0F);
      Body2 = new ModelRenderer(this, 22, 36);
      Body2.addBox(0F, 0F, 0F, 12, 7, 1);
      Body2.setRotationPoint(-3F, -2F, 14F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      LeftWing = new ModelRenderer(this, 22, 36);
      LeftWing.addBox(0F, 0F, 0F, 12, 7, 1);
      LeftWing.setRotationPoint(-5F, -2F, 1F);
      LeftWing.setTextureSize(64, 32);
      LeftWing.mirror = true;
      setRotation(LeftWing, 0F, -1.561502F, 0F);
      Head = new ModelRenderer(this, 0, 54);
      Head.addBox(0F, 0F, 0F, 10, 8, 8);
      Head.setRotationPoint(-2F, -30F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Mouth = new ModelRenderer(this, 18, 27);
      Mouth.addBox(0F, 0F, 0F, 6, 2, 5);
      Mouth.setRotationPoint(0F, -26F, -5F);
      Mouth.setTextureSize(64, 32);
      Mouth.mirror = true;
      setRotation(Mouth, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 39, 50);
      Leg2.addBox(0F, 0F, 0F, 4, 17, 3);
      Leg2.setRotationPoint(-3F, 7F, 3F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 39, 50);
      Leg1.addBox(0F, 0F, 0F, 4, 17, 3);
      Leg1.setRotationPoint(4F, 7F, 3F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Neck.render(f5);
    Body4.render(f5);
    RightWing.render(f5);
    Body2.render(f5);
    LeftWing.render(f5);
    Head.render(f5);
    Mouth.render(f5);
    Leg2.render(f5);
    Leg1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      this.Leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.RightWing.rotateAngleZ = par3;
      this.LeftWing.rotateAngleZ = -par3;
  }
}
