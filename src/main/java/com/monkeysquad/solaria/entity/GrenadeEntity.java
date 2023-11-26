
package com.monkeysquad.solaria.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import com.monkeysquad.solaria.init.SolariaModItems;
import com.monkeysquad.solaria.init.SolariaModEntities;

public class GrenadeEntity extends AbstractArrow implements ItemSupplier {
	public GrenadeEntity(EntityType<? extends GrenadeEntity> type, Level world) {
		super(type, world);
	}

	public GrenadeEntity(EntityType<? extends GrenadeEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GrenadeEntity(EntityType<? extends GrenadeEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(SolariaModItems.TREST);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(SolariaModItems.GRENADE);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static GrenadeEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		GrenadeEntity entityarrow = new GrenadeEntity(SolariaModEntities.GRENADE, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static GrenadeEntity shoot(LivingEntity entity, LivingEntity target) {
		GrenadeEntity entityarrow = new GrenadeEntity(SolariaModEntities.GRENADE, entity, entity.level());
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level().playSound((Player) null, (double) x, (double) y, (double) z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
