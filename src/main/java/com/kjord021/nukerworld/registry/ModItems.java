package com.kjord021.nukerworld.registry;

import com.kjord021.nukerworld.CustomItems.RadioactiveItem;
import com.kjord021.nukerworld.NukerWorld;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final RadioactiveItem URANIUM = new RadioactiveItem(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(64));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(NukerWorld.MOD_ID, "uranium"), URANIUM);
    }

}
