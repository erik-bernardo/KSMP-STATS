/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ 
/*    */ public class LUCKProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 14 */     double _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK + 1.0D;
/* 15 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.LUCK = _setval;
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
/* 30 */     ((LivingEntity)entity).m_21051_(Attributes.f_22286_)
/* 31 */       .m_22100_(((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 32 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK * (((KsmpStatsModVariables.PlayerVariables)entity
/* 33 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 34 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 35 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 36 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKAdd) / 10.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\LUCKProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */