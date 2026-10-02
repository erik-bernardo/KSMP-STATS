/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class FrcSorcProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     double _setval = (KsmpStatsModVariables.WorldVariables.get(world)).Multipliyer;
/* 14 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.MANAmult = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 20 */     _setval = (KsmpStatsModVariables.WorldVariables.get(world)).Multipliyer;
/* 21 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.ENDmult = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/* 26 */     OnJoinProcedure.execute(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\FrcSorcProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */