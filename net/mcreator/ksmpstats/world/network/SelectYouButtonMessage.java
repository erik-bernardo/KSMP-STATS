/*    */ package net.mcreator.ksmpstats.network;
/*    */ import java.util.HashMap;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*    */ import net.mcreator.ksmpstats.procedures.AssassinProcedure;
/*    */ import net.mcreator.ksmpstats.procedures.MageProcedure;
/*    */ import net.mcreator.ksmpstats.procedures.ShielddProcedure;
/*    */ import net.mcreator.ksmpstats.procedures.SorcererProcedure;
/*    */ import net.mcreator.ksmpstats.procedures.WarriorProcedure;
/*    */ import net.mcreator.ksmpstats.world.inventory.SelectYouMenu;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class SelectYouButtonMessage {
/*    */   private final int buttonID;
/*    */   private final int x;
/*    */   
/*    */   public SelectYouButtonMessage(FriendlyByteBuf buffer) {
/* 30 */     this.buttonID = buffer.readInt();
/* 31 */     this.x = buffer.readInt();
/* 32 */     this.y = buffer.readInt();
/* 33 */     this.z = buffer.readInt();
/*    */   }
/*    */   private final int y; private final int z;
/*    */   public SelectYouButtonMessage(int buttonID, int x, int y, int z) {
/* 37 */     this.buttonID = buttonID;
/* 38 */     this.x = x;
/* 39 */     this.y = y;
/* 40 */     this.z = z;
/*    */   }
/*    */   
/*    */   public static void buffer(SelectYouButtonMessage message, FriendlyByteBuf buffer) {
/* 44 */     buffer.writeInt(message.buttonID);
/* 45 */     buffer.writeInt(message.x);
/* 46 */     buffer.writeInt(message.y);
/* 47 */     buffer.writeInt(message.z);
/*    */   }
/*    */   
/*    */   public static void handler(SelectYouButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 51 */     NetworkEvent.Context context = contextSupplier.get();
/* 52 */     context.enqueueWork(() -> {
/*    */           ServerPlayer serverPlayer = context.getSender();
/*    */           int buttonID = message.buttonID;
/*    */           int x = message.x;
/*    */           int y = message.y;
/*    */           int z = message.z;
/*    */           handleButtonAction((Player)serverPlayer, buttonID, x, y, z);
/*    */         });
/* 60 */     context.setPacketHandled(true);
/*    */   }
/*    */   
/*    */   public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
/* 64 */     Level world = entity.f_19853_;
/* 65 */     HashMap guistate = SelectYouMenu.guistate;
/*    */     
/* 67 */     if (!world.m_46805_(new BlockPos(x, y, z)))
/*    */       return; 
/* 69 */     if (buttonID == 0)
/*    */     {
/* 71 */       WarriorProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/* 73 */     if (buttonID == 1)
/*    */     {
/* 75 */       MageProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/* 77 */     if (buttonID == 2)
/*    */     {
/* 79 */       AssassinProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/* 81 */     if (buttonID == 3)
/*    */     {
/* 83 */       ShielddProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/* 85 */     if (buttonID == 4)
/*    */     {
/* 87 */       SorcererProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 93 */     KsmpStatsMod.addNetworkMessage(SelectYouButtonMessage.class, SelectYouButtonMessage::buffer, SelectYouButtonMessage::new, SelectYouButtonMessage::handler);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\SelectYouButtonMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */