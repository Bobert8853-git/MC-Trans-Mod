package net.bobert.transmod.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.bobert.transmod.init.TransModModItems;
import net.bobert.transmod.init.TransModModFluids;
import net.bobert.transmod.init.TransModModFluidTypes;
import net.bobert.transmod.init.TransModModBlocks;

public abstract class EstrogenFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TransModModFluidTypes.ESTROGEN_TYPE.get(), () -> TransModModFluids.ESTROGEN.get(), () -> TransModModFluids.FLOWING_ESTROGEN.get())
			.explosionResistance(100f).bucket(() -> TransModModItems.ESTROGEN_BUCKET.get()).block(() -> (LiquidBlock) TransModModBlocks.ESTROGEN.get());

	private EstrogenFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EstrogenFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EstrogenFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}