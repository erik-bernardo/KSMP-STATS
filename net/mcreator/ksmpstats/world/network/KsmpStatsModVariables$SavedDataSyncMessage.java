/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.network.NetworkEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SavedDataSyncMessage
/*     */ {
/*     */   public int type;
/*     */   public SavedData data;
/*     */   
/*     */   public SavedDataSyncMessage(FriendlyByteBuf buffer) {
/* 259 */     this.type = buffer.readInt();
/* 260 */     this.data = (this.type == 0) ? new KsmpStatsModVariables.MapVariables() : new KsmpStatsModVariables.WorldVariables();
/* 261 */     SavedData savedData = this.data; if (savedData instanceof KsmpStatsModVariables.MapVariables) { KsmpStatsModVariables.MapVariables _mapvars = (KsmpStatsModVariables.MapVariables)savedData;
/* 262 */       _mapvars.read(buffer.m_130260_()); }
/* 263 */     else { savedData = this.data; if (savedData instanceof KsmpStatsModVariables.WorldVariables) { KsmpStatsModVariables.WorldVariables _worldvars = (KsmpStatsModVariables.WorldVariables)savedData;
/* 264 */         _worldvars.read(buffer.m_130260_()); }
/*     */        }
/*     */   
/*     */   } public SavedDataSyncMessage(int type, SavedData data) {
/* 268 */     this.type = type;
/* 269 */     this.data = data;
/*     */   }
/*     */   
/*     */   public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
/* 273 */     buffer.writeInt(message.type);
/* 274 */     buffer.m_130079_(message.data.m_7176_(new CompoundTag()));
/*     */   }
/*     */   
/*     */   public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 278 */     NetworkEvent.Context context = contextSupplier.get();
/* 279 */     context.enqueueWork(() -> {
/*     */           if (!context.getDirection().getReceptionSide().isServer())
/*     */             if (message.type == 0) {
/*     */               KsmpStatsModVariables.MapVariables.clientSide = (KsmpStatsModVariables.MapVariables)message.data;
/*     */             } else {
/*     */               KsmpStatsModVariables.WorldVariables.clientSide = (KsmpStatsModVariables.WorldVariables)message.data;
/*     */             }  
/*     */         });
/* 287 */     context.setPacketHandled(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$SavedDataSyncMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */