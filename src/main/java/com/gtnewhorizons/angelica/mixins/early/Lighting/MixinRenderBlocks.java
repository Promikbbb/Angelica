package com.gtnewhorizons.angelica.mixins.early.Lighting;

import net.minecraft.client.renderer.RenderBlocks;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Slice;

import com.gtnewhorizons.angelica.client.Shaders;

@Mixin(RenderBlocks.class)
public class MixinRenderBlocks {

    // All of these expect 1 replacement only
    @ModifyConstant(
            method = { "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockBed(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockDoor(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockLiquid(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockCactusImpl(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithColorMultiplier(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockSandFalling(Lnet/minecraft/block/Block;Lnet/minecraft/world/World;IIII)V" },
            constant = @Constant(floatValue = 0.5F),
            expect = 1)
    public float angelica$blockSingleLightLevel05(float constant) {
        return Shaders.blockLightLevel05;
    }

    @ModifyConstant(
            method = { "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockBed(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockLiquid(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockDoor(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockCactusImpl(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithColorMultiplier(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockSandFalling(Lnet/minecraft/block/Block;Lnet/minecraft/world/World;IIII)V" },
            constant = @Constant(floatValue = 0.6F),
            expect = 1)
    public float angelica$blockSingleLightLevel06(float constant) {
        return Shaders.blockLightLevel06;
    }

    @ModifyConstant(
            method = { "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockBed(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockLiquid(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockDoor(Lnet/minecraft/block/Block;III)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockCactusImpl(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithColorMultiplier(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderBlockSandFalling(Lnet/minecraft/block/Block;Lnet/minecraft/world/World;IIII)V" },
            constant = @Constant(floatValue = 0.8F),
            expect = 1)
    public float angelica$blockSingleLightLevel08(float constant) {
        return Shaders.blockLightLevel08;
    }

    // Piston Extension - Differing expectations, and slicing required

    @ModifyConstant(
            method = "Lnet/minecraft/client/renderer/RenderBlocks;renderPistonExtension(Lnet/minecraft/block/Block;IIIZ)Z",
            constant = @Constant(floatValue = 0.5F),
            expect = 3,
            slice = @Slice(from = @At(value = "CONSTANT", args = "doubleValue=8.0D", ordinal = 0)))
    public float angelica$pistonBlockLightLevel05(float constant) {
        return Shaders.blockLightLevel05;
    }

    @ModifyConstant(
            method = "Lnet/minecraft/client/renderer/RenderBlocks;renderPistonExtension(Lnet/minecraft/block/Block;IIIZ)Z",
            constant = @Constant(floatValue = 0.6F),
            expect = 12)
    public float angelica$pistonBlockLightLevel06(float constant) {
        return Shaders.blockLightLevel06;
    }

    @ModifyConstant(
            method = "Lnet/minecraft/client/renderer/RenderBlocks;renderPistonExtension(Lnet/minecraft/block/Block;IIIZ)Z",
            constant = @Constant(floatValue = 0.8F),
            expect = 4)
    public float angelica$pistonBlockLightLevel08(float constant) {
        return Shaders.blockLightLevel08;
    }

    // BlockWithAmbientOcclusion

    @ModifyConstant(
            method = {
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusionPartial(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusion(Lnet/minecraft/block/Block;IIIFFF)Z" },
            constant = @Constant(floatValue = 0.5F))
    public float angelica$multipleBlockLightLevel05(float constant) {
        return Shaders.blockLightLevel05;
    }

    @ModifyConstant(
            method = {
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusionPartial(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusion(Lnet/minecraft/block/Block;IIIFFF)Z" },
            constant = @Constant(floatValue = 0.6F))
    public float angelica$multipleBlockLightLevel06(float constant) {
        return Shaders.blockLightLevel06;
    }

    @ModifyConstant(
            method = {
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusionPartial(Lnet/minecraft/block/Block;IIIFFF)Z",
                    "Lnet/minecraft/client/renderer/RenderBlocks;renderStandardBlockWithAmbientOcclusion(Lnet/minecraft/block/Block;IIIFFF)Z" },
            constant = @Constant(floatValue = 0.8F))
    public float angelica$multipleBlockLightLevel08(float constant) {
        return Shaders.blockLightLevel08;
    }

}