/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.bobert.transmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;

import net.bobert.transmod.fluid.EstrogenFluid;
import net.bobert.transmod.TransModMod;

public class TransModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, TransModMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ESTROGEN = REGISTRY.register("estrogen", EstrogenFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ESTROGEN = REGISTRY.register("flowing_estrogen", EstrogenFluid.Flowing::new);
}