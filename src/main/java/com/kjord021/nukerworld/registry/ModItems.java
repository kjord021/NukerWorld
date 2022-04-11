package com.kjord021.nukerworld.registry;

import com.kjord021.nukerworld.NukerWorld;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item URANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(NukerWorld.MOD_ID, "uranium"), URANIUM);
    }

}
