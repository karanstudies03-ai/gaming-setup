package com.gamingsetup;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class GamingSetupMod implements ModInitializer {
    public static final String MOD_ID = "gamingsetup";

    @Override
    public void onInitialize() {
        ModBlocks.init();
        ModBlockEntities.init();
        ModItems.init();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.PC);
            entries.add(ModBlocks.MONITOR);
            entries.add(ModBlocks.GAMING_CHAIR);
            entries.add(ModBlocks.DESK);
            entries.add(ModBlocks.KEYBOARD);
            entries.add(ModBlocks.MOUSE);
            entries.add(ModItems.CABLE);
        });
    }
}
