/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*    */ import net.mcreator.ksmpstats.network.FormButtonMessage;
/*    */ import net.mcreator.ksmpstats.network.OpenStatsMenuMessage;
/*    */ import net.minecraft.client.KeyMapping;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.ClientRegistry;
/*    */ import net.minecraftforge.client.event.InputEvent;
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
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class KsmpStatsModKeyMappings
/*    */ {
/* 25 */   public static final KeyMapping OPEN_STATS_MENU = new KeyMapping("key.ksmp_stats.open_stats_menu", 90, "key.categories.stats");
/* 26 */   public static final KeyMapping FORM_BUTTON = new KeyMapping("key.ksmp_stats.form_button", 88, "key.categories.stats");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerKeyBindings(FMLClientSetupEvent event) {
/* 30 */     ClientRegistry.registerKeyBinding(OPEN_STATS_MENU);
/* 31 */     ClientRegistry.registerKeyBinding(FORM_BUTTON);
/*    */   }
/*    */   
/*    */   @EventBusSubscriber({Dist.CLIENT})
/*    */   public static class KeyEventListener {
/*    */     @SubscribeEvent
/*    */     public static void onKeyInput(InputEvent.KeyInputEvent event) {
/* 38 */       if ((Minecraft.m_91087_()).f_91080_ == null) {
/* 39 */         if (event.getKey() == KsmpStatsModKeyMappings.OPEN_STATS_MENU.getKey().m_84873_() && 
/* 40 */           event.getAction() == 1) {
/* 41 */           KsmpStatsMod.PACKET_HANDLER.sendToServer(new OpenStatsMenuMessage(0, 0));
/* 42 */           OpenStatsMenuMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/*    */         } 
/*    */         
/* 45 */         if (event.getKey() == KsmpStatsModKeyMappings.FORM_BUTTON.getKey().m_84873_() && 
/* 46 */           event.getAction() == 1) {
/* 47 */           KsmpStatsMod.PACKET_HANDLER.sendToServer(new FormButtonMessage(0, 0));
/* 48 */           FormButtonMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModKeyMappings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */