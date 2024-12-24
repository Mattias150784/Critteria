package net.mattias.critteria.entity.client;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mattias.critteria.entity.animations.RatAnimations;
import net.mattias.critteria.entity.custom.RatEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class RatModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart bodybone;
	private final ModelPart tail;
	private final ModelPart frontlegs;
	private final ModelPart frontleg1;
	private final ModelPart frontleg2;
	private final ModelPart backlegs;
	private final ModelPart legnumber1;
	private final ModelPart legnumber2;
	private final ModelPart head;
	private final ModelPart rightear;
	private final ModelPart leftear;

	public RatModel(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.bodybone = this.body.getChild("bodybone");
		this.tail = this.bodybone.getChild("tail");
		this.frontlegs = this.body.getChild("frontlegs");
		this.frontleg1 = this.frontlegs.getChild("frontleg1");
		this.frontleg2 = this.frontlegs.getChild("frontleg2");
		this.backlegs = this.body.getChild("backlegs");
		this.legnumber1 = this.backlegs.getChild("legnumber1");
		this.legnumber2 = this.backlegs.getChild("legnumber2");
		this.head = this.body.getChild("head");
		this.rightear = this.head.getChild("rightear");
		this.leftear = this.head.getChild("leftear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bodybone = body.addOrReplaceChild("bodybone", CubeListBuilder.create().texOffs(1, 0).addBox(-2.175F, -4.0F, -3.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.325F, -1.0F, 1.0F));

		PartDefinition tail = bodybone.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 21).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.325F, 0.0F, 6.0F));

		PartDefinition frontlegs = body.addOrReplaceChild("frontlegs", CubeListBuilder.create(), PartPose.offset(1.5F, -0.5F, -1.5F));

		PartDefinition frontleg1 = frontlegs.addOrReplaceChild("frontleg1", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = frontleg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 3).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition frontleg2 = frontlegs.addOrReplaceChild("frontleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = frontleg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition backlegs = body.addOrReplaceChild("backlegs", CubeListBuilder.create(), PartPose.offset(1.5F, -0.5F, 3.5F));

		PartDefinition legnumber1 = backlegs.addOrReplaceChild("legnumber1", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = legnumber1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition legnumber2 = backlegs.addOrReplaceChild("legnumber2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = legnumber2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 11).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 21).addBox(-2.05F, -1.475F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-1.55F, -2.475F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.55F, -3.475F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.05F, -2.525F, -2.5F));

		PartDefinition rightear = head.addOrReplaceChild("rightear", CubeListBuilder.create(), PartPose.offset(0.925F, -2.0F, 0.0F));

		PartDefinition cube_r5 = rightear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 23).addBox(-1.0F, -1.0F, 0.01F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(22, 19).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.025F, 0.0F, -0.3403F, -0.0436F, 0.3971F));

		PartDefinition leftear = head.addOrReplaceChild("leftear", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.0F, 0.0F));

		PartDefinition cube_r6 = leftear.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 21).mirror().addBox(-1.0F, -1.0F, 0.01F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.025F, 0.0F, -0.3403F, 0.0436F, -0.3971F));

		PartDefinition cube_r7 = leftear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.025F, 0.0F, -0.3403F, 0.0436F, -0.3971F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(RatAnimations.walk, limbSwing, limbSwingAmount, 2F, 2.5F);
		this.animate(((RatEntity) entity).idleAnimationState, RatAnimations.idle, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return root;
	}
}