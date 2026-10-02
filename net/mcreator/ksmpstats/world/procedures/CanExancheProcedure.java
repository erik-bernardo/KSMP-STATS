/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class CanExancheProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world, Entity entity) {
/* 11 */     if (entity == null)
/* 12 */       return false; 
/* 13 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 14 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).XP < (KsmpStatsModVariables.WorldVariables.get(world)).maxXP) {
/* 15 */       Player _plr = (Player)entity; if (((entity instanceof Player) ? _plr.f_36078_ : false) >= true && ((KsmpStatsModVariables.PlayerVariables)entity
/* 16 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 17 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LVL < (KsmpStatsModVariables.WorldVariables.get(world)).lvlcap)
/* 18 */         return true; 
/*    */     } 
/* 20 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\CanExancheProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */