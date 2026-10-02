/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
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
/*     */ public class WorldVariables
/*     */   extends SavedData
/*     */ {
/*     */   public static final String DATA_NAME = "ksmp_stats_worldvars";
/* 175 */   public double lvlcap = 120.0D;
/* 176 */   public double maxXP = 200000.0D;
/* 177 */   public double AtrCap = 60.0D;
/* 178 */   public double Multipliyer = 2.0D;
/*     */   
/*     */   public static WorldVariables load(CompoundTag tag) {
/* 181 */     WorldVariables data = new WorldVariables();
/* 182 */     data.read(tag);
/* 183 */     return data;
/*     */   }
/*     */   
/*     */   public void read(CompoundTag nbt) {
/* 187 */     this.lvlcap = nbt.m_128459_("lvlcap");
/* 188 */     this.maxXP = nbt.m_128459_("maxXP");
/* 189 */     this.AtrCap = nbt.m_128459_("AtrCap");
/* 190 */     this.Multipliyer = nbt.m_128459_("Multipliyer");
/*     */   }
/*     */ 
/*     */   
/*     */   public CompoundTag m_7176_(CompoundTag nbt) {
/* 195 */     nbt.m_128347_("lvlcap", this.lvlcap);
/* 196 */     nbt.m_128347_("maxXP", this.maxXP);
/* 197 */     nbt.m_128347_("AtrCap", this.AtrCap);
/* 198 */     nbt.m_128347_("Multipliyer", this.Multipliyer);
/* 199 */     return nbt;
/*     */   }
/*     */   
/*     */   public void syncData(LevelAccessor world) {
/* 203 */     m_77762_();
/* 204 */     if (world instanceof Level) { Level level = (Level)world; if (!level.m_5776_()) {
/* 205 */         Objects.requireNonNull(level); KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::m_46472_), new KsmpStatsModVariables.SavedDataSyncMessage(1, this));
/*     */       }  }
/*     */   
/* 208 */   } static WorldVariables clientSide = new WorldVariables();
/*     */   
/*     */   public static WorldVariables get(LevelAccessor world) {
/* 211 */     if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 212 */       return (WorldVariables)level.m_8895_().m_164861_(e -> load(e), WorldVariables::new, "ksmp_stats_worldvars"); }
/*     */     
/* 214 */     return clientSide;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$WorldVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */