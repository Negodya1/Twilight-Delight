package dev.xkmc.twilightdelight.init.registrate.delight;

import dev.xkmc.l2library.repack.registrate.util.entry.ItemEntry;
import dev.xkmc.twilightdelight.init.registrate.TDEffects;
import dev.xkmc.twilightdelight.init.registrate.TDItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.common.registry.ModEffects;

public enum DelightFood {
	HYDRA_PIECE(DelightFoodType.HYDRA_PIECE, 9, 2.0F,
			new EffectSupplier(() -> MobEffects.REGENERATION, 20, 0, 1)),
	RAW_VENISON_RIB(DelightFoodType.MEAT_PIECE, 2, 0.25f),
	COOKED_VENISON_RIB(DelightFoodType.MEAT_PIECE, 4, 0.875f),
	RAW_MEEF_SLICE(DelightFoodType.MEAT_PIECE, 1, 0.7F),
	COOKED_MEEF_SLICE(DelightFoodType.MEAT_PIECE, 3, 0.6F),
	RAW_INSECT(DelightFoodType.MEAT, 2, 0.2F),
	COOKED_INSECT(DelightFoodType.MEAT, 6, 0.6F),
	TORCHBERRY_COOKIE(DelightFoodType.COOKIE, 2, 0.2F,
			new EffectSupplier(() -> MobEffects.GLOWING, 200, 0, 1),
			new EffectSupplier(TDEffects.FIRE_RANGE, 200, 0, 0.3f)),
	CHOCOLATE_WAFER(DelightFoodType.NONE, 9, 0.6F),
	EXPERIMENT_113(DelightFoodType.MEAT_PIECE, 6, 0.7F,
			new EffectSupplier(TDEffects.TEMPORAL_SADNESS, 100, 0, 0.33f)),
	CHOCOLATE_113(DelightFoodType.MEAT_PIECE, 6, 0.7F,
			new EffectSupplier(TDEffects.TEMPORAL_SADNESS, 100, 0, 0.33f),
			new EffectSupplier(() -> MobEffects.DAMAGE_BOOST, 600, 4, 1)),
	MILKY_113(DelightFoodType.MEAT_PIECE, 6, 0.7F),
	GLOW_113(DelightFoodType.MEAT_PIECE, 6, 0.7F,
			new EffectSupplier(TDEffects.TEMPORAL_SADNESS, 100, 0, 0.33f),
			new EffectSupplier(() -> MobEffects.NIGHT_VISION, 1200, 0, 1),
			new EffectSupplier(() -> MobEffects.GLOWING, 1200, 0, 1)),
	HONEY_113(DelightFoodType.MEAT_PIECE, 6, 0.7F,
			new EffectSupplier(TDEffects.TEMPORAL_SADNESS, 100, 0, 0.33f),
			new EffectSupplier(() -> MobEffects.MOVEMENT_SPEED, 3600, 2, 1)),
	EXPERIMENT_110(DelightFoodType.MEAT, 12, 0.3F,
			new EffectSupplier(() -> MobEffects.CONFUSION, 1200, 0, 1),
			new EffectSupplier(() -> MobEffects.HEALTH_BOOST, 2400, 4, 1),
			new EffectSupplier(() -> MobEffects.NIGHT_VISION, 2400, 0, 1)),
	MEEF_WRAP(DelightFoodType.MEAT, 10, 0.8f,
			new EffectSupplier(() -> MobEffects.DAMAGE_BOOST, 1200, 0, 1),
			new EffectSupplier(() -> MobEffects.REGENERATION, 1200, 0, 1)),
	GHAST_BURGER(DelightFoodType.MEAT, 11, 0.8f,
			new EffectSupplier(() -> MobEffects.REGENERATION, 1200, 1, 1)),
	HYDRA_BURGER(DelightFoodType.MEAT, 18, 0.8f,
			new EffectSupplier(() -> MobEffects.REGENERATION, 1200, 1, 1),
			new EffectSupplier(() -> MobEffects.FIRE_RESISTANCE, 6000, 0, 1)),
	BERRY_STICK(DelightFoodType.STICK, 6, 0.3f,
			new EffectSupplier(() -> MobEffects.GLOWING, 200, 0, 1),
			new EffectSupplier(TDEffects.FIRE_RANGE, 200, 0, 1)),

	GLOWSTEW(DelightFoodType.BOWL, 7, 0.675F,
			new EffectSupplier(() -> MobEffects.GLOWING, 3600, 0, 1),
			new EffectSupplier(() -> MobEffects.NIGHT_VISION, 3600, 0, 1),
			new EffectSupplier(ModEffects.COMFORT, 1200, 0, 1)),
	MUSHGLOOM_SAUCE(DelightFoodType.BOWL, 5, 0.4f,
			new EffectSupplier(() -> MobEffects.GLOWING, 200, 0, 1)),
	GLOW_VENISON_RIB_WITH_PASTA(DelightFoodType.BOWL_MEAT, 12, 0.8f,
			new EffectSupplier(() -> MobEffects.GLOWING, 200, 0, 1),
			new EffectSupplier(ModEffects.NOURISHMENT, 3600, 0, 1)),
	MUSHGLOOM_MEEF_PASTA(DelightFoodType.BOWL_MEAT, 12, 0.8f,
			new EffectSupplier(() -> MobEffects.GLOWING, 100, 0, 1),
			new EffectSupplier(() -> MobEffects.DAMAGE_BOOST, 1200, 1, 1),
			new EffectSupplier(() -> MobEffects.REGENERATION, 1200, 1, 1),
			new EffectSupplier(ModEffects.NOURISHMENT, 3600, 0, 1)),
	FRIED_INSECT(DelightFoodType.BOWL_MEAT, 10, 0.8f,
			new EffectSupplier(ModEffects.NOURISHMENT, 3600, 0, 1)),
	THOUSAND_PLANT_STEW(DelightFoodType.BOWL, 10, 0.61f,
			new EffectSupplier(() -> MobEffects.HEALTH_BOOST, 600, 1, 1),
			new EffectSupplier(() -> MobEffects.CONFUSION, 300, 0, 0.1f),
			new EffectSupplier(ModEffects.COMFORT, 1200, 0, 1)),
	GRILLED_GHAST(DelightFoodType.BOWL_MEAT, 10, 0.8f,
			new EffectSupplier(ModEffects.NOURISHMENT, 6000, 0, 1)),
	PLATE_OF_LILY_CHICKEN(DelightFoodType.BOWL_MEAT, 16, 0.9f,
			new EffectSupplier(() -> MobEffects.FIRE_RESISTANCE, 6000, 0, 1),
			new EffectSupplier(ModEffects.NOURISHMENT, 6000, 0, 1)),
	PLATE_OF_FIERY_SNAKES(DelightFoodType.BOWL_MEAT, 20, 1.9f,
			new EffectSupplier(ModEffects.NOURISHMENT, 6000, 0, 1),
			new EffectSupplier(ModEffects.COMFORT, 6000, 0, 1),
			new EffectSupplier(() -> MobEffects.DAMAGE_BOOST, 6000, 1, 1),
			new EffectSupplier(() -> MobEffects.REGENERATION, 400, 1, 1)),
	PLATE_OF_MEEF_WELLINGTON(DelightFoodType.BOWL_MEAT, 14, 0.8f,
			new EffectSupplier(() -> MobEffects.DAMAGE_BOOST, 3600, 1, 1),
			new EffectSupplier(() -> MobEffects.REGENERATION, 3600, 1, 1),
			new EffectSupplier(() -> MobEffects.GLOWING, 200, 0, 1),
			new EffectSupplier(ModEffects.NOURISHMENT, 6000, 0, 1)),

	THORN_ROSE_TEA(DelightFoodType.ROSE, 4, 0.25f,
			new EffectSupplier(() -> MobEffects.REGENERATION, 300, 1, 1)),
	TORCHBERRY_JUICE(DelightFoodType.DRINK, 4, 0.25f,
			new EffectSupplier(TDEffects.FIRE_RANGE, 1200, 0, 1)),
	PHYTOCHEMICAL_JUICE(DelightFoodType.DRINK, 4, 0.25f,
			new EffectSupplier(TDEffects.POISON_RANGE, 1200, 0, 1)),
	GLACIER_ICE_TEA(DelightFoodType.DRINK, 4, 0.25f,
			new EffectSupplier(TDEffects.FROZEN_RANGE, 1200, 0, 1)),
	TWILIGHT_SPRING(DelightFoodType.DRINK, 0, 0,
			new EffectSupplier(() -> MobEffects.DAMAGE_RESISTANCE, 1200, 1, 1)),
	TEAR_DRINK(DelightFoodType.DRINK, 1, 0,
			new EffectSupplier(() -> MobEffects.FIRE_RESISTANCE, 12000, 0, 1),
			new EffectSupplier(TDEffects.TEMPORAL_SADNESS, 1200, 0, 1)),
	;

	public final ItemEntry<Item> item;

	DelightFood(DelightFoodType r, int nutrition, float saturation, EffectSupplier... effects) {
		item = TDItems.simpleFood(r, name(), nutrition, saturation, effects);
	}

	public static void register() {
	}

}
