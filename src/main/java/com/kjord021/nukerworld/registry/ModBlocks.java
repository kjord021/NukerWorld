package com.kjord021.nukerworld.registry;

import com.kjord021.nukerworld.CustomBlocks.RadioactiveBlock;
import com.kjord021.nukerworld.NukerWorld;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WEAPON_INFUSER = new Block(FabricBlockSettings.of(Material.METAL).strength(.2f).requiresTool());
    public static final RadioactiveBlock URANIUM_ORE = new RadioactiveBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool());

    public static void RegisterItems() {
        Registry.register(Registry.BLOCK, new Identifier(NukerWorld.MOD_ID, "weapon_infuser"), WEAPON_INFUSER);
        Registry.register(Registry.ITEM, new Identifier(NukerWorld.MOD_ID, "weapon_infuser"), new BlockItem(WEAPON_INFUSER, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier(NukerWorld.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(NukerWorld.MOD_ID, "uranium_ore"), new BlockItem(URANIUM_ORE, new FabricItemSettings().group(ItemGroup.MISC)));
    }

}
