/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ 
/*    */ public class DEXProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 14 */     double _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX + 1.0D;
/* 15 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.DEX = _setval;
/*    */ 
/*    */ 
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */ 
/*    */     
/* 24 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP - ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).NEEDXP;
/* 25 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.XP = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/* 30 */     ((LivingEntity)entity).m_21051_(Attributes.f_22283_)
/* 31 */       .m_22100_(4.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 32 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEX * (((KsmpStatsModVariables.PlayerVariables)entity
/* 33 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 34 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 35 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 36 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 25.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\DEXProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */