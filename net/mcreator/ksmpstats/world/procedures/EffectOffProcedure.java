/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class EffectOffProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/*  9 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 12 */     double _setval = 0.0D;
/* 13 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.VITAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 19 */     _setval = 0.0D;
/* 20 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.MANAAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 26 */     _setval = 0.0D;
/* 27 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.ENDAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 33 */     _setval = 0.0D;
/* 34 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.STRAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 40 */     _setval = 0.0D;
/* 41 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.DEXAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 47 */     _setval = 0.0D;
/* 48 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.INTAdd = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 54 */     _setval = 0.0D;
/* 55 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.LUCKTotal = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/* 60 */     OnJoinProcedure.execute(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\EffectOffProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */