/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bobert.transmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.bobert.transmod.TransModMod;

@EventBusSubscriber
public class TransModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TransModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TRANS_TOOLS_CREATIVE_TAB = REGISTRY.register("trans_tools_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trans_mod.trans_tools_creative_tab")).icon(() -> new ItemStack(TransModModItems.TRANS_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TransModModItems.TRANS_SWORD.get());
				tabData.accept(TransModModBlocks.TRANSIUM_ORE.get().asItem());
				tabData.accept(TransModModItems.TRANSIUM.get());
				tabData.accept(TransModModItems.TRANS_PICKAXE.get());
				tabData.accept(TransModModBlocks.BLOCK_OF_TRANSIUM.get().asItem());
				tabData.accept(TransModModItems.RAW_TRANSIUM.get());
				tabData.accept(TransModModItems.ESTROGEN_BUCKET.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TransModModItems.TRANS_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TransModModBlocks.TRANSIUM_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TransModModItems.TRANSIUM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TransModModItems.TRANS_PICKAXE.get());
			tabData.accept(TransModModItems.TRANS_DIMENSION.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TransModModBlocks.BLOCK_OF_TRANSIUM.get().asItem());
		}
	}
}