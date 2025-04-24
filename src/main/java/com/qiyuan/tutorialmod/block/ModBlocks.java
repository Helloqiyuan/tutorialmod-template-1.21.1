package com.qiyuan.tutorialmod.block;

import com.qiyuan.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block yellow_block = register("yellow_block", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));
    public static void registerBlockItems(String id, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, id),  block);
    }
    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
