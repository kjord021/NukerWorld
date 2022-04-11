package com.kjord021.nukerworld.CustomBlocks;

import com.kjord021.nukerworld.DamageSources.RadioactiveDamageSource;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadioactiveBlock extends Block {

    public RadioactiveBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player){
        player.damage(RadioactiveDamageSource.Radioactive, 10);
    }
}
