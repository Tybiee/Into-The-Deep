package com.tybie.intothedeep.item;

import com.tybie.intothedeep.IntoTheDeep;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup INTO_THE_DEEP = FabricItemGroupBuilder.build(
            new Identifier(IntoTheDeep.MOD_ID, "into_the_deep"), () -> new ItemStack(ModItems.DEEP_KELP));
}
