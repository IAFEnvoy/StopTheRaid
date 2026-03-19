package com.iafenvoy.stoptheraid.util;

import com.iafenvoy.stoptheraid.StopTheRaid;
import net.minecraft.resources.ResourceLocation;

public final class RLUtil {
    //? forge {
    /*@SuppressWarnings("removal")
     *///?}
    public static ResourceLocation id(String id) {
        //? >=1.21 {
        return ResourceLocation.fromNamespaceAndPath(StopTheRaid.MOD_ID, id);
        //?} else {
        /*return new ResourceLocation(StopTheRaid.MOD_ID, id);
         *///?}
    }
}
