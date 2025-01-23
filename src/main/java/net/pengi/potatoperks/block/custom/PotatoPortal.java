package net.pengi.potatoperks.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pengi.potatoperks.item.ModItems;

public class PotatoPortal extends Block {
    public PotatoPortal(Settings settings) {
        super(settings);
        }

@Override
protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                             BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
        }

@Override
public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getStack().getItem() == ModItems.COOKED_PINK_POTATO){
                itemEntity.setStack(new ItemStack(ModItems.BLUE_POTATO, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem() == ModItems.COOKED_BLUE_POTATO){
                itemEntity.setStack(new ItemStack(ModItems.ORANGE_POTATO, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem() == ModItems.COOKED_ORANGE_POTATO){
                itemEntity.setStack(new ItemStack(ModItems.PURPLE_POTATO, itemEntity.getStack().getCount()));
            }
            if(itemEntity.getStack().getItem() == ModItems.COOKED_PURPLE_POTATO){
            itemEntity.setStack(new ItemStack(ModItems.PINK_POTATO, itemEntity.getStack().getCount()));
            }
        }

    super.onSteppedOn(world, pos, state, entity);
}
}
