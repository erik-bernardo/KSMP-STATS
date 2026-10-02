/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class INTEProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 17 */     double _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTE + 1.0D;
/* 18 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.INTE = _setval;
/*    */ 
/*    */ 
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */ 
/*    */     
/* 27 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP - ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).NEEDXP;
/* 28 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.XP = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/* 33 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cooldown_reduction")))
/* 34 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 35 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 36 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 37 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 38 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 39 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*    */     
/* 41 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cast_time_reduction")))
/* 42 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 43 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 44 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 45 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 46 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 47 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*    */     
/* 49 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_power")))
/* 50 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 51 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 52 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 53 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 54 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 55 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\INTEProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */