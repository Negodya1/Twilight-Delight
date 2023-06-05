package dev.xkmc.twilightdelight.content.effect;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class FireRange extends RangeRenderEffect {

	public FireRange() {
		super(MobEffectCategory.BENEFICIAL, -39424);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		entity.clearFire();
		super.applyEffectTick(entity, amplifier);
	}

	@Override
	protected void applyEffect(LivingEntity target, int amplifier) {
		target.setSecondsOnFire(amplifier + 5);
	}

	@Override
	protected ParticleOptions getParticle() {
		return ParticleTypes.FLAME;
	}
}
