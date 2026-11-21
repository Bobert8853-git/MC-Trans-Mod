/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bobert.transmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.bobert.transmod.block.TransiumOreBlock;
import net.bobert.transmod.block.TransDimensionPortalBlock;
import net.bobert.transmod.block.EstrogenBlock;
import net.bobert.transmod.block.BlockOfTransiumBlock;
import net.bobert.transmod.TransModMod;

import java.util.function.Function;

public class TransModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TransModMod.MODID);
	public static final DeferredBlock<Block> TRANSIUM_ORE;
	public static final DeferredBlock<Block> BLOCK_OF_TRANSIUM;
	public static final DeferredBlock<Block> ESTROGEN;
	public static final DeferredBlock<Block> TRANS_DIMENSION_PORTAL;
	static {
		TRANSIUM_ORE = register("transium_ore", TransiumOreBlock::new);
		BLOCK_OF_TRANSIUM = register("block_of_transium", BlockOfTransiumBlock::new);
		ESTROGEN = register("estrogen", EstrogenBlock::new);
		TRANS_DIMENSION_PORTAL = register("trans_dimension_portal", TransDimensionPortalBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}