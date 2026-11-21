package net.bobert.transmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class TransPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 8f, 0, 8, TagKey.create(Registries.ITEM, Identifier.parse("trans_mod:trans_pickaxe_repair_items")));

	public TransPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 15f, 0f).rarity(Rarity.EPIC).fireResistant());
	}
}