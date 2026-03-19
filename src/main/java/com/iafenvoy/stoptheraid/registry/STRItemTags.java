package com.iafenvoy.stoptheraid.registry;

import com.iafenvoy.stoptheraid.util.RLUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class STRItemTags {
    public static final TagKey<Item> EXPIRE_ITEM = TagKey.create(Registries.ITEM, RLUtil.id("expire_item"));
}
