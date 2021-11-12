package chalkboardmods.floralflair;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FloralFlairClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.JUNGLE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_JUNGLE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.SUNSET_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_SUNSET_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.PULSE_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_PULSE_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FAIRY_BLOSSOM, RenderLayer.getCutout());
    }
}
