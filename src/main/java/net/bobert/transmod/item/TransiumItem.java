package net.bobert.transmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TransiumItem extends Item {
	public TransiumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}