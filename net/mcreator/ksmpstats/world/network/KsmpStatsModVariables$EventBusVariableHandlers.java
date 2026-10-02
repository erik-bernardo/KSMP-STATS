/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.saveddata.SavedData;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
/*     */ @EventBusSubscriber
/*     */ public class EventBusVariableHandlers
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
/*  56 */     if (!(event.getPlayer()).f_19853_.m_5776_())
/*  57 */       ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  58 */         .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
/*  63 */     if (!(event.getPlayer()).f_19853_.m_5776_())
/*  64 */       ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  65 */         .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
/*  70 */     if (!(event.getPlayer()).f_19853_.m_5776_())
/*  71 */       ((KsmpStatsModVariables.PlayerVariables)event.getPlayer().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables()))
/*  72 */         .syncPlayerVariables((Entity)event.getPlayer()); 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void clonePlayer(PlayerEvent.Clone event) {
/*  77 */     event.getOriginal().revive();
/*     */     
/*  79 */     KsmpStatsModVariables.PlayerVariables original = (KsmpStatsModVariables.PlayerVariables)event.getOriginal().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*     */     
/*  81 */     KsmpStatsModVariables.PlayerVariables clone = (KsmpStatsModVariables.PlayerVariables)event.getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*  82 */     clone.VIDA = original.VIDA;
/*  83 */     clone.STR = original.STR;
/*  84 */     clone.LUCK = original.LUCK;
/*  85 */     clone.END = original.END;
/*  86 */     clone.MANA = original.MANA;
/*  87 */     clone.LVL = original.LVL;
/*  88 */     clone.INTE = original.INTE;
/*  89 */     clone.FAITH = original.FAITH;
/*  90 */     clone.DEX = original.DEX;
/*  91 */     clone.ARC = original.ARC;
/*  92 */     clone.ATRPOINT = original.ATRPOINT;
/*  93 */     clone.XP = original.XP;
/*  94 */     clone.NEEDXP = original.NEEDXP;
/*  95 */     clone.currantMaxHP = original.currantMaxHP;
/*  96 */     clone.currentMaxMana = original.currentMaxMana;
/*  97 */     clone.currentSpellResis = original.currentSpellResis;
/*  98 */     clone.currantArmor = original.currantArmor;
/*  99 */     clone.currentToughness = original.currentToughness;
/* 100 */     clone.extraSpellPow = original.extraSpellPow;
/* 101 */     clone.currentDamage = original.currentDamage;
/* 102 */     clone.currentAttSpd = original.currentAttSpd;
/* 103 */     clone.currentSpd = original.currentSpd;
/* 104 */     clone.currentFirePow = original.currentFirePow;
/* 105 */     clone.currentIcePow = original.currentIcePow;
/* 106 */     clone.currentLightPow = original.currentLightPow;
/* 107 */     clone.currentPsnPow = original.currentPsnPow;
/* 108 */     clone.currentHolyPow = original.currentHolyPow;
/* 109 */     clone.currentEndPow = original.currentEndPow;
/* 110 */     clone.currentBldPow = original.currentBldPow;
/* 111 */     clone.currentEvoPow = original.currentEvoPow;
/* 112 */     clone.cooldown = original.cooldown;
/* 113 */     clone.casttime = original.casttime;
/* 114 */     clone.currentLuck = original.currentLuck;
/* 115 */     clone.STRmult = original.STRmult;
/* 116 */     clone.VITmult = original.VITmult;
/* 117 */     clone.MANAmult = original.MANAmult;
/* 118 */     clone.ENDmult = original.ENDmult;
/* 119 */     clone.DEXmult = original.DEXmult;
/* 120 */     clone.INTmult = original.INTmult;
/* 121 */     clone.LCKmult = original.LCKmult;
/* 122 */     clone.IsFormActive = original.IsFormActive;
/* 123 */     clone.IsMage = original.IsMage;
/* 124 */     clone.IsAssass = original.IsAssass;
/* 125 */     clone.IsWarrior = original.IsWarrior;
/* 126 */     clone.IsShield = original.IsShield;
/* 127 */     clone.IsSorcerer = original.IsSorcerer;
/* 128 */     clone.HasPower = original.HasPower;
/* 129 */     clone.EffectAdd = original.EffectAdd;
/* 130 */     clone.VITAdd = original.VITAdd;
/* 131 */     clone.ENDAdd = original.ENDAdd;
/* 132 */     clone.MANAAdd = original.MANAAdd;
/* 133 */     clone.STRAdd = original.STRAdd;
/* 134 */     clone.DEXAdd = original.DEXAdd;
/* 135 */     clone.INTAdd = original.INTAdd;
/* 136 */     clone.LCKAdd = original.LCKAdd;
/* 137 */     clone.VITTotal = original.VITTotal;
/* 138 */     clone.MANATotal = original.MANATotal;
/* 139 */     clone.ENDTotal = original.ENDTotal;
/* 140 */     clone.STRTotal = original.STRTotal;
/* 141 */     clone.DEXTotal = original.DEXTotal;
/* 142 */     clone.INTTotal = original.INTTotal;
/* 143 */     clone.LUCKTotal = original.LUCKTotal;
/* 144 */     if (!event.isWasDeath());
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 150 */     if (!(event.getPlayer()).f_19853_.m_5776_()) {
/* 151 */       SavedData mapdata = KsmpStatsModVariables.MapVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 152 */       SavedData worlddata = KsmpStatsModVariables.WorldVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 153 */       if (mapdata != null) {
/* 154 */         KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(0, mapdata));
/*     */       }
/* 156 */       if (worlddata != null) {
/* 157 */         KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(1, worlddata));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
/* 164 */     if (!(event.getPlayer()).f_19853_.m_5776_()) {
/* 165 */       SavedData worlddata = KsmpStatsModVariables.WorldVariables.get((LevelAccessor)(event.getPlayer()).f_19853_);
/* 166 */       if (worlddata != null)
/* 167 */         KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getPlayer()), new KsmpStatsModVariables.SavedDataSyncMessage(1, worlddata)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$EventBusVariableHandlers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */