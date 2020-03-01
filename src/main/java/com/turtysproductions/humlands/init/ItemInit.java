package com.turtysproductions.humlands.init;

import com.turtysproductions.humlands.HumlandsMod;
import com.turtysproductions.humlands.item.HumlandsTab;
import com.turtysproductions.humlands.objects.items.GlintingItem;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HumlandsMod.MOD_ID);
	
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(HumlandsTab.HUMLANDS)));
	
	public static final RegistryObject<Item> ROYAL_SLIME = ITEMS.register("royal_slime", () -> new Item(new Item.Properties().group(HumlandsTab.HUMLANDS)));
	public static final RegistryObject<Item> ROYAL_FLAN = ITEMS.register("royal_flan", () -> new Item(new Item.Properties().group(HumlandsTab.HUMLANDS).food(new Food.Builder().hunger(4).saturation(2.0f).effect(new EffectInstance(Effects.SPEED, 600, 3), 1).build())));
	public static final RegistryObject<Item> ROYAL_FLAN_RAW = ITEMS.register("royal_flan_raw", () -> new Item(new Item.Properties().group(HumlandsTab.HUMLANDS)));
	
	public static final RegistryObject<Item> SUPER_ROYAL_SLIME = ITEMS.register("super_royal_slime", () -> new GlintingItem(new Item.Properties().group(HumlandsTab.HUMLANDS).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> SUPER_ROYAL_FLAN = ITEMS.register("super_royal_flan", () -> new GlintingItem(new Item.Properties().group(HumlandsTab.HUMLANDS).rarity(Rarity.EPIC).food(new Food.Builder().hunger(8).saturation(4.0f).effect(new EffectInstance(Effects.SPEED, 6000, 5), 1).effect(new EffectInstance(Effects.HEALTH_BOOST), 1).build())));
	public static final RegistryObject<Item> SUPER_ROYAL_FLAN_RAW = ITEMS.register("super_royal_flan_raw", () -> new GlintingItem(new Item.Properties().group(HumlandsTab.HUMLANDS).rarity(Rarity.EPIC)));
	
	
	
}
