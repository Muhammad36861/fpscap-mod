package com.yoru_topu.fpscap;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class FpsCapMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinecraftClient client = MinecraftClient.getInstance();
        client.options.getMaxFps().setValue(150);
        System.out.println("[FPS Cap Mod by yoru_topu] FPS cap set to 150.");
    }
}

