package net.srtobbyas.mineria.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties COPPER_BEETROOT =
            new FoodProperties.Builder().nutrition(3).saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200), 1f).build();

    public static final FoodProperties AMETHYST_BERRY =
            new FoodProperties.Builder().nutrition(5).saturationMod(1.5f)
                    .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1800), 1f).build();

    public static final FoodProperties MAGNOLIUM_BERRY =
            new FoodProperties.Builder().nutrition(5).saturationMod(1.5f)
                    .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 400), 1f).build();

}
