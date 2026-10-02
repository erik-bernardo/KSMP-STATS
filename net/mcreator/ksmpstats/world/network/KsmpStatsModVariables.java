/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.nbt.Tag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.common.capabilities.Capability;
/*     */ import net.minecraftforge.common.capabilities.CapabilityManager;
/*     */ import net.minecraftforge.common.capabilities.CapabilityToken;
/*     */ import net.minecraftforge.common.capabilities.ICapabilityProvider;
/*     */ import net.minecraftforge.common.capabilities.ICapabilitySerializable;
/*     */ import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
/*     */ import net.minecraftforge.common.util.LazyOptional;
/*     */ import net.minecraftforge.event.AttachCapabilitiesEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.network.NetworkEvent;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class KsmpStatsModVariables
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void init(FMLCommonSetupEvent event) {
/*  41 */     KsmpStatsMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
/*     */     
/*  43 */     KsmpStatsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void init(RegisterCapabilitiesEvent event) {
/*  49 */     event.register(PlayerVariables.class);
/*     */   }
/*     */   
/*     */   @EventBusSubscriber
/*     */   public static class EventBusVariableHandlers {
/*     */     @SubscribeEvent
/*     */     public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
/*  56 */       if (!(event.getPlayer()).f_19853_.m_5776_())
/*  57 */         ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  58 */           .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
/*  63 */       if (!(event.getPlayer()).f_19853_.m_5776_())
/*  64 */         ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  65 */           .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  70 */       if (!(event.getPlayer()).f_19853_.m_5776_())
/*  71 */         ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  72 */           .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void clonePlayer(PlayerEvent.Clone event) {
/*  77 */       event.getOriginal().revive();
/*     */       
/*  79 */       KsmpStatsModVariables.PlayerVariables original = (KsmpStatsModVariables.PlayerVariables)event.getOriginal().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*     */       
/*  81 */       KsmpStatsModVariables.PlayerVariables clone = (KsmpStatsModVariables.PlayerVariables)event.getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*  82 */       clone.VIDA = original.VIDA;
/*  83 */       clone.STR = original.STR;
/*  84 */       clone.LUCK = original.LUCK;
/*  85 */       clone.END = original.END;
/*  86 */       clone.MANA = original.MANA;
/*  87 */       clone.LVL = original.LVL;
/*  88 */       clone.INTE = original.INTE;
/*  89 */       clone.FAITH = original.FAITH;
/*  90 */       clone.DEX = original.DEX;
/*  91 */       clone.ARC = original.ARC;
/*  92 */       clone.ATRPOINT = original.ATRPOINT;
/*  93 */       clone.XP = original.XP;
/*  94 */       clone.NEEDXP = original.NEEDXP;
/*  95 */       clone.currantMaxHP = original.currantMaxHP;
/*  96 */       clone.currentMaxMana = original.currentMaxMana;
/*  97 */       clone.currentSpellResis = original.currentSpellResis;
/*  98 */       clone.currantArmor = original.currantArmor;
/*  99 */       clone.currentToughness = original.currentToughness;
/* 100 */       clone.extraSpellPow = original.extraSpellPow;
/* 101 */       clone.currentDamage = original.currentDamage;
/* 102 */       clone.currentAttSpd = original.currentAttSpd;
/* 103 */       clone.currentSpd = original.currentSpd;
/* 104 */       clone.currentFirePow = original.currentFirePow;
/* 105 */       clone.currentIcePow = original.currentIcePow;
/* 106 */       clone.currentLightPow = original.currentLightPow;
/* 107 */       clone.currentPsnPow = original.currentPsnPow;
/* 108 */       clone.currentHolyPow = original.currentHolyPow;
/* 109 */       clone.currentEndPow = original.currentEndPow;
/* 110 */       clone.currentBldPow = original.currentBldPow;
/* 111 */       clone.currentEvoPow = original.currentEvoPow;
/* 112 */       clone.cooldown = original.cooldown;
/* 113 */       clone.casttime = original.casttime;
/* 114 */       clone.currentLuck = original.currentLuck;
/* 115 */       clone.STRmult = original.STRmult;
/* 116 */       clone.VITmult = original.VITmult;
/* 117 */       clone.MANAmult = original.MANAmult;
/* 118 */       clone.ENDmult = original.ENDmult;
/* 119 */       clone.DEXmult = original.DEXmult;
/* 120 */       clone.INTmult = original.INTmult;
/* 121 */       clone.LCKmult = original.LCKmult;
/* 122 */       clone.IsFormActive = original.IsFormActive;
/* 123 */       clone.IsMage = original.IsMage;
/* 124 */       clone.IsAssass = original.IsAssass;
/* 125 */       clone.IsWarrior = original.IsWarrior;
/* 126 */       clone.IsShield = original.IsShield;
/* 127 */       clone.IsSorcerer = original.IsSorcerer;
/* 128 */       clone.HasPower = original.HasPower;
/* 129 */       clone.EffectAdd = original.EffectAdd;
/* 130 */       clone.VITAdd = original.VITAdd;
/* 131 */       clone.ENDAdd = original.ENDAdd;
/* 132 */       clone.MANAAdd = original.MANAAdd;
/* 133 */       clone.STRAdd = original.STRAdd;
/* 134 */       clone.DEXAdd = original.DEXAdd;
/* 135 */       clone.INTAdd = original.INTAdd;
/* 136 */       clone.LCKAdd = original.LCKAdd;
/* 137 */       clone.VITTotal = original.VITTotal;
/* 138 */       clone.MANATotal = original.MANATotal;
/* 139 */       clone.ENDTotal = original.ENDTotal;
/* 140 */       clone.STRTotal = original.STRTotal;
/* 141 */       clone.DEXTotal = original.DEXTotal;
/* 142 */       clone.INTTotal = original.INTTotal;
/* 143 */       clone.LUCKTotal = original.LUCKTotal;
/* 144 */       if (!event.isWasDeath());
/*     */     }
/*     */ 
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 150 */       if (!(event.getPlayer()).f_19853_.m_5776_()) {
/* 151 */         SavedData mapdata = KsmpStatsModVariables.MapVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 152 */         SavedData worlddata = KsmpStatsModVariables.WorldVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 153 */         if (mapdata != null) {
/* 154 */           KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(0, mapdata));
/*     */         }
/* 156 */         if (worlddata != null) {
/* 157 */           KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(1, worlddata));
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     @SubscribeEvent
/*     */     public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
/* 164 */       if (!(event.getPlayer()).f_19853_.m_5776_()) {
/* 165 */         SavedData worlddata = KsmpStatsModVariables.WorldVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 166 */         if (worlddata != null)
/* 167 */           KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class WorldVariables
/*     */     extends SavedData {
/*     */     public static final String DATA_NAME = "ksmp_stats_worldvars";
/* 175 */     public double lvlcap = 120.0D;
/* 176 */     public double maxXP = 200000.0D;
/* 177 */     public double AtrCap = 60.0D;
/* 178 */     public double Multipliyer = 2.0D;
/*     */     
/*     */     public static WorldVariables load(CompoundTag tag) {
/* 181 */       WorldVariables data = new WorldVariables();
/* 182 */       data.read(tag);
/* 183 */       return data;
/*     */     }
/*     */     
/*     */     public void read(CompoundTag nbt) {
/* 187 */       this.lvlcap = nbt.m_128459_("lvlcap");
/* 188 */       this.maxXP = nbt.m_128459_("maxXP");
/* 189 */       this.AtrCap = nbt.m_128459_("AtrCap");
/* 190 */       this.Multipliyer = nbt.m_128459_("Multipliyer");
/*     */     }
/*     */ 
/*     */     
/*     */     public CompoundTag m_7176_(CompoundTag nbt) {
/* 195 */       nbt.m_128347_("lvlcap", this.lvlcap);
/* 196 */       nbt.m_128347_("maxXP", this.maxXP);
/* 197 */       nbt.m_128347_("AtrCap", this.AtrCap);
/* 198 */       nbt.m_128347_("Multipliyer", this.Multipliyer);
/* 199 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(LevelAccessor world) {
/* 203 */       m_77762_();
/* 204 */       if (world instanceof Level) { Level level = (Level)world; if (!level.m_5776_()) {
/* 205 */           Objects.requireNonNull(level); KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::m_46472_), new KsmpStatsModVariables.SavedDataSyncMessage(1, this));
/*     */         }  }
/*     */     
/* 208 */     } static WorldVariables clientSide = new WorldVariables();
/*     */     
/*     */     public static WorldVariables get(LevelAccessor world) {
/* 211 */       if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 212 */         return (WorldVariables)level.m_8895_().m_164861_(e -> load(e), WorldVariables::new, "ksmp_stats_worldvars"); }
/*     */       
/* 214 */       return clientSide;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class MapVariables
/*     */     extends SavedData {
/*     */     public static final String DATA_NAME = "ksmp_stats_mapvars";
/*     */     
/*     */     public static MapVariables load(CompoundTag tag) {
/* 223 */       MapVariables data = new MapVariables();
/* 224 */       data.read(tag);
/* 225 */       return data;
/*     */     }
/*     */ 
/*     */     
/*     */     public void read(CompoundTag nbt) {}
/*     */ 
/*     */     
/*     */     public CompoundTag m_7176_(CompoundTag nbt) {
/* 233 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(LevelAccessor world) {
/* 237 */       m_77762_();
/* 238 */       if (world instanceof Level && !world.m_5776_())
/* 239 */         KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new KsmpStatsModVariables.SavedDataSyncMessage(0, this)); 
/*     */     }
/*     */     
/* 242 */     static MapVariables clientSide = new MapVariables();
/*     */     
/*     */     public static MapVariables get(LevelAccessor world) {
/* 245 */       if (world instanceof ServerLevelAccessor) { ServerLevelAccessor serverLevelAcc = (ServerLevelAccessor)world;
/* 246 */         return (MapVariables)serverLevelAcc.m_6018_().m_142572_().m_129880_(Level.f_46428_).m_8895_().m_164861_(e -> load(e), MapVariables::new, "ksmp_stats_mapvars"); }
/*     */ 
/*     */       
/* 249 */       return clientSide;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SavedDataSyncMessage
/*     */   {
/*     */     public int type;
/*     */     public SavedData data;
/*     */     
/*     */     public SavedDataSyncMessage(FriendlyByteBuf buffer) {
/* 259 */       this.type = buffer.readInt();
/* 260 */       this.data = (this.type == 0) ? new KsmpStatsModVariables.MapVariables() : new KsmpStatsModVariables.WorldVariables();
/* 261 */       SavedData savedData = this.data; if (savedData instanceof KsmpStatsModVariables.MapVariables) { KsmpStatsModVariables.MapVariables _mapvars = (KsmpStatsModVariables.MapVariables)savedData;
/* 262 */         _mapvars.read(buffer.m_130260_()); }
/* 263 */       else { savedData = this.data; if (savedData instanceof KsmpStatsModVariables.WorldVariables) { KsmpStatsModVariables.WorldVariables _worldvars = (KsmpStatsModVariables.WorldVariables)savedData;
/* 264 */           _worldvars.read(buffer.m_130260_()); }
/*     */          }
/*     */     
/*     */     } public SavedDataSyncMessage(int type, SavedData data) {
/* 268 */       this.type = type;
/* 269 */       this.data = data;
/*     */     }
/*     */     
/*     */     public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
/* 273 */       buffer.writeInt(message.type);
/* 274 */       buffer.m_130079_(message.data.m_7176_(new CompoundTag()));
/*     */     }
/*     */     
/*     */     public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 278 */       NetworkEvent.Context context = contextSupplier.get();
/* 279 */       context.enqueueWork(() -> {
/*     */             if (!context.getDirection().getReceptionSide().isServer())
/*     */               if (message.type == 0) {
/*     */                 KsmpStatsModVariables.MapVariables.clientSide = (KsmpStatsModVariables.MapVariables)message.data;
/*     */               } else {
/*     */                 KsmpStatsModVariables.WorldVariables.clientSide = (KsmpStatsModVariables.WorldVariables)message.data;
/*     */               }  
/*     */           });
/* 287 */       context.setPacketHandled(true);
/*     */     }
/*     */   }
/*     */   
/* 291 */   public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {  }
/*     */     );
/*     */   
/*     */   @EventBusSubscriber
/*     */   private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
/*     */     @SubscribeEvent
/*     */     public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
/* 298 */       if (event.getObject() instanceof net.minecraft.world.entity.player.Player && !(event.getObject() instanceof net.minecraftforge.common.util.FakePlayer))
/* 299 */         event.addCapability(new ResourceLocation("ksmp_stats", "player_variables"), (ICapabilityProvider)new PlayerVariablesProvider()); 
/*     */     }
/*     */     
/* 302 */     private final KsmpStatsModVariables.PlayerVariables playerVariables = new KsmpStatsModVariables.PlayerVariables();
/* 303 */     private final LazyOptional<KsmpStatsModVariables.PlayerVariables> instance = LazyOptional.of(() -> this.playerVariables);
/*     */ 
/*     */     
/*     */     public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
/* 307 */       return (cap == KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY) ? this.instance.cast() : LazyOptional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Tag serializeNBT() {
/* 312 */       return this.playerVariables.writeNBT();
/*     */     }
/*     */ 
/*     */     
/*     */     public void deserializeNBT(Tag nbt) {
/* 317 */       this.playerVariables.readNBT(nbt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class PlayerVariables {
/* 322 */     public double VIDA = 0.0D;
/* 323 */     public double STR = 0.0D;
/* 324 */     public double LUCK = 0.0D;
/* 325 */     public double END = 0.0D;
/* 326 */     public double MANA = 0.0D;
/* 327 */     public double LVL = 0.0D;
/* 328 */     public double INTE = 0.0D;
/* 329 */     public double FAITH = 0.0D;
/* 330 */     public double DEX = 0.0D;
/* 331 */     public double ARC = 0.0D;
/* 332 */     public double ATRPOINT = 0.0D;
/* 333 */     public double XP = 0.0D;
/* 334 */     public double NEEDXP = 10.0D;
/* 335 */     public double currantMaxHP = 0.0D;
/* 336 */     public double currentMaxMana = 0.0D;
/* 337 */     public double currentSpellResis = 0.0D;
/* 338 */     public double currantArmor = 0.0D;
/* 339 */     public double currentToughness = 0.0D;
/* 340 */     public double extraSpellPow = 0.0D;
/* 341 */     public double currentDamage = 0.0D;
/* 342 */     public double currentAttSpd = 0.0D;
/* 343 */     public double currentSpd = 0.0D;
/* 344 */     public double currentFirePow = 0.0D;
/* 345 */     public double currentIcePow = 0.0D;
/* 346 */     public double currentLightPow = 0.0D;
/* 347 */     public double currentPsnPow = 0.0D;
/* 348 */     public double currentHolyPow = 0.0D;
/* 349 */     public double currentEndPow = 0.0D;
/* 350 */     public double currentBldPow = 0.0D;
/* 351 */     public double currentEvoPow = 0.0D;
/* 352 */     public double cooldown = 0.0D;
/* 353 */     public double casttime = 0.0D;
/* 354 */     public double currentLuck = 0.0D;
/* 355 */     public double STRmult = 1.0D;
/* 356 */     public double VITmult = 1.0D;
/* 357 */     public double MANAmult = 1.0D;
/* 358 */     public double ENDmult = 1.0D;
/* 359 */     public double DEXmult = 1.0D;
/* 360 */     public double INTmult = 1.0D;
/* 361 */     public double LCKmult = 1.0D;
/*     */     public boolean IsFormActive = false;
/*     */     public boolean IsMage = false;
/*     */     public boolean IsAssass = false;
/*     */     public boolean IsWarrior = false;
/*     */     public boolean IsShield = false;
/*     */     public boolean IsSorcerer = false;
/*     */     public boolean HasPower = false;
/* 369 */     public double EffectAdd = 1.0D;
/* 370 */     public double VITAdd = 0.0D;
/* 371 */     public double ENDAdd = 0.0D;
/* 372 */     public double MANAAdd = 0.0D;
/* 373 */     public double STRAdd = 0.0D;
/* 374 */     public double DEXAdd = 0.0D;
/* 375 */     public double INTAdd = 0.0D;
/* 376 */     public double LCKAdd = 0.0D;
/* 377 */     public double VITTotal = 0.0D;
/* 378 */     public double MANATotal = 0.0D;
/* 379 */     public double ENDTotal = 0.0D;
/* 380 */     public double STRTotal = 0.0D;
/* 381 */     public double DEXTotal = 0.0D;
/* 382 */     public double INTTotal = 0.0D;
/* 383 */     public double LUCKTotal = 0.0D;
/*     */     
/*     */     public void syncPlayerVariables(Entity entity) {
/* 386 */       if (entity instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)entity;
/* 387 */         KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new KsmpStatsModVariables.PlayerVariablesSyncMessage(this)); }
/*     */     
/*     */     }
/*     */     public Tag writeNBT() {
/* 391 */       CompoundTag nbt = new CompoundTag();
/* 392 */       nbt.m_128347_("VIDA", this.VIDA);
/* 393 */       nbt.m_128347_("STR", this.STR);
/* 394 */       nbt.m_128347_("LUCK", this.LUCK);
/* 395 */       nbt.m_128347_("END", this.END);
/* 396 */       nbt.m_128347_("MANA", this.MANA);
/* 397 */       nbt.m_128347_("LVL", this.LVL);
/* 398 */       nbt.m_128347_("INTE", this.INTE);
/* 399 */       nbt.m_128347_("FAITH", this.FAITH);
/* 400 */       nbt.m_128347_("DEX", this.DEX);
/* 401 */       nbt.m_128347_("ARC", this.ARC);
/* 402 */       nbt.m_128347_("ATRPOINT", this.ATRPOINT);
/* 403 */       nbt.m_128347_("XP", this.XP);
/* 404 */       nbt.m_128347_("NEEDXP", this.NEEDXP);
/* 405 */       nbt.m_128347_("currantMaxHP", this.currantMaxHP);
/* 406 */       nbt.m_128347_("currentMaxMana", this.currentMaxMana);
/* 407 */       nbt.m_128347_("currentSpellResis", this.currentSpellResis);
/* 408 */       nbt.m_128347_("currantArmor", this.currantArmor);
/* 409 */       nbt.m_128347_("currentToughness", this.currentToughness);
/* 410 */       nbt.m_128347_("extraSpellPow", this.extraSpellPow);
/* 411 */       nbt.m_128347_("currentDamage", this.currentDamage);
/* 412 */       nbt.m_128347_("currentAttSpd", this.currentAttSpd);
/* 413 */       nbt.m_128347_("currentSpd", this.currentSpd);
/* 414 */       nbt.m_128347_("currentFirePow", this.currentFirePow);
/* 415 */       nbt.m_128347_("currentIcePow", this.currentIcePow);
/* 416 */       nbt.m_128347_("currentLightPow", this.currentLightPow);
/* 417 */       nbt.m_128347_("currentPsnPow", this.currentPsnPow);
/* 418 */       nbt.m_128347_("currentHolyPow", this.currentHolyPow);
/* 419 */       nbt.m_128347_("currentEndPow", this.currentEndPow);
/* 420 */       nbt.m_128347_("currentBldPow", this.currentBldPow);
/* 421 */       nbt.m_128347_("currentEvoPow", this.currentEvoPow);
/* 422 */       nbt.m_128347_("cooldown", this.cooldown);
/* 423 */       nbt.m_128347_("casttime", this.casttime);
/* 424 */       nbt.m_128347_("currentLuck", this.currentLuck);
/* 425 */       nbt.m_128347_("STRmult", this.STRmult);
/* 426 */       nbt.m_128347_("VITmult", this.VITmult);
/* 427 */       nbt.m_128347_("MANAmult", this.MANAmult);
/* 428 */       nbt.m_128347_("ENDmult", this.ENDmult);
/* 429 */       nbt.m_128347_("DEXmult", this.DEXmult);
/* 430 */       nbt.m_128347_("INTmult", this.INTmult);
/* 431 */       nbt.m_128347_("LCKmult", this.LCKmult);
/* 432 */       nbt.m_128379_("IsFormActive", this.IsFormActive);
/* 433 */       nbt.m_128379_("IsMage", this.IsMage);
/* 434 */       nbt.m_128379_("IsAssass", this.IsAssass);
/* 435 */       nbt.m_128379_("IsWarrior", this.IsWarrior);
/* 436 */       nbt.m_128379_("IsShield", this.IsShield);
/* 437 */       nbt.m_128379_("IsSorcerer", this.IsSorcerer);
/* 438 */       nbt.m_128379_("HasPower", this.HasPower);
/* 439 */       nbt.m_128347_("EffectAdd", this.EffectAdd);
/* 440 */       nbt.m_128347_("VITAdd", this.VITAdd);
/* 441 */       nbt.m_128347_("ENDAdd", this.ENDAdd);
/* 442 */       nbt.m_128347_("MANAAdd", this.MANAAdd);
/* 443 */       nbt.m_128347_("STRAdd", this.STRAdd);
/* 444 */       nbt.m_128347_("DEXAdd", this.DEXAdd);
/* 445 */       nbt.m_128347_("INTAdd", this.INTAdd);
/* 446 */       nbt.m_128347_("LCKAdd", this.LCKAdd);
/* 447 */       nbt.m_128347_("VITTotal", this.VITTotal);
/* 448 */       nbt.m_128347_("MANATotal", this.MANATotal);
/* 449 */       nbt.m_128347_("ENDTotal", this.ENDTotal);
/* 450 */       nbt.m_128347_("STRTotal", this.STRTotal);
/* 451 */       nbt.m_128347_("DEXTotal", this.DEXTotal);
/* 452 */       nbt.m_128347_("INTTotal", this.INTTotal);
/* 453 */       nbt.m_128347_("LUCKTotal", this.LUCKTotal);
/* 454 */       return (Tag)nbt;
/*     */     }
/*     */     
/*     */     public void readNBT(Tag tag) {
/* 458 */       CompoundTag nbt = (CompoundTag)tag;
/* 459 */       this.VIDA = nbt.m_128459_("VIDA");
/* 460 */       this.STR = nbt.m_128459_("STR");
/* 461 */       this.LUCK = nbt.m_128459_("LUCK");
/* 462 */       this.END = nbt.m_128459_("END");
/* 463 */       this.MANA = nbt.m_128459_("MANA");
/* 464 */       this.LVL = nbt.m_128459_("LVL");
/* 465 */       this.INTE = nbt.m_128459_("INTE");
/* 466 */       this.FAITH = nbt.m_128459_("FAITH");
/* 467 */       this.DEX = nbt.m_128459_("DEX");
/* 468 */       this.ARC = nbt.m_128459_("ARC");
/* 469 */       this.ATRPOINT = nbt.m_128459_("ATRPOINT");
/* 470 */       this.XP = nbt.m_128459_("XP");
/* 471 */       this.NEEDXP = nbt.m_128459_("NEEDXP");
/* 472 */       this.currantMaxHP = nbt.m_128459_("currantMaxHP");
/* 473 */       this.currentMaxMana = nbt.m_128459_("currentMaxMana");
/* 474 */       this.currentSpellResis = nbt.m_128459_("currentSpellResis");
/* 475 */       this.currantArmor = nbt.m_128459_("currantArmor");
/* 476 */       this.currentToughness = nbt.m_128459_("currentToughness");
/* 477 */       this.extraSpellPow = nbt.m_128459_("extraSpellPow");
/* 478 */       this.currentDamage = nbt.m_128459_("currentDamage");
/* 479 */       this.currentAttSpd = nbt.m_128459_("currentAttSpd");
/* 480 */       this.currentSpd = nbt.m_128459_("currentSpd");
/* 481 */       this.currentFirePow = nbt.m_128459_("currentFirePow");
/* 482 */       this.currentIcePow = nbt.m_128459_("currentIcePow");
/* 483 */       this.currentLightPow = nbt.m_128459_("currentLightPow");
/* 484 */       this.currentPsnPow = nbt.m_128459_("currentPsnPow");
/* 485 */       this.currentHolyPow = nbt.m_128459_("currentHolyPow");
/* 486 */       this.currentEndPow = nbt.m_128459_("currentEndPow");
/* 487 */       this.currentBldPow = nbt.m_128459_("currentBldPow");
/* 488 */       this.currentEvoPow = nbt.m_128459_("currentEvoPow");
/* 489 */       this.cooldown = nbt.m_128459_("cooldown");
/* 490 */       this.casttime = nbt.m_128459_("casttime");
/* 491 */       this.currentLuck = nbt.m_128459_("currentLuck");
/* 492 */       this.STRmult = nbt.m_128459_("STRmult");
/* 493 */       this.VITmult = nbt.m_128459_("VITmult");
/* 494 */       this.MANAmult = nbt.m_128459_("MANAmult");
/* 495 */       this.ENDmult = nbt.m_128459_("ENDmult");
/* 496 */       this.DEXmult = nbt.m_128459_("DEXmult");
/* 497 */       this.INTmult = nbt.m_128459_("INTmult");
/* 498 */       this.LCKmult = nbt.m_128459_("LCKmult");
/* 499 */       this.IsFormActive = nbt.m_128471_("IsFormActive");
/* 500 */       this.IsMage = nbt.m_128471_("IsMage");
/* 501 */       this.IsAssass = nbt.m_128471_("IsAssass");
/* 502 */       this.IsWarrior = nbt.m_128471_("IsWarrior");
/* 503 */       this.IsShield = nbt.m_128471_("IsShield");
/* 504 */       this.IsSorcerer = nbt.m_128471_("IsSorcerer");
/* 505 */       this.HasPower = nbt.m_128471_("HasPower");
/* 506 */       this.EffectAdd = nbt.m_128459_("EffectAdd");
/* 507 */       this.VITAdd = nbt.m_128459_("VITAdd");
/* 508 */       this.ENDAdd = nbt.m_128459_("ENDAdd");
/* 509 */       this.MANAAdd = nbt.m_128459_("MANAAdd");
/* 510 */       this.STRAdd = nbt.m_128459_("STRAdd");
/* 511 */       this.DEXAdd = nbt.m_128459_("DEXAdd");
/* 512 */       this.INTAdd = nbt.m_128459_("INTAdd");
/* 513 */       this.LCKAdd = nbt.m_128459_("LCKAdd");
/* 514 */       this.VITTotal = nbt.m_128459_("VITTotal");
/* 515 */       this.MANATotal = nbt.m_128459_("MANATotal");
/* 516 */       this.ENDTotal = nbt.m_128459_("ENDTotal");
/* 517 */       this.STRTotal = nbt.m_128459_("STRTotal");
/* 518 */       this.DEXTotal = nbt.m_128459_("DEXTotal");
/* 519 */       this.INTTotal = nbt.m_128459_("INTTotal");
/* 520 */       this.LUCKTotal = nbt.m_128459_("LUCKTotal");
/*     */     }
/*     */   }
/*     */   
/*     */   public static class PlayerVariablesSyncMessage {
/*     */     public KsmpStatsModVariables.PlayerVariables data;
/*     */     
/*     */     public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
/* 528 */       this.data = new KsmpStatsModVariables.PlayerVariables();
/* 529 */       this.data.readNBT((Tag)buffer.m_130260_());
/*     */     }
/*     */     
/*     */     public PlayerVariablesSyncMessage(KsmpStatsModVariables.PlayerVariables data) {
/* 533 */       this.data = data;
/*     */     }
/*     */     
/*     */     public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
/* 537 */       buffer.m_130079_((CompoundTag)message.data.writeNBT());
/*     */     }
/*     */     
/*     */     public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 541 */       NetworkEvent.Context context = contextSupplier.get();
/* 542 */       context.enqueueWork(() -> {
/*     */             if (!context.getDirection().getReceptionSide().isServer()) {
/*     */               KsmpStatsModVariables.PlayerVariables variables = (KsmpStatsModVariables.PlayerVariables)(Minecraft.m_91087_()).f_91074_.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*     */               
/*     */               variables.VIDA = message.data.VIDA;
/*     */               variables.STR = message.data.STR;
/*     */               variables.LUCK = message.data.LUCK;
/*     */               variables.END = message.data.END;
/*     */               variables.MANA = message.data.MANA;
/*     */               variables.LVL = message.data.LVL;
/*     */               variables.INTE = message.data.INTE;
/*     */               variables.FAITH = message.data.FAITH;
/*     */               variables.DEX = message.data.DEX;
/*     */               variables.ARC = message.data.ARC;
/*     */               variables.ATRPOINT = message.data.ATRPOINT;
/*     */               variables.XP = message.data.XP;
/*     */               variables.NEEDXP = message.data.NEEDXP;
/*     */               variables.currantMaxHP = message.data.currantMaxHP;
/*     */               variables.currentMaxMana = message.data.currentMaxMana;
/*     */               variables.currentSpellResis = message.data.currentSpellResis;
/*     */               variables.currantArmor = message.data.currantArmor;
/*     */               variables.currentToughness = message.data.currentToughness;
/*     */               variables.extraSpellPow = message.data.extraSpellPow;
/*     */               variables.currentDamage = message.data.currentDamage;
/*     */               variables.currentAttSpd = message.data.currentAttSpd;
/*     */               variables.currentSpd = message.data.currentSpd;
/*     */               variables.currentFirePow = message.data.currentFirePow;
/*     */               variables.currentIcePow = message.data.currentIcePow;
/*     */               variables.currentLightPow = message.data.currentLightPow;
/*     */               variables.currentPsnPow = message.data.currentPsnPow;
/*     */               variables.currentHolyPow = message.data.currentHolyPow;
/*     */               variables.currentEndPow = message.data.currentEndPow;
/*     */               variables.currentBldPow = message.data.currentBldPow;
/*     */               variables.currentEvoPow = message.data.currentEvoPow;
/*     */               variables.cooldown = message.data.cooldown;
/*     */               variables.casttime = message.data.casttime;
/*     */               variables.currentLuck = message.data.currentLuck;
/*     */               variables.STRmult = message.data.STRmult;
/*     */               variables.VITmult = message.data.VITmult;
/*     */               variables.MANAmult = message.data.MANAmult;
/*     */               variables.ENDmult = message.data.ENDmult;
/*     */               variables.DEXmult = message.data.DEXmult;
/*     */               variables.INTmult = message.data.INTmult;
/*     */               variables.LCKmult = message.data.LCKmult;
/*     */               variables.IsFormActive = message.data.IsFormActive;
/*     */               variables.IsMage = message.data.IsMage;
/*     */               variables.IsAssass = message.data.IsAssass;
/*     */               variables.IsWarrior = message.data.IsWarrior;
/*     */               variables.IsShield = message.data.IsShield;
/*     */               variables.IsSorcerer = message.data.IsSorcerer;
/*     */               variables.HasPower = message.data.HasPower;
/*     */               variables.EffectAdd = message.data.EffectAdd;
/*     */               variables.VITAdd = message.data.VITAdd;
/*     */               variables.ENDAdd = message.data.ENDAdd;
/*     */               variables.MANAAdd = message.data.MANAAdd;
/*     */               variables.STRAdd = message.data.STRAdd;
/*     */               variables.DEXAdd = message.data.DEXAdd;
/*     */               variables.INTAdd = message.data.INTAdd;
/*     */               variables.LCKAdd = message.data.LCKAdd;
/*     */               variables.VITTotal = message.data.VITTotal;
/*     */               variables.MANATotal = message.data.MANATotal;
/*     */               variables.ENDTotal = message.data.ENDTotal;
/*     */               variables.STRTotal = message.data.STRTotal;
/*     */               variables.DEXTotal = message.data.DEXTotal;
/*     */               variables.INTTotal = message.data.INTTotal;
/*     */               variables.LUCKTotal = message.data.LUCKTotal;
/*     */             } 
/*     */           });
/* 610 */       context.setPacketHandled(true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */