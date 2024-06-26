
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minggudev.nuasaindonesia.init;

import net.minggudev.nuasaindonesia.item.RP5000Item;
import net.minggudev.nuasaindonesia.item.RP50000Item;
import net.minggudev.nuasaindonesia.item.RP2000Item;
import net.minggudev.nuasaindonesia.item.RP20000Item;
import net.minggudev.nuasaindonesia.item.RP1000Item;
import net.minggudev.nuasaindonesia.item.RP10000Item;
import net.minggudev.nuasaindonesia.item.RP100000Item;
import net.minggudev.nuasaindonesia.item.PiringPutihItem;
import net.minggudev.nuasaindonesia.item.PiringHitamItem;
import net.minggudev.nuasaindonesia.item.PempekMatangItem;
import net.minggudev.nuasaindonesia.item.PempekItem;
import net.minggudev.nuasaindonesia.item.MangkokKayuItem;
import net.minggudev.nuasaindonesia.item.KleponItem;
import net.minggudev.nuasaindonesia.item.IndomiematangItem;
import net.minggudev.nuasaindonesia.item.IndomieItem;
import net.minggudev.nuasaindonesia.NuasaIndonesiaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class NuasaIndonesiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NuasaIndonesiaMod.MODID);
	public static final RegistryObject<Item> INDOMIE = REGISTRY.register("indomie", () -> new IndomieItem());
	public static final RegistryObject<Item> INDOMIEMATANG = REGISTRY.register("indomiematang", () -> new IndomiematangItem());
	public static final RegistryObject<Item> PIRING_HITAM = REGISTRY.register("piring_hitam", () -> new PiringHitamItem());
	public static final RegistryObject<Item> KLEPON = REGISTRY.register("klepon", () -> new KleponItem());
	public static final RegistryObject<Item> MANGKOK_KAYU = REGISTRY.register("mangkok_kayu", () -> new MangkokKayuItem());
	public static final RegistryObject<Item> RP_1000 = REGISTRY.register("rp_1000", () -> new RP1000Item());
	public static final RegistryObject<Item> RP_2000 = REGISTRY.register("rp_2000", () -> new RP2000Item());
	public static final RegistryObject<Item> RP_5000 = REGISTRY.register("rp_5000", () -> new RP5000Item());
	public static final RegistryObject<Item> RP_10000 = REGISTRY.register("rp_10000", () -> new RP10000Item());
	public static final RegistryObject<Item> RP_20000 = REGISTRY.register("rp_20000", () -> new RP20000Item());
	public static final RegistryObject<Item> RP_50000 = REGISTRY.register("rp_50000", () -> new RP50000Item());
	public static final RegistryObject<Item> RP_100000 = REGISTRY.register("rp_100000", () -> new RP100000Item());
	public static final RegistryObject<Item> PEMPEK = REGISTRY.register("pempek", () -> new PempekItem());
	public static final RegistryObject<Item> PEMPEK_MATANG = REGISTRY.register("pempek_matang", () -> new PempekMatangItem());
	public static final RegistryObject<Item> PIRING_PUTIH = REGISTRY.register("piring_putih", () -> new PiringPutihItem());
	// Start of user code block custom items
	// End of user code block custom items
}
