
package net.texstudio.memesproject.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class StoneBlockBlock extends Block {
	public StoneBlockBlock() {
		super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(10F, 10F).luminance(0)
				.breakByTool(FabricToolTags.PICKAXES, 2));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
