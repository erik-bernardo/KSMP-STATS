/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class EffectDissipProcedure {
/*     */   public static void execute(Entity entity) {
/*  13 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  16 */     double _setval = 1.0D;
/*  17 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.VITmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  23 */     _setval = 1.0D;
/*  24 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.MANAmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  30 */     _setval = 1.0D;
/*  31 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.ENDmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  37 */     _setval = 1.0D;
/*  38 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.STRmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  44 */     _setval = 1.0D;
/*  45 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.DEXmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  51 */     _setval = 1.0D;
/*  52 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.INTmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*     */     
/*  58 */     _setval = 1.0D;
/*  59 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.LCKmult = _setval;
/*     */           
/*     */           capability.syncPlayerVariables(entity);
/*     */         });
/*  64 */     ((LivingEntity)entity).m_21051_(Attributes.f_22276_)
/*  65 */       .m_22100_(10.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  66 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  67 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  68 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  69 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  70 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITAdd));
/*  71 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:max_mana")))
/*  72 */       .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  73 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  74 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  75 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  76 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  77 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) * 20.0D);
/*     */     
/*  79 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_resist")))
/*  80 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  81 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)entity
/*  82 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  83 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  84 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  85 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) / 100.0D);
/*     */     
/*  87 */     if (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  88 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  89 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  90 */       .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  91 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) <= 50.0D) {
/*  92 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/*  93 */         .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  94 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/*  95 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  96 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/*  97 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  98 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */       
/* 100 */       ((LivingEntity)entity).m_21051_(Attributes.f_22284_)
/* 101 */         .m_22100_(-10.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 102 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 103 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 104 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 105 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 106 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */     } else {
/*     */       
/* 109 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_)
/* 110 */         .m_22100_(10.0D + (((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 111 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)entity
/* 112 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 113 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 114 */           .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 115 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) - 50.0D) / 2.0D);
/*     */       
/* 117 */       ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(0.0D);
/*     */     } 
/* 119 */     ((LivingEntity)entity).m_21051_(Attributes.f_22281_)
/* 120 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 121 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STR * (((KsmpStatsModVariables.PlayerVariables)entity
/* 122 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 123 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 124 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 125 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRAdd) / 20.0D);
/*     */     
/* 127 */     ((LivingEntity)entity).m_21051_(Attributes.f_22283_)
/* 128 */       .m_22100_(4.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 129 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEX * (((KsmpStatsModVariables.PlayerVariables)entity
/* 130 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 131 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 132 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 133 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXAdd) / 25.0D);
/*     */     
/* 135 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cast_time_reduction")))
/* 136 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 137 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 138 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 139 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 140 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 141 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 143 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cooldown_reduction")))
/* 144 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 145 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 146 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 147 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 148 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 149 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 151 */     ((LivingEntity)entity).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_power")))
/* 152 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 153 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)entity
/* 154 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 155 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 156 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 157 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 159 */     ((LivingEntity)entity).m_21051_(Attributes.f_22286_)
/* 160 */       .m_22100_(((KsmpStatsModVariables.PlayerVariables)entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 161 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK * (((KsmpStatsModVariables.PlayerVariables)entity
/* 162 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 163 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKmult + ((KsmpStatsModVariables.PlayerVariables)entity
/* 164 */         .getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 165 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKAdd) / 10.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\EffectDissipProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */