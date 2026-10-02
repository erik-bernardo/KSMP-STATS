/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class ApplyFormProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 13 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).IsMage == true) {
/* 14 */       SuperMageProcedure.execute(world, entity);
/* 15 */     } else if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 16 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).IsAssass == true) {
/* 17 */       BldAssassinProcedure.execute(world, entity);
/* 18 */     } else if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 19 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).IsShield == true) {
/* 20 */       ImpShieldProcedure.execute(world, entity);
/* 21 */     } else if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 22 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).IsWarrior == true) {
/* 23 */       StrWarriorProcedure.execute(world, entity);
/* 24 */     } else if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 25 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).IsSorcerer == true) {
/* 26 */       FrcSorcProcedure.execute(world, entity);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ApplyFormProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */