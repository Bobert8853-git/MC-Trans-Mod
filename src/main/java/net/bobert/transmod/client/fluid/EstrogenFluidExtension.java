package net.bobert.transmod.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.bobert.transmod.init.TransModModFluids;
import net.bobert.transmod.init.TransModModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class EstrogenFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("trans_mod:block/estrogen")), new Material(Identifier.parse("trans_mod:block/estrogen")), null, null), TransModModFluids.ESTROGEN, TransModModFluids.FLOWING_ESTROGEN);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, TransModModFluidTypes.ESTROGEN_TYPE);
	}
}