package net.bobert.transmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlockOfTransiumBlock extends Block {
	public BlockOfTransiumBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(30f, 10f).requiresCorrectToolForDrops());
	}
}