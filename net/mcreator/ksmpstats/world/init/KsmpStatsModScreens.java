/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import net.minecraft.client.gui.screens.MenuScreens;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class KsmpStatsModScreens
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void clientLoad(FMLClientSetupEvent event) {
/* 21 */     event.enqueueWork(() -> {
/*    */           MenuScreens.m_96206_(KsmpStatsModMenus.STATS_MENU, net.mcreator.ksmpstats.client.gui.StatsMenuScreen::new);
/*    */           MenuScreens.m_96206_(KsmpStatsModMenus.SELECT_YOU, net.mcreator.ksmpstats.client.gui.SelectYouScreen::new);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModScreens.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */