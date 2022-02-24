package net.srtobbyas.mineria.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.srtobbyas.mineria.item.ModItems;
import net.srtobbyas.mineria.world.entity.projectile.AmethystArrowEntity;

public class AmethystArrow extends ArrowItem
{
    public float damage;

    public AmethystArrow(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    public AmethystArrow(Properties properties)
    {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack p_40514_, LivingEntity shooter)
    {
        AmethystArrowEntity arrow = new AmethystArrowEntity(shooter, level, ModItems.AMETHYST_ARROW.get());
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player)
    {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == AmethystArrow.class;
    }
}
