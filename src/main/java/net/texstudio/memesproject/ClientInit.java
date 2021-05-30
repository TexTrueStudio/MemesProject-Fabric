/*
*    MCreator note:
*
*    If you lock base mod element files, you can edit this file and the proxy files
*    and they won't get overwritten. If you change your mod package or modid, you
*    need to apply these changes to this file MANUALLY.
*
*
*    If you do not lock base mod element files in Workspace settings, this file
*    will be REGENERATED on each build.
*
*/
package net.texstudio.memesproject;

import net.minecraft.client.render.RenderLayer;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.ClientModInitializer;

public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(MemesprojectMod.StoneOre_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(MemesprojectMod.StoneBlock_BLOCK, RenderLayer.getCutoutMipped());
		HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
		});
		ClientTickEvents.END_CLIENT_TICK.register((client) -> {
		});
	}
}
