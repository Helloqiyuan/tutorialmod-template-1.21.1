package com.qiyuan.tutorialmod.item;

import com.qiyuan.tutorialmod.TutorialMod;
import com.qiyuan.tutorialmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID,id));
    }
    public static void registerItemGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                TUTORIAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 1)
                        .displayName(Text.translatable("itemGroup.tutorial_group"))
                        .icon(() -> new ItemStack(ModItems.genshin_impact))
                        .entries(
                                (displayContext, entries) -> {
                                entries.add(ModItems.genshin_impact);
                                entries.add(ModBlocks.yellow_block);
                            }
                        )
                        .build()
        );
        TutorialMod.LOGGER.info("Registering Item Groups for TutorialMod and me!");
    }
}
