/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class FormTriggerProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 19 */     if (!((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).IsFormActive) {
/*    */       
/* 21 */       boolean _setval = true;
/* 22 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.IsFormActive = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/* 27 */       ApplyFormProcedure.execute(world, entity);
/* 28 */       if (world instanceof Level) { Level _level = (Level)world;
/* 29 */         if (!_level.m_5776_()) {
/* 30 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 31 */               .getValue(new ResourceLocation("ksmp_stats:transform2")), SoundSource.PLAYERS, 0.5F, 1.0F);
/*    */         } else {
/*    */           
/* 34 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ksmp_stats:transform2")), SoundSource.PLAYERS, 0.5F, 1.0F, false);
/*    */         }
/*    */          }
/*    */     
/*    */     } else {
/*    */       
/* 40 */       boolean _setval = false;
/* 41 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.IsFormActive = _setval;
/*    */             
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/* 46 */       EffectDissipProcedure.execute(entity);
/* 47 */       if (world instanceof Level) { Level _level = (Level)world;
/* 48 */         if (!_level.m_5776_()) {
/* 49 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ksmp_stats:powerdown")), SoundSource.PLAYERS, 0.5F, 1.0F);
/*    */         } else {
/*    */           
/* 52 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ksmp_stats:powerdown")), SoundSource.PLAYERS, 0.5F, 1.0F, false);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\FormTriggerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */