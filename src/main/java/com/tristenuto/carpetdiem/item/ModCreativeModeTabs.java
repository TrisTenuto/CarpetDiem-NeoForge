package com.tristenuto.carpetdiem.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.tristenuto.carpetdiem.CarpetDiem;
import com.tristenuto.carpetdiem.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CarpetDiem.MOD_ID);

    public static final Supplier<CreativeModeTab> CARPET_TAB = CREATIVE_MODE_TABS.register("carpet_diem_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("tab.carpet_diem_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ARCADE.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ARCADE.get());
                        output.accept(ModBlocks.AQUA.get());
                        output.accept(ModBlocks.CROCODILE.get());
                        output.accept(ModBlocks.DAISY.get());
                        output.accept(ModBlocks.FLORAL.get());
                        output.accept(ModBlocks.FRACTAL.get());
                        output.accept(ModBlocks.GINGHAM.get());
                        output.accept(ModBlocks.GREEK.get());
                        output.accept(ModBlocks.LINES.get());
                        output.accept(ModBlocks.RAINBOW.get());
                        output.accept(ModBlocks.RIPPLES.get());
                        output.accept(ModBlocks.STRIPED.get());
                        output.accept(ModBlocks.RED_SUN.get());
                        output.accept(ModBlocks.VINE.get());
                        output.accept(ModBlocks.WEAVE.get());
                        output.accept(ModBlocks.WHOOSH.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
