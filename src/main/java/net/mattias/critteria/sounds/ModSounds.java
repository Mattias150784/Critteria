package net.mattias.critteria.sounds;

import net.mattias.critteria.Critteria;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Critteria.MOD_ID);

    public static final RegistryObject<SoundEvent> RAT_IDLE = registerSoundEvents("rat_idle");
    public static final RegistryObject<SoundEvent> RAT_WALK = registerSoundEvents("rat_walk");
    public static final RegistryObject<SoundEvent> RAT_HIT = registerSoundEvents("rat_hit");

    public static final RegistryObject<SoundEvent> PANGOLIN_IDLE = registerSoundEvents("pangolin_idle");
    public static final RegistryObject<SoundEvent> PANGOLIN_WALK = registerSoundEvents("pangolin_walk");
    public static final RegistryObject<SoundEvent> PANGOLIN_HIT = registerSoundEvents("pangolin_hit");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Critteria.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}