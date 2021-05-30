
package net.texstudio.memesproject.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class StonePlateItem extends Item {
	public StonePlateItem() {
		super(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Override
	public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
		if (slot == EquipmentSlot.MAINHAND) {
			return ImmutableMultimap.of(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "item_damage", (double) -2, EntityAttributeModifier.Operation.ADDITION),
					EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "item_attack_speed", -2.4, EntityAttributeModifier.Operation.ADDITION));
		}
		return super.getAttributeModifiers(slot);
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
