package net.srtobbyas.mineria.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.srtobbyas.mineria.MineriaMOD;

public class ModTags
{

    // Paxel mineable tag
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> PAXEL_MINEABLE =
                tag("mineable/paxel");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(MineriaMOD.MOD_ID, name));
        }

        public static class Items
        {
            // Don't know if I'm using this one our not :]

            public static final Tags.IOptionalNamedTag<Item> ARROW =
                    tag("arrows");


            // Copper nugget tag

            public static final Tags.IOptionalNamedTag<Item> COPPER_NUGGETS = forgeTag("nuggets/copper");

            private static Tags.IOptionalNamedTag<Item> tag(String name) {
                return ItemTags.createOptional(new ResourceLocation(MineriaMOD.MOD_ID, name));
            }

            private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
                return ItemTags.createOptional(new ResourceLocation("forge", name));
            }
        }
    }
}
