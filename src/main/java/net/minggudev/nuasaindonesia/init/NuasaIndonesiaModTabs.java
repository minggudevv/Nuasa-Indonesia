
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minggudev.nuasaindonesia.init;

import net.minggudev.nuasaindonesia.NuasaIndonesiaMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NuasaIndonesiaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuasaIndonesiaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NuasaIndonesiaModItems.MANGKOK_KAYU.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NuasaIndonesiaModItems.RP_1000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_2000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_5000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_10000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_20000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_50000.get());
			tabData.accept(NuasaIndonesiaModItems.RP_100000.get());
			tabData.accept(NuasaIndonesiaModItems.PIRING_PUTIH.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NuasaIndonesiaModItems.INDOMIEMATANG.get());
			tabData.accept(NuasaIndonesiaModItems.INDOMIE.get());
			tabData.accept(NuasaIndonesiaModItems.KLEPON.get());
			tabData.accept(NuasaIndonesiaModItems.PEMPEK.get());
			tabData.accept(NuasaIndonesiaModItems.PEMPEK_MATANG.get());
		}
	}
}
