/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ShowMultMndProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity) {
/*  9 */     if (entity == null)
/* 10 */       return false; 
/* 11 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 12 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).MANATotal != 1.0D) {
/* 13 */       return true;
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ShowMultMndProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */