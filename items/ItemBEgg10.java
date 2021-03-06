package com.ethan.items;

import com.ethan.LuckyEggMain;
import com.ethan.entities.EntityBEgg1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBEgg10
  extends Item
{
  public ItemBEgg10(String name)
  {
   setCreativeTab(LuckyEggMain.tabEgg);
    setUnlocalizedName("ethan_luckyegg_" + name);
    setTextureName("ethan_luckyegg:begg10");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    if (!par3EntityPlayer.capabilities.isCreativeMode) {
      par1ItemStack.stackSize -= 1;
    }
    if (!par2World.isRemote) {
      par2World.spawnEntityInWord(new EntityBEgg1(par2World, par3EntityPlayer));
    }
    return par1ItemStack;
  }
}
