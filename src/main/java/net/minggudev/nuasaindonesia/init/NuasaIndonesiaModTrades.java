
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.minggudev.nuasaindonesia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NuasaIndonesiaModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(NuasaIndonesiaModItems.RP_2000.get()), new ItemStack(NuasaIndonesiaModItems.RP_1000.get(), 2), new ItemStack(NuasaIndonesiaModItems.INDOMIE.get()), 10, 5, 0.05f));
		}
	}
}
