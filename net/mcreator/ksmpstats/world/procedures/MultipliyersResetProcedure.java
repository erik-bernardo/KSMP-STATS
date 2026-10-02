/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MultipliyersResetProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 18 */     execute((Event)event, (Entity)event.getPlayer());
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 22 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/* 26 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 29 */     if (!((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).IsFormActive) {
/*    */       
/* 31 */       double _setval = 1.0D;
/* 32 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.VITmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 38 */       _setval = 1.0D;
/* 39 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.MANAmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 45 */       _setval = 1.0D;
/* 46 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.ENDmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 52 */       _setval = 1.0D;
/* 53 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.STRmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 59 */       _setval = 1.0D;
/* 60 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.DEXmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 66 */       _setval = 1.0D;
/* 67 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.INTmult = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */       
/* 73 */       _setval = 1.0D;
/* 74 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.LCKmult = _setval;
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\MultipliyersResetProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */