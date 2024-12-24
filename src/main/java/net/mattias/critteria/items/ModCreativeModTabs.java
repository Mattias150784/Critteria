package net.mattias.critteria.items;

import net.mattias.critteria.Critteria;
import net.mattias.critteria.blocks.ModBlocks;
import net.mattias.critteria.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Critteria.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRITTERIA = CREATIVE_MODE_TABS.register("critteria",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHEESE.get()))
                    .title(Component.translatable("creativetab.critteria"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.CHEESE.get()));
                        pOutput.accept(new ItemStack(ModBlocks.CHEESE_BLOCK.get().asItem()));
                        pOutput.accept(new ItemStack(ModItems.DEAD_RAT.get()));
                        pOutput.accept(new ItemStack(ModItems.COOKED_RAT.get()));
                        pOutput.accept(new ItemStack(ModItems.RAT_SPAWN_EGG.get()));
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}