/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.nbt.Tag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlayerVariablesSyncMessage
/*     */ {
/*     */   public KsmpStatsModVariables.PlayerVariables data;
/*     */   
/*     */   public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
/* 528 */     this.data = new KsmpStatsModVariables.PlayerVariables();
/* 529 */     this.data.readNBT((Tag)buffer.m_130260_());
/*     */   }
/*     */   
/*     */   public PlayerVariablesSyncMessage(KsmpStatsModVariables.PlayerVariables data) {
/* 533 */     this.data = data;
/*     */   }
/*     */   
/*     */   public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
/* 537 */     buffer.m_130079_((CompoundTag)message.data.writeNBT());
/*     */   }
/*     */   
/*     */   public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 541 */     NetworkEvent.Context context = contextSupplier.get();
/* 542 */     context.enqueueWork(() -> {
/*     */           if (!context.getDirection().getReceptionSide().isServer()) {
/*     */             KsmpStatsModVariables.PlayerVariables variables = (KsmpStatsModVariables.PlayerVariables)(Minecraft.m_91087_()).f_91074_.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables());
/*     */             
/*     */             variables.VIDA = message.data.VIDA;
/*     */             variables.STR = message.data.STR;
/*     */             variables.LUCK = message.data.LUCK;
/*     */             variables.END = message.data.END;
/*     */             variables.MANA = message.data.MANA;
/*     */             variables.LVL = message.data.LVL;
/*     */             variables.INTE = message.data.INTE;
/*     */             variables.FAITH = message.data.FAITH;
/*     */             variables.DEX = message.data.DEX;
/*     */             variables.ARC = message.data.ARC;
/*     */             variables.ATRPOINT = message.data.ATRPOINT;
/*     */             variables.XP = message.data.XP;
/*     */             variables.NEEDXP = message.data.NEEDXP;
/*     */             variables.currantMaxHP = message.data.currantMaxHP;
/*     */             variables.currentMaxMana = message.data.currentMaxMana;
/*     */             variables.currentSpellResis = message.data.currentSpellResis;
/*     */             variables.currantArmor = message.data.currantArmor;
/*     */             variables.currentToughness = message.data.currentToughness;
/*     */             variables.extraSpellPow = message.data.extraSpellPow;
/*     */             variables.currentDamage = message.data.currentDamage;
/*     */             variables.currentAttSpd = message.data.currentAttSpd;
/*     */             variables.currentSpd = message.data.currentSpd;
/*     */             variables.currentFirePow = message.data.currentFirePow;
/*     */             variables.currentIcePow = message.data.currentIcePow;
/*     */             variables.currentLightPow = message.data.currentLightPow;
/*     */             variables.currentPsnPow = message.data.currentPsnPow;
/*     */             variables.currentHolyPow = message.data.currentHolyPow;
/*     */             variables.currentEndPow = message.data.currentEndPow;
/*     */             variables.currentBldPow = message.data.currentBldPow;
/*     */             variables.currentEvoPow = message.data.currentEvoPow;
/*     */             variables.cooldown = message.data.cooldown;
/*     */             variables.casttime = message.data.casttime;
/*     */             variables.currentLuck = message.data.currentLuck;
/*     */             variables.STRmult = message.data.STRmult;
/*     */             variables.VITmult = message.data.VITmult;
/*     */             variables.MANAmult = message.data.MANAmult;
/*     */             variables.ENDmult = message.data.ENDmult;
/*     */             variables.DEXmult = message.data.DEXmult;
/*     */             variables.INTmult = message.data.INTmult;
/*     */             variables.LCKmult = message.data.LCKmult;
/*     */             variables.IsFormActive = message.data.IsFormActive;
/*     */             variables.IsMage = message.data.IsMage;
/*     */             variables.IsAssass = message.data.IsAssass;
/*     */             variables.IsWarrior = message.data.IsWarrior;
/*     */             variables.IsShield = message.data.IsShield;
/*     */             variables.IsSorcerer = message.data.IsSorcerer;
/*     */             variables.HasPower = message.data.HasPower;
/*     */             variables.EffectAdd = message.data.EffectAdd;
/*     */             variables.VITAdd = message.data.VITAdd;
/*     */             variables.ENDAdd = message.data.ENDAdd;
/*     */             variables.MANAAdd = message.data.MANAAdd;
/*     */             variables.STRAdd = message.data.STRAdd;
/*     */             variables.DEXAdd = message.data.DEXAdd;
/*     */             variables.INTAdd = message.data.INTAdd;
/*     */             variables.LCKAdd = message.data.LCKAdd;
/*     */             variables.VITTotal = message.data.VITTotal;
/*     */             variables.MANATotal = message.data.MANATotal;
/*     */             variables.ENDTotal = message.data.ENDTotal;
/*     */             variables.STRTotal = message.data.STRTotal;
/*     */             variables.DEXTotal = message.data.DEXTotal;
/*     */             variables.INTTotal = message.data.INTTotal;
/*     */             variables.LUCKTotal = message.data.LUCKTotal;
/*     */           } 
/*     */         });
/* 610 */     context.setPacketHandled(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$PlayerVariablesSyncMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */