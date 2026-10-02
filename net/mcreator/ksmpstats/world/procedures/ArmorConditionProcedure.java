/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ArmorConditionProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 23 */     if (event.phase == TickEvent.Phase.END) {
/* 24 */       execute((Event)event, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 29 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnonnull -> 5
/*    */     //   4: return
/*    */     //   5: aload_1
/*    */     //   6: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   9: getstatic net/minecraftforge/registries/ForgeRegistries.ATTRIBUTES : Lnet/minecraftforge/registries/IForgeRegistry;
/*    */     //   12: new net/minecraft/resources/ResourceLocation
/*    */     //   15: dup
/*    */     //   16: ldc 'irons_spellbooks:max_mana'
/*    */     //   18: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   21: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
/*    */     //   26: checkcast net/minecraft/world/entity/ai/attributes/Attribute
/*    */     //   29: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   32: invokevirtual m_22115_ : ()D
/*    */     //   35: ldc2_w 200.0
/*    */     //   38: dadd
/*    */     //   39: aload_1
/*    */     //   40: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   43: getstatic net/minecraftforge/registries/ForgeRegistries.ATTRIBUTES : Lnet/minecraftforge/registries/IForgeRegistry;
/*    */     //   46: new net/minecraft/resources/ResourceLocation
/*    */     //   49: dup
/*    */     //   50: ldc 'irons_spellbooks:max_mana'
/*    */     //   52: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   55: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
/*    */     //   60: checkcast net/minecraft/world/entity/ai/attributes/Attribute
/*    */     //   63: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   66: invokevirtual m_22135_ : ()D
/*    */     //   69: dcmpg
/*    */     //   70: ifge -> 203
/*    */     //   73: aload_1
/*    */     //   74: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   77: aconst_null
/*    */     //   78: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   81: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   84: dup
/*    */     //   85: invokespecial <init> : ()V
/*    */     //   88: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   91: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   94: getfield INTE : D
/*    */     //   97: aload_1
/*    */     //   98: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   101: getstatic net/minecraftforge/registries/ForgeRegistries.ATTRIBUTES : Lnet/minecraftforge/registries/IForgeRegistry;
/*    */     //   104: new net/minecraft/resources/ResourceLocation
/*    */     //   107: dup
/*    */     //   108: ldc 'irons_spellbooks:max_mana'
/*    */     //   110: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   113: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
/*    */     //   118: checkcast net/minecraft/world/entity/ai/attributes/Attribute
/*    */     //   121: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   124: invokevirtual m_22135_ : ()D
/*    */     //   127: aload_1
/*    */     //   128: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   131: getstatic net/minecraftforge/registries/ForgeRegistries.ATTRIBUTES : Lnet/minecraftforge/registries/IForgeRegistry;
/*    */     //   134: new net/minecraft/resources/ResourceLocation
/*    */     //   137: dup
/*    */     //   138: ldc 'irons_spellbooks:max_mana'
/*    */     //   140: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   143: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
/*    */     //   148: checkcast net/minecraft/world/entity/ai/attributes/Attribute
/*    */     //   151: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   154: invokevirtual m_22115_ : ()D
/*    */     //   157: dsub
/*    */     //   158: ldc2_w 200.0
/*    */     //   161: dsub
/*    */     //   162: ldc2_w 20.0
/*    */     //   165: ddiv
/*    */     //   166: dcmpg
/*    */     //   167: ifge -> 668
/*    */     //   170: aload_1
/*    */     //   171: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   174: ifeq -> 200
/*    */     //   177: aload_1
/*    */     //   178: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   181: astore_2
/*    */     //   182: aload_2
/*    */     //   183: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   186: dup
/*    */     //   187: getstatic net/minecraft/world/effect/MobEffects.f_19597_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   190: bipush #20
/*    */     //   192: iconst_1
/*    */     //   193: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;II)V
/*    */     //   196: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   199: pop
/*    */     //   200: goto -> 668
/*    */     //   203: aload_1
/*    */     //   204: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   207: ifeq -> 250
/*    */     //   210: aload_1
/*    */     //   211: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   214: astore_2
/*    */     //   215: aload_2
/*    */     //   216: getstatic net/minecraft/world/effect/MobEffects.f_19596_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   219: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   222: ifeq -> 250
/*    */     //   225: aload_1
/*    */     //   226: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   229: ifeq -> 250
/*    */     //   232: aload_1
/*    */     //   233: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   236: astore_3
/*    */     //   237: aload_3
/*    */     //   238: getstatic net/minecraft/world/effect/MobEffects.f_19605_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   241: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   244: ifeq -> 250
/*    */     //   247: goto -> 268
/*    */     //   250: aload_1
/*    */     //   251: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   254: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22278_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   257: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   260: invokevirtual m_22135_ : ()D
/*    */     //   263: dconst_1
/*    */     //   264: dcmpl
/*    */     //   265: iflt -> 419
/*    */     //   268: aload_1
/*    */     //   269: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   272: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22284_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   275: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   278: invokevirtual m_22135_ : ()D
/*    */     //   281: aload_1
/*    */     //   282: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   285: aconst_null
/*    */     //   286: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   289: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   292: dup
/*    */     //   293: invokespecial <init> : ()V
/*    */     //   296: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   299: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   302: getfield END : D
/*    */     //   305: ldc2_w 5.0
/*    */     //   308: ddiv
/*    */     //   309: dsub
/*    */     //   310: ldc2_w 2.0
/*    */     //   313: dmul
/*    */     //   314: ldc2_w 20.0
/*    */     //   317: dcmpl
/*    */     //   318: ifne -> 419
/*    */     //   321: aload_1
/*    */     //   322: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   325: aconst_null
/*    */     //   326: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   329: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   332: dup
/*    */     //   333: invokespecial <init> : ()V
/*    */     //   336: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   339: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   342: getfield END : D
/*    */     //   345: ldc2_w 30.0
/*    */     //   348: dcmpg
/*    */     //   349: ifge -> 668
/*    */     //   352: aload_1
/*    */     //   353: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   356: ifeq -> 384
/*    */     //   359: aload_1
/*    */     //   360: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   363: astore #4
/*    */     //   365: aload #4
/*    */     //   367: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   370: dup
/*    */     //   371: getstatic net/minecraft/world/effect/MobEffects.f_19597_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   374: bipush #20
/*    */     //   376: iconst_3
/*    */     //   377: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;II)V
/*    */     //   380: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   383: pop
/*    */     //   384: aload_1
/*    */     //   385: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   388: ifeq -> 416
/*    */     //   391: aload_1
/*    */     //   392: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   395: astore #4
/*    */     //   397: aload #4
/*    */     //   399: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   402: dup
/*    */     //   403: getstatic net/minecraft/world/effect/MobEffects.f_19599_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   406: bipush #20
/*    */     //   408: iconst_2
/*    */     //   409: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;II)V
/*    */     //   412: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   415: pop
/*    */     //   416: goto -> 668
/*    */     //   419: aload_1
/*    */     //   420: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   423: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22278_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   426: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   429: invokevirtual m_22135_ : ()D
/*    */     //   432: ldc2_w 0.4
/*    */     //   435: dcmpl
/*    */     //   436: iflt -> 566
/*    */     //   439: aload_1
/*    */     //   440: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   443: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22278_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   446: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   449: invokevirtual m_22135_ : ()D
/*    */     //   452: dconst_1
/*    */     //   453: dcmpg
/*    */     //   454: ifge -> 566
/*    */     //   457: aload_1
/*    */     //   458: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   461: aconst_null
/*    */     //   462: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   465: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   468: dup
/*    */     //   469: invokespecial <init> : ()V
/*    */     //   472: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   475: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   478: getfield END : D
/*    */     //   481: aload_1
/*    */     //   482: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   485: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22284_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   488: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   491: invokevirtual m_22135_ : ()D
/*    */     //   494: aload_1
/*    */     //   495: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   498: aconst_null
/*    */     //   499: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   502: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   505: dup
/*    */     //   506: invokespecial <init> : ()V
/*    */     //   509: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   512: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   515: getfield END : D
/*    */     //   518: ldc2_w 5.0
/*    */     //   521: ddiv
/*    */     //   522: dsub
/*    */     //   523: ldc2_w 2.0
/*    */     //   526: dmul
/*    */     //   527: dcmpg
/*    */     //   528: ifge -> 668
/*    */     //   531: aload_1
/*    */     //   532: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   535: ifeq -> 563
/*    */     //   538: aload_1
/*    */     //   539: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   542: astore #4
/*    */     //   544: aload #4
/*    */     //   546: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   549: dup
/*    */     //   550: getstatic net/minecraft/world/effect/MobEffects.f_19597_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   553: bipush #20
/*    */     //   555: iconst_2
/*    */     //   556: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;II)V
/*    */     //   559: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   562: pop
/*    */     //   563: goto -> 668
/*    */     //   566: aload_1
/*    */     //   567: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   570: aconst_null
/*    */     //   571: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   574: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   577: dup
/*    */     //   578: invokespecial <init> : ()V
/*    */     //   581: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   584: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   587: getfield END : D
/*    */     //   590: aload_1
/*    */     //   591: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   594: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22284_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   597: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   600: invokevirtual m_22135_ : ()D
/*    */     //   603: aload_1
/*    */     //   604: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   607: aconst_null
/*    */     //   608: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   611: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   614: dup
/*    */     //   615: invokespecial <init> : ()V
/*    */     //   618: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   621: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   624: getfield END : D
/*    */     //   627: ldc2_w 5.0
/*    */     //   630: ddiv
/*    */     //   631: dsub
/*    */     //   632: dcmpg
/*    */     //   633: ifge -> 668
/*    */     //   636: aload_1
/*    */     //   637: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   640: ifeq -> 668
/*    */     //   643: aload_1
/*    */     //   644: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   647: astore #4
/*    */     //   649: aload #4
/*    */     //   651: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   654: dup
/*    */     //   655: getstatic net/minecraft/world/effect/MobEffects.f_19597_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   658: bipush #20
/*    */     //   660: iconst_1
/*    */     //   661: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;II)V
/*    */     //   664: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   667: pop
/*    */     //   668: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 0
/*    */     //   #34	-> 4
/*    */     //   #35	-> 5
/*    */     //   #36	-> 32
/*    */     //   #37	-> 55
/*    */     //   #38	-> 73
/*    */     //   #39	-> 88
/*    */     //   #40	-> 113
/*    */     //   #42	-> 143
/*    */     //   #43	-> 154
/*    */     //   #45	-> 170
/*    */     //   #46	-> 182
/*    */     //   #49	-> 203
/*    */     //   #50	-> 232
/*    */     //   #51	-> 257
/*    */     //   #52	-> 275
/*    */     //   #53	-> 286
/*    */     //   #54	-> 296
/*    */     //   #56	-> 321
/*    */     //   #57	-> 336
/*    */     //   #58	-> 352
/*    */     //   #59	-> 365
/*    */     //   #60	-> 384
/*    */     //   #61	-> 397
/*    */     //   #63	-> 419
/*    */     //   #64	-> 429
/*    */     //   #65	-> 446
/*    */     //   #66	-> 449
/*    */     //   #67	-> 457
/*    */     //   #68	-> 472
/*    */     //   #69	-> 488
/*    */     //   #70	-> 499
/*    */     //   #71	-> 509
/*    */     //   #73	-> 531
/*    */     //   #74	-> 544
/*    */     //   #77	-> 566
/*    */     //   #78	-> 581
/*    */     //   #79	-> 597
/*    */     //   #80	-> 608
/*    */     //   #81	-> 618
/*    */     //   #82	-> 636
/*    */     //   #83	-> 649
/*    */     //   #87	-> 668
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   182	18	2	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   215	35	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   237	13	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   365	19	4	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   397	19	4	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   544	19	4	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   649	19	4	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	669	0	event	Lnet/minecraftforge/eventbus/api/Event;
/*    */     //   0	669	1	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ArmorConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */