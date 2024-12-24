package net.mattias.critteria.event;

import net.mattias.critteria.Critteria;

import net.mattias.critteria.entity.client.ModModelLayers;
import net.mattias.critteria.entity.client.RatModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Critteria.MOD_ID, bus =  Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RAT_LAYER, RatModel::createBodyLayer);



    }

}
