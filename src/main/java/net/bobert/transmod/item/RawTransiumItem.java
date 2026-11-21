package net.bobert.transmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawTransiumItem extends Item {
	public RawTransiumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}