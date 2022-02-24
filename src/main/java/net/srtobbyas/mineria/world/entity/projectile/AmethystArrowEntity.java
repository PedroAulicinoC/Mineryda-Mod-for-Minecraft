package net.srtobbyas.mineria.world.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.srtobbyas.mineria.item.ModItems;
import net.srtobbyas.mineria.world.entity.ModEntityType;

public class AmethystArrowEntity extends AbstractArrow
{
    private final Item referenceItem;

    public AmethystArrowEntity(EntityType<? extends AbstractArrow> type, Level level)
    {
        super(type, level);
        this.referenceItem = ModItems.AMETHYST_ARROW.get();
    }

    public AmethystArrowEntity(LivingEntity shooter, Level level, Item referenceItem)
    {
        super(ModEntityType.AMETHYST_ARROW.get(), shooter, level);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getPickupItem()
    {
        return new ItemStack(this.referenceItem);
    }
}
