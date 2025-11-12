package com.tristenuto.carpetdiem.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import com.tristenuto.carpetdiem.CarpetDiem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(CarpetDiem.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
