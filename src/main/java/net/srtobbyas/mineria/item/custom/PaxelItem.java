package net.srtobbyas.mineria.item.custom;

import net.minecraft.world.item.*;
import net.srtobbyas.mineria.util.ModTags;

public class PaxelItem extends DiggerItem implements Vanishable
{
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINEABLE, pProperties);
    }
}

