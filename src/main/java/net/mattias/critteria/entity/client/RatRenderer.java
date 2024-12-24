package net.mattias.critteria.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.mattias.critteria.Critteria;
import net.mattias.critteria.entity.custom.RatEntity;
import net.mattias.critteria.entity.variant.RatVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class RatRenderer extends MobRenderer<RatEntity, RatModel<RatEntity>> {
    private static final Map<RatVariant, ResourceLocation> LOCATION_BY_VARIANT = Util.make(Maps.newEnumMap(RatVariant.class), map -> {
        map.put(RatVariant.GRAY, new ResourceLocation(Critteria.MOD_ID, "textures/entity/gray_rat.png"));
        map.put(RatVariant.BLACK, new ResourceLocation(Critteria.MOD_ID, "textures/entity/black_rat.png"));
        map.put(RatVariant.BROWN, new ResourceLocation(Critteria.MOD_ID, "textures/entity/brown_rat.png"));
    });

    public RatRenderer(EntityRendererProvider.Context context) {
        super(context, new RatModel<>(context.bakeLayer(ModModelLayers.RAT_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(RatEntity entity) {
        if (entity.hasCustomName()) {
            String customName = entity.getCustomName().getString();
            if ("Remy".equalsIgnoreCase(customName) || "Remi".equalsIgnoreCase(customName)) {
                return new ResourceLocation(Critteria.MOD_ID, "textures/entity/remy_rat.png");
            }
        }


        RatVariant variant = entity.getVariant();
        if (variant == null) {
            return LOCATION_BY_VARIANT.get(RatVariant.GRAY);
        }
        return LOCATION_BY_VARIANT.get(variant);
    }



    @Override
    public void render(RatEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        }
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
