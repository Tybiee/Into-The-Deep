package com.tybie.intothedeep.block;

import com.tybie.intothedeep.IntoTheDeep;
import com.tybie.intothedeep.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block DEEPGRIT = registerBlock("deepgrit",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(3.0F, 5.0F).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.INTO_THE_DEEP);
    private static Block registerBlock(String name, Block block, ItemGroup tab)
    {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(IntoTheDeep.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab)
    {
        return Registry.register(Registry.ITEM, new Identifier(IntoTheDeep.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks()
    {
        IntoTheDeep.LOGGER.debug("Registering mod blocks for " + IntoTheDeep.MOD_ID);
    }
}
