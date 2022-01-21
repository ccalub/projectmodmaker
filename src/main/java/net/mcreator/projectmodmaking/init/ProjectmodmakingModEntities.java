
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.projectmodmaking.entity.ToadEntity;
import net.mcreator.projectmodmaking.entity.TerraOwlEntity;
import net.mcreator.projectmodmaking.entity.EmberSnailEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectmodmakingModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<EmberSnailEntity> EMBER_SNAIL = register("ember_snail",
			EntityType.Builder.<EmberSnailEntity>of(EmberSnailEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmberSnailEntity::new).fireImmune().sized(1.4f, 0.9f));
	public static final EntityType<TerraOwlEntity> TERRA_OWL = register("terra_owl",
			EntityType.Builder.<TerraOwlEntity>of(TerraOwlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerraOwlEntity::new).sized(0.4f, 0.7f));
	public static final EntityType<ToadEntity> TOAD = register("toad", EntityType.Builder.<ToadEntity>of(ToadEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadEntity::new).sized(1f, 1f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EmberSnailEntity.init();
			TerraOwlEntity.init();
			ToadEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EMBER_SNAIL, EmberSnailEntity.createAttributes().build());
		event.put(TERRA_OWL, TerraOwlEntity.createAttributes().build());
		event.put(TOAD, ToadEntity.createAttributes().build());
	}
}
