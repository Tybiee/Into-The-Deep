package com.tybie.intothedeep.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class GiantSquid extends PathAwareEntity
{
    public GiantSquid(EntityType<? extends PathAwareEntity> entityType, World world)
    {
        super(entityType, world);
    }
}
