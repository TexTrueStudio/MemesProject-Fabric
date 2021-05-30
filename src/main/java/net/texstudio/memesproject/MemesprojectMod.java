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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.texstudio.memesproject.item.StonePlateItem;
import net.texstudio.memesproject.item.StoneNuggetItem;
import net.texstudio.memesproject.item.StoneIngotItem;
import net.texstudio.memesproject.block.StoneOreBlock;
import net.texstudio.memesproject.block.StoneBlockBlock;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class MemesprojectMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item StoneIngot_ITEM = Registry.register(Registry.ITEM, id("stone_ingot"), new StoneIngotItem());
	public static final Item StoneNugget_ITEM = Registry.register(Registry.ITEM, id("stone_nugget"), new StoneNuggetItem());
	public static final Item StonePlate_ITEM = Registry.register(Registry.ITEM, id("stone_plate"), new StonePlateItem());
	public static final Block StoneOre_BLOCK = Registry.register(Registry.BLOCK, id("stone_ore"), new StoneOreBlock());
	public static final BlockItem StoneOre_ITEM = Registry.register(Registry.ITEM, id("stone_ore"),
			new BlockItem(StoneOre_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block StoneBlock_BLOCK = Registry.register(Registry.BLOCK, id("stone_block"), new StoneBlockBlock());
	public static final BlockItem StoneBlock_ITEM = Registry.register(Registry.ITEM, id("stone_block"),
			new BlockItem(StoneBlock_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MemesprojectMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("memesproject", s);
	}
}
