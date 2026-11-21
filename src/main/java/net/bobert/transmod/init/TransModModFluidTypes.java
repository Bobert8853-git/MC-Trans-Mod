/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.bobert.transmod.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.bobert.transmod.fluid.types.EstrogenFluidType;
import net.bobert.transmod.TransModMod;

public class TransModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, TransModMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ESTROGEN_TYPE = REGISTRY.register("estrogen", EstrogenFluidType::new);
}