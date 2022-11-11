package com.tybie.intothedeep;

import com.tybie.intothedeep.block.ModBlocks;
import com.tybie.intothedeep.item.ModItems;
import com.tybie.intothedeep.item.ModTools;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntoTheDeep implements ModInitializer
{
    public static final String MOD_ID = "intothedeep";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModTools.registerModTools();
    }
}
