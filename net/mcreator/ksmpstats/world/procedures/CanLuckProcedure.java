/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class CanLuckProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world, Entity entity) {
/* 10 */     if (entity == null)
/* 11 */       return false; 
/* 12 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP >= ((KsmpStatsModVariables.PlayerVariables)entity
/* 13 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 14 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).NEEDXP && ((KsmpStatsModVariables.PlayerVariables)entity
/* 15 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 16 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK < (KsmpStatsModVariables.WorldVariables.get(world)).AtrCap && ((KsmpStatsModVariables.PlayerVariables)entity
/* 17 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 18 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).LVL < (KsmpStatsModVariables.WorldVariables.get(world)).lvlcap) {
/* 19 */       return true;
/*    */     }
/* 21 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\CanLuckProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */