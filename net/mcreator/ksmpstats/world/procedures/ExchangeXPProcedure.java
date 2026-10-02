/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ 
/*    */ public class ExchangeXPProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 13 */       _player.m_6749_(-1); }
/*    */ 
/*    */ 
/*    */     
/* 17 */     Player _plr = (Player)entity; double _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + (((entity instanceof Player) ? _plr.m_36323_() : 0) * 2);
/* 18 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.XP = _setval;
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ExchangeXPProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */