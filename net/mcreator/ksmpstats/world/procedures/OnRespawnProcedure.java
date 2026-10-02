/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class OnRespawnProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
/*  21 */     execute((Event)event, (Entity)event.getPlayer());
/*     */   }
/*     */   
/*     */   public static void execute(Entity entity) {
/*  25 */     execute(null, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, Entity entity) {
/*  29 */     if (entity == null)
/*     */       return; 
/*  31 */     ((LivingEntity)entity).m_21051_(Attributes.f_22276_)
/*  32 */       .m_22100_(10.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  33 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  34 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  35 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  36 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  37 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITAdd));
/*  38 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:max_mana")))
/*  39 */       .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  40 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  41 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  42 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  43 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  44 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) * 20.0D);
/*     */     
/*  46 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_resist")))
/*  47 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  48 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  49 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  50 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  51 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  52 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) / 100.0D);
/*     */     
/*  54 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  55 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  56 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  57 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  58 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) <= 50.0D) {
/*  59 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/*  60 */         .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  61 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  62 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  63 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  64 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  65 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */       
/*  67 */       ((LivingEntity)entity).m_21051_(Attributes.f_22284_)
/*  68 */         .m_22100_(-10.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  69 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  70 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  71 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  72 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  73 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */     } else {
/*     */       
/*  76 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/*  77 */         .m_22100_(10.0D + (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  78 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  79 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  80 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  81 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  82 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) - 50.0D) / 2.0D);
/*     */       
/*  84 */       ((LivingEntity)entity).m_21051_(Attributes.f_22284_).m_22100_(0.0D);
/*     */     } 
/*  86 */     ((LivingEntity)entity).m_21051_(Attributes.f_22281_)
/*  87 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  88 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STR * (((KsmpStatsModVariables.PlayerVariables)entity
/*  89 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  90 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  91 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  92 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRAdd) / 20.0D);
/*     */     
/*  94 */     ((LivingEntity)entity).m_21051_(Attributes.f_22283_)
/*  95 */       .m_22100_(4.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  96 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEX * (((KsmpStatsModVariables.PlayerVariables)entity
/*  97 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  98 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  99 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 100 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXAdd) / 25.0D);
/*     */     
/* 102 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cast_time_reduction")))
/* 103 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 104 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 105 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 106 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 107 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 108 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 110 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cooldown_reduction")))
/* 111 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 112 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 113 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 114 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 115 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 116 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 118 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_power")))
/* 119 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 120 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 121 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 122 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 123 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 124 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 126 */     ((LivingEntity)entity).m_21051_(Attributes.f_22286_)
/* 127 */       .m_22100_(((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 128 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK * (((KsmpStatsModVariables.PlayerVariables)entity
/* 129 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 130 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 131 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 132 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKAdd) / 10.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\OnRespawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */