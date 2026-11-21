package net.bobert.transmod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.bobert.transmod.init.TransModModFluids;

public class EstrogenItem extends BucketItem {
	public EstrogenItem(Item.Properties properties) {
		super(TransModModFluids.ESTROGEN.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}