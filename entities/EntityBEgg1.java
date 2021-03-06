package com.ethan.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBEgg1
  extends EntityThrowable
{
  public EntityBEgg1(World par1World)
  {
    super(par1World);
  }
  
  public EntityBEgg1(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public EntityBEgg1(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  
  protected void onImpact(MovingObjectPosition position)
  {
    int i = position.blockX;
    int j = position.blockY;
    int k = position.blockZ;
    if (!this.worldObj.isRemote)
    {
      worldObj.newExplosion(this, i, j, k, 1.0F, true, true);
      this.setDead();
    }
  }
  
  protected float getGravityVelocity()
  {
    return 0.03F;
  }
  
  protected float func_70182_d()
  {
    return 0.7F;
  }
  
  protected float func_70183_g()
  {
    return -20.0F;
  }
}
