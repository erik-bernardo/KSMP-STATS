/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ 
/*    */ public class ENDProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 14 */     double _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END + 1.0D;
/* 15 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.END = _setval;
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
/* 30 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 31 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 32 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 33 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 34 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) <= 50.0D) {
/* 35 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/* 36 */         .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 37 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 38 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 39 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 40 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 41 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*    */       
/* 43 */       ((LivingEntity)entity).m_21051_(Attributes.f_22284_)
/* 44 */         .m_22100_(-10.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 45 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 46 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 47 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 48 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 49 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*    */     } else {
/*    */       
/* 52 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/* 53 */         .m_22100_(10.0D + (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 54 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 55 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 56 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 57 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 58 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) - 50.0D) / 2.0D);
/*    */       
/* 60 */       ((LivingEntity)entity).m_21051_(Attributes.f_22284_).m_22100_(0.0D);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ENDProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */