/*     */ package net.mcreator.ksmpstats.network;
/*     */ import java.util.HashMap;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.mcreator.ksmpstats.procedures.DEXProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ENDProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ExchangeXPProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.INTEProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.LUCKProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.MNDProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.STRProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.VITProcedure;
/*     */ import net.mcreator.ksmpstats.world.inventory.StatsMenuMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.network.NetworkEvent;
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class StatsMenuButtonMessage {
/*     */   private final int buttonID;
/*     */   private final int x;
/*     */   
/*     */   public StatsMenuButtonMessage(FriendlyByteBuf buffer) {
/*  33 */     this.buttonID = buffer.readInt();
/*  34 */     this.x = buffer.readInt();
/*  35 */     this.y = buffer.readInt();
/*  36 */     this.z = buffer.readInt();
/*     */   }
/*     */   private final int y; private final int z;
/*     */   public StatsMenuButtonMessage(int buttonID, int x, int y, int z) {
/*  40 */     this.buttonID = buttonID;
/*  41 */     this.x = x;
/*  42 */     this.y = y;
/*  43 */     this.z = z;
/*     */   }
/*     */   
/*     */   public static void buffer(StatsMenuButtonMessage message, FriendlyByteBuf buffer) {
/*  47 */     buffer.writeInt(message.buttonID);
/*  48 */     buffer.writeInt(message.x);
/*  49 */     buffer.writeInt(message.y);
/*  50 */     buffer.writeInt(message.z);
/*     */   }
/*     */   
/*     */   public static void handler(StatsMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/*  54 */     NetworkEvent.Context context = contextSupplier.get();
/*  55 */     context.enqueueWork(() -> {
/*     */           ServerPlayer serverPlayer = context.getSender();
/*     */           int buttonID = message.buttonID;
/*     */           int x = message.x;
/*     */           int y = message.y;
/*     */           int z = message.z;
/*     */           handleButtonAction((Player)serverPlayer, buttonID, x, y, z);
/*     */         });
/*  63 */     context.setPacketHandled(true);
/*     */   }
/*     */   
/*     */   public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
/*  67 */     Level world = entity.f_19853_;
/*  68 */     HashMap guistate = StatsMenuMenu.guistate;
/*     */     
/*  70 */     if (!world.m_46805_(new BlockPos(x, y, z)))
/*     */       return; 
/*  72 */     if (buttonID == 0)
/*     */     {
/*  74 */       ExchangeXPProcedure.execute((Entity)entity);
/*     */     }
/*  76 */     if (buttonID == 1)
/*     */     {
/*  78 */       MNDProcedure.execute((Entity)entity);
/*     */     }
/*  80 */     if (buttonID == 2)
/*     */     {
/*  82 */       ENDProcedure.execute((Entity)entity);
/*     */     }
/*  84 */     if (buttonID == 3)
/*     */     {
/*  86 */       STRProcedure.execute((Entity)entity);
/*     */     }
/*  88 */     if (buttonID == 4)
/*     */     {
/*  90 */       DEXProcedure.execute((Entity)entity);
/*     */     }
/*  92 */     if (buttonID == 5)
/*     */     {
/*  94 */       INTEProcedure.execute((Entity)entity);
/*     */     }
/*  96 */     if (buttonID == 6)
/*     */     {
/*  98 */       LUCKProcedure.execute((Entity)entity);
/*     */     }
/* 100 */     if (buttonID == 7)
/*     */     {
/* 102 */       VITProcedure.execute((Entity)entity);
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 108 */     KsmpStatsMod.addNetworkMessage(StatsMenuButtonMessage.class, StatsMenuButtonMessage::buffer, StatsMenuButtonMessage::new, StatsMenuButtonMessage::handler);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\StatsMenuButtonMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */