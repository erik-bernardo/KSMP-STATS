/*    */ package net.mcreator.ksmpstats.network;
/*    */ 
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*    */ import net.mcreator.ksmpstats.procedures.FormTriggerProcedure;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class FormButtonMessage {
/*    */   int type;
/*    */   
/*    */   public FormButtonMessage(int type, int pressedms) {
/* 23 */     this.type = type;
/* 24 */     this.pressedms = pressedms;
/*    */   }
/*    */   int pressedms;
/*    */   public FormButtonMessage(FriendlyByteBuf buffer) {
/* 28 */     this.type = buffer.readInt();
/* 29 */     this.pressedms = buffer.readInt();
/*    */   }
/*    */   
/*    */   public static void buffer(FormButtonMessage message, FriendlyByteBuf buffer) {
/* 33 */     buffer.writeInt(message.type);
/* 34 */     buffer.writeInt(message.pressedms);
/*    */   }
/*    */   
/*    */   public static void handler(FormButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 38 */     NetworkEvent.Context context = contextSupplier.get();
/* 39 */     context.enqueueWork(() -> pressAction((Player)context.getSender(), message.type, message.pressedms));
/*    */ 
/*    */     
/* 42 */     context.setPacketHandled(true);
/*    */   }
/*    */   
/*    */   public static void pressAction(Player entity, int type, int pressedms) {
/* 46 */     Level world = entity.f_19853_;
/* 47 */     double x = entity.m_20185_();
/* 48 */     double y = entity.m_20186_();
/* 49 */     double z = entity.m_20189_();
/*    */     
/* 51 */     if (!world.m_46805_(entity.m_142538_()))
/*    */       return; 
/* 53 */     if (type == 0)
/*    */     {
/* 55 */       FormTriggerProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 61 */     KsmpStatsMod.addNetworkMessage(FormButtonMessage.class, FormButtonMessage::buffer, FormButtonMessage::new, FormButtonMessage::handler);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\FormButtonMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */