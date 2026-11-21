package net.bobert.transmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class TransSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 8f, 0, 4, TagKey.create(Registries.ITEM, Identifier.parse("trans_mod:trans_sword_repair_items")));

	public TransSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, -2f).rarity(Rarity.EPIC).fireResistant());
	}
}