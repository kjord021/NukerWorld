package com.kjord021.nukerworld.CustomItems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import static com.kjord021.nukerworld.DamageSources.RadioactiveDamageSource.Radioactive;

public class RadioactiveItem extends Item {

    public RadioactiveItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.damage(Radioactive, 10);
        user.getStackInHand(hand).decrement(1);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
