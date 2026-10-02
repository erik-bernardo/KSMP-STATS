/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class MaxXPProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 19 */     if (event.phase == TickEvent.Phase.END) {
/* 20 */       execute((Event)event, (LevelAccessor)event.player.f_19853_, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 25 */     execute(null, world, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
/* 29 */     if (entity == null)
/*    */       return; 
/* 31 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 32 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA > (KsmpStatsModVariables.WorldVariables.get(world)).maxXP) {
/*    */       
/* 34 */       double _setval = (KsmpStatsModVariables.WorldVariables.get(world)).maxXP;
/* 35 */       entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */             capability.XP = _setval;
/*    */             capability.syncPlayerVariables(entity);
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\MaxXPProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */