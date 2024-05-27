package net.syedali.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.syedali.tutorialmod.TutorialMod;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MONKEY.get()))
                            .title(Component.translatable("creativetab.tutorial_tab"))
                            .displayItems(((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.PICKLE.get());
                                pOutput.accept(ModItems.CURRY.get());
                            }))
                            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}