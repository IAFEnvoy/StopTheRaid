package com.iafenvoy.stoptheraid;

import com.iafenvoy.stoptheraid.registry.STRItemTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
//? <=1.21.1 && fabric {
/*import net.minecraft.world.InteractionResultHolder;
*///?} else {
import net.minecraft.world.InteractionResult;
 //?}
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class STREvents {
    public static /*? <=1.21.1 && fabric {*//*InteractionResultHolder<ItemStack>*//*?} else {*/InteractionResult/*?}*/ stopRaidItemUsed(Player player, Level level, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.is(STRItemTags.EXPIRE_ITEM)) {
            if (level instanceof ServerLevel serverLevel) {
                BlockPos blockPos = player.blockPosition();
                Raid raid = serverLevel.getRaidAt(blockPos);
                if (raid != null) {
                    raid.stop();
                    player.displayClientMessage(Component.translatable("message.stop_the_raid.raid_stopped"), false);
                } else
                    player.displayClientMessage(Component.translatable("message.stop_the_raid.no_raid_found"), false);
            }
            return /*? <=1.21.1 && fabric {*//*InteractionResultHolder.success(stack)*//*?} else {*/InteractionResult.SUCCESS/*?}*/;
        }
        return /*? <=1.21.1 && fabric {*//*InteractionResultHolder.pass(stack)*//*?} else {*/InteractionResult.PASS/*?}*/;
    }
}
