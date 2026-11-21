/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bobert.transmod.init;

import net.neoforged.neoforge.transfer.fluid.BucketResourceHandler;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.bobert.transmod.item.*;
import net.bobert.transmod.TransModMod;

import java.util.function.Function;

@EventBusSubscriber
public class TransModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TransModMod.MODID);
	public static final DeferredItem<Item> TRANS_SWORD;
	public static final DeferredItem<Item> TRANSIUM_ORE;
	public static final DeferredItem<Item> TRANSIUM;
	public static final DeferredItem<Item> TRANS_PICKAXE;
	public static final DeferredItem<Item> BLOCK_OF_TRANSIUM;
	public static final DeferredItem<Item> RAW_TRANSIUM;
	public static final DeferredItem<Item> ESTROGEN_BUCKET;
	public static final DeferredItem<Item> TRANS_DIMENSION;
	static {
		TRANS_SWORD = register("trans_sword", TransSwordItem::new);
		TRANSIUM_ORE = block(TransModModBlocks.TRANSIUM_ORE, new Item.Properties().rarity(Rarity.EPIC));
		TRANSIUM = register("transium", TransiumItem::new);
		TRANS_PICKAXE = register("trans_pickaxe", TransPickaxeItem::new);
		BLOCK_OF_TRANSIUM = block(TransModModBlocks.BLOCK_OF_TRANSIUM);
		RAW_TRANSIUM = register("raw_transium", RawTransiumItem::new);
		ESTROGEN_BUCKET = register("estrogen_bucket", EstrogenItem::new);
		TRANS_DIMENSION = register("trans_dimension", TransDimensionItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.Fluid.ITEM, (stack, access) -> new BucketResourceHandler(access), ESTROGEN_BUCKET.get());
	}
}