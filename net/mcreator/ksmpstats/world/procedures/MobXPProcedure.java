/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraftforge.event.entity.living.LivingDeathEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MobXPProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onEntityDeath(LivingDeathEvent event) {
/* 20 */     if (event != null && event.getEntity() != null) {
/* 21 */       execute((Event)event, event.getEntity(), event.getSource().m_7639_());
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity, Entity sourceentity) {
/* 26 */     execute(null, entity, sourceentity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
/* 30 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 32 */     if (sourceentity instanceof net.minecraft.world.entity.player.Player) {
/* 33 */       LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21233_() : -1.0F) <= 10.0F) {
/*    */ 
/*    */         
/* 36 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 5.0D;
/* 37 */         sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */               capability.XP = _setval;
/*    */               capability.syncPlayerVariables(sourceentity);
/*    */             });
/*    */       } else {
/* 42 */         LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21233_() : -1.0F) > 10.0F) {
/* 43 */           LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21233_() : -1.0F) <= 20.0F) {
/*    */ 
/*    */             
/* 46 */             double d = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 10.0D;
/* 47 */             sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */                   capability.XP = _setval; capability.syncPlayerVariables(sourceentity);
/*    */                 }); return;
/*    */           } 
/*    */         } 
/* 52 */         LivingEntity livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity2.m_21233_() : -1.0F) > 20.0F) {
/* 53 */           LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21233_() : -1.0F) <= 50.0F) {
/*    */ 
/*    */             
/* 56 */             double d = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 20.0D;
/* 57 */             sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */                   capability.XP = _setval; capability.syncPlayerVariables(sourceentity);
/*    */                 }); return;
/*    */           } 
/*    */         } 
/* 62 */         LivingEntity livingEntity3 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity3.m_21233_() : -1.0F) > 50.0F) {
/* 63 */           LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21233_() : -1.0F) <= 100.0F) {
/*    */ 
/*    */             
/* 66 */             double d = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 50.0D;
/* 67 */             sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */                   capability.XP = _setval; capability.syncPlayerVariables(sourceentity);
/*    */                 }); return;
/*    */           } 
/*    */         } 
/* 72 */         LivingEntity livingEntity4 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity4.m_21233_() : -1.0F) > 100.0F) {
/* 73 */           LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21233_() : -1.0F) <= 200.0F) {
/*    */ 
/*    */             
/* 76 */             double d = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 100.0D;
/* 77 */             sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */                   capability.XP = _setval;
/*    */                   
/*    */                   capability.syncPlayerVariables(sourceentity);
/*    */                 });
/*    */             return;
/*    */           } 
/*    */         } 
/* 85 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + 200.0D;
/* 86 */         sourceentity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */               capability.XP = _setval;
/*    */               capability.syncPlayerVariables(sourceentity);
/*    */             });
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\MobXPProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */