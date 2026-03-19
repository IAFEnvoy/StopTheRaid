package com.iafenvoy.stoptheraid._loader.neoforge;

//? neoforge {
import com.iafenvoy.stoptheraid.STREvents;
import com.iafenvoy.stoptheraid.StopTheRaid;
import net.minecraft.world.InteractionResult;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@Mod(StopTheRaid.MOD_ID)
@EventBusSubscriber/*? <=1.20.6 {*//*(bus = EventBusSubscriber.Bus.GAME)*//*?}*/
public class StopTheRaidNeoForge {
    public StopTheRaidNeoForge() {
    }

    @SubscribeEvent
    public static void stopRaidItemUsed(PlayerInteractEvent.RightClickItem event) {
        InteractionResult result = STREvents.stopRaidItemUsed(event.getEntity(), event.getLevel(), event.getHand());
        if (result != InteractionResult.PASS) event.setCancellationResult(result);
    }
}
