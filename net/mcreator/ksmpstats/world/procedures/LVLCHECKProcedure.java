/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class LVLCHECKProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/*  21 */     if (event.phase == TickEvent.Phase.END) {
/*  22 */       execute((Event)event, (Entity)event.player);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void execute(Entity entity) {
/*  27 */     execute(null, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, Entity entity) {
/*  31 */     if (entity == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     double _setval = 0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANA + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STR + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTE;
/*  49 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.LVL = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  56 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LVL * 10.0D + 10.0D;
/*  57 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.NEEDXP = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/*  66 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).VITmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).VITAdd;
/*  67 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.VITTotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/*  76 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd;
/*  77 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.MANATotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/*  86 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd;
/*  87 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.ENDTotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/*  96 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STRmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STRAdd;
/*  97 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.STRTotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/* 106 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEXmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEXAdd;
/* 107 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.DEXTotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/* 116 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd;
/* 117 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.INTTotal = _setval;
/*     */ 
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */ 
/*     */     
/* 126 */     _setval = ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LCKmult + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LCKAdd;
/* 127 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.LUCKTotal = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 133 */     _setval = ((LivingEntity)entity).m_21051_(Attributes.f_22276_).m_22135_();
/* 134 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currantMaxHP = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 141 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:max_mana"))).m_22135_();
/* 142 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentMaxMana = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 149 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_resist"))).m_22135_() * 100.0D - 100.0D;
/* 150 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentSpellResis = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 156 */     LivingEntity _livEnt = (LivingEntity)entity; _setval = (((entity instanceof LivingEntity) ? _livEnt.m_21230_() : 0) * 4);
/* 157 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currantArmor = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 163 */     _setval = ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22135_();
/* 164 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentToughness = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 171 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_power"))).m_22135_() * 100.0D - 100.0D;
/* 172 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.extraSpellPow = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 178 */     _setval = ((LivingEntity)entity).m_21051_(Attributes.f_22283_).m_22135_() / 4.0D * 100.0D;
/*     */     
/* 180 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentAttSpd = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 186 */     _setval = ((LivingEntity)entity).m_21051_(Attributes.f_22279_).m_22135_() * 1000.0D;
/*     */     
/* 188 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentSpd = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 195 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:fire_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 197 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentFirePow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 204 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:ice_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 206 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentIcePow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 213 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cooldown_reduction"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 215 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.cooldown = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 222 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cast_time_reduction"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 224 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.casttime = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 231 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:lightning_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 233 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentLightPow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 240 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:ender_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 242 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentEndPow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 249 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:poison_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 251 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentPsnPow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 258 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:holy_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 260 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentHolyPow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 267 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:blood_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 269 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentBldPow = _setval;
/*     */ 
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 276 */     _setval = ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:evocation_spell_power"))).m_22135_() * 100.0D - 100.0D;
/*     */     
/* 278 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentEvoPow = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/* 284 */     _setval = ((LivingEntity)entity).m_21051_(Attributes.f_22286_).m_22135_() * 10.0D;
/* 285 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.currentLuck = _setval;
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\LVLCHECKProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */