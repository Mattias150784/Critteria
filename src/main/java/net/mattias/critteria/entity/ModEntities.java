package net.mattias.critteria.entity;

import net.mattias.critteria.Critteria;
import net.mattias.critteria.entity.custom.RatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Critteria.MOD_ID);

    public static final RegistryObject<EntityType<RatEntity>> RAT =
            ENTITY_TYPES.register("rat", () -> EntityType.Builder.of(RatEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f)
                    .clientTrackingRange(4)
                    .build("rat"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
