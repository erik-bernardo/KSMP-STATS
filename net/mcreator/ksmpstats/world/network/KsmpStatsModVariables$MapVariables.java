/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.network.PacketDistributor;
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
/*     */ public class MapVariables
/*     */   extends SavedData
/*     */ {
/*     */   public static final String DATA_NAME = "ksmp_stats_mapvars";
/*     */   
/*     */   public static MapVariables load(CompoundTag tag) {
/* 223 */     MapVariables data = new MapVariables();
/* 224 */     data.read(tag);
/* 225 */     return data;
/*     */   }
/*     */ 
/*     */   
/*     */   public void read(CompoundTag nbt) {}
/*     */ 
/*     */   
/*     */   public CompoundTag m_7176_(CompoundTag nbt) {
/* 233 */     return nbt;
/*     */   }
/*     */   
/*     */   public void syncData(LevelAccessor world) {
/* 237 */     m_77762_();
/* 238 */     if (world instanceof Level && !world.m_5776_())
/* 239 */       KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new KsmpStatsModVariables.SavedDataSyncMessage(0, this)); 
/*     */   }
/*     */   
/* 242 */   static MapVariables clientSide = new MapVariables();
/*     */   
/*     */   public static MapVariables get(LevelAccessor world) {
/* 245 */     if (world instanceof ServerLevelAccessor) { ServerLevelAccessor serverLevelAcc = (ServerLevelAccessor)world;
/* 246 */       return (MapVariables)serverLevelAcc.m_6018_().m_142572_().m_129880_(Level.f_46428_).m_8895_().m_164861_(e -> load(e), MapVariables::new, "ksmp_stats_mapvars"); }
/*     */ 
/*     */     
/* 249 */     return clientSide;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$MapVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */