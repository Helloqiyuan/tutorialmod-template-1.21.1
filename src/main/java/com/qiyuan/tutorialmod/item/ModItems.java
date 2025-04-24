package com.qiyuan.tutorialmod.item;

import com.qiyuan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item genshin_impact = registerItems("genshin_impact",new Item(new Item.Settings()));
    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id),item);
    }
    private static void addItemToGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(genshin_impact);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.TUTORIAL_GROUP).register(ModItems::addItemToGroup);
        TutorialMod.LOGGER.info("Registering Items for TutorialMod and me!");
    }
}
