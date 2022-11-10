package com.tybie.intothedeep.item;

import com.tybie.intothedeep.IntoTheDeep;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public  static  Item DEEP_KELP = registerItem("deep_kelp",
            new Item(new FabricItemSettings().group(ModItemGroup.INTO_THE_DEEP)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(IntoTheDeep.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        IntoTheDeep.LOGGER.debug("Registering mod items for " + IntoTheDeep.MOD_ID);
    }
}
