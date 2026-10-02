/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*    */ import net.mcreator.ksmpstats.network.FormButtonMessage;
/*    */ import net.mcreator.ksmpstats.network.OpenStatsMenuMessage;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.InputEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class KeyEventListener
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onKeyInput(InputEvent.KeyInputEvent event) {
/* 38 */     if ((Minecraft.m_91087_()).f_91080_ == null) {
/* 39 */       if (event.getKey() == KsmpStatsModKeyMappings.OPEN_STATS_MENU.getKey().m_84873_() && 
/* 40 */         event.getAction() == 1) {
/* 41 */         KsmpStatsMod.PACKET_HANDLER.sendToServer(new OpenStatsMenuMessage(0, 0));
/* 42 */         OpenStatsMenuMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/*    */       } 
/*    */       
/* 45 */       if (event.getKey() == KsmpStatsModKeyMappings.FORM_BUTTON.getKey().m_84873_() && 
/* 46 */         event.getAction() == 1) {
/* 47 */         KsmpStatsMod.PACKET_HANDLER.sendToServer(new FormButtonMessage(0, 0));
/* 48 */         FormButtonMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModKeyMappings$KeyEventListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */