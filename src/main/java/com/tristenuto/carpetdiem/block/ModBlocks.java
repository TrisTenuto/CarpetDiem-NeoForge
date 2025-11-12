package com.tristenuto.carpetdiem.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.tristenuto.carpetdiem.CarpetDiem;
import com.tristenuto.carpetdiem.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CarpetDiem.MOD_ID);

    public static final DeferredBlock<Block> ARCADE = registerBlock("arcade_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> AQUA = registerBlock("aqua_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> CROCODILE = registerBlock("crocodile_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> DAISY = registerBlock("daisy_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> FLORAL = registerBlock("floral_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> FRACTAL = registerBlock("fractal_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> GINGHAM = registerBlock("gingham_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> GREEK = registerBlock("greek_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> LINES = registerBlock("lines_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> RAINBOW = registerBlock("rainbow_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> RIPPLES = registerBlock("ripples_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> STRIPED = registerBlock("striped_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> RED_SUN = registerBlock("red_sun_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> VINE = registerBlock("vine_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> WEAVE = registerBlock("weave_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));
    public static final DeferredBlock<Block> WHOOSH = registerBlock("whoosh_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
