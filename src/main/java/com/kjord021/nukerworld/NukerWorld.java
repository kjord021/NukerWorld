package com.kjord021.nukerworld;

import com.kjord021.nukerworld.registry.ModBlocks;
import com.kjord021.nukerworld.registry.ModItems;
import com.kjord021.nukerworld.registry.ModOres;
import net.fabricmc.api.ModInitializer;

public class NukerWorld implements ModInitializer {

    public static final String MOD_ID = "nukerworld";

    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
        ModBlocks.RegisterItems();
        ModOres.RegisterItems();
    }

}
