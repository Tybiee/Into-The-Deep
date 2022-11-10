package com.tybie.intothedeep.item;

import com.tybie.intothedeep.IntoTheDeep;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTools
{

    public static ReedItem BREATHING_REED = registerReedItem("breathing_reed",
            new ReedItem(BambooToolMaterial.INSTANCE, new FabricItemSettings().group(ModItemGroup.INTO_THE_DEEP)));

    private static ReedItem registerReedItem(String name, ReedItem item)
    {
        return Registry.register(Registry.ITEM, new Identifier(IntoTheDeep.MOD_ID, name), item);
    }

    public static void registerModTools()
    {
        IntoTheDeep.LOGGER.debug("Registering mod tools for " + IntoTheDeep.MOD_ID);
    }
}
