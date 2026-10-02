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
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class WeaponConditionProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 24 */     if (event.phase == TickEvent.Phase.END) {
/* 25 */       execute((Event)event, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 30 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnonnull -> 5
/*    */     //   4: return
/*    */     //   5: aload_1
/*    */     //   6: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   9: ifeq -> 513
/*    */     //   12: aload_1
/*    */     //   13: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   16: astore_2
/*    */     //   17: aload_2
/*    */     //   18: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   21: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   24: ifeq -> 513
/*    */     //   27: aload_1
/*    */     //   28: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   31: ifeq -> 62
/*    */     //   34: aload_1
/*    */     //   35: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   38: astore_3
/*    */     //   39: aload_3
/*    */     //   40: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   43: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   46: ifeq -> 62
/*    */     //   49: aload_3
/*    */     //   50: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   53: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
/*    */     //   56: invokevirtual m_19564_ : ()I
/*    */     //   59: goto -> 63
/*    */     //   62: iconst_0
/*    */     //   63: iconst_1
/*    */     //   64: if_icmpge -> 513
/*    */     //   67: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   70: aload_1
/*    */     //   71: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   74: ifeq -> 91
/*    */     //   77: aload_1
/*    */     //   78: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   81: astore #4
/*    */     //   83: aload #4
/*    */     //   85: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   88: goto -> 94
/*    */     //   91: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   94: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   97: ifeq -> 240
/*    */     //   100: aload_1
/*    */     //   101: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   104: aconst_null
/*    */     //   105: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   108: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   111: dup
/*    */     //   112: invokespecial <init> : ()V
/*    */     //   115: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   118: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   121: getfield STR : D
/*    */     //   124: ldc2_w 1.5
/*    */     //   127: dmul
/*    */     //   128: aload_1
/*    */     //   129: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   132: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   135: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   138: invokevirtual m_22135_ : ()D
/*    */     //   141: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   144: aload_1
/*    */     //   145: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   148: ifeq -> 165
/*    */     //   151: aload_1
/*    */     //   152: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   155: astore #6
/*    */     //   157: aload #6
/*    */     //   159: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   162: goto -> 168
/*    */     //   165: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   168: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   171: i2d
/*    */     //   172: ldc2_w 0.5
/*    */     //   175: dmul
/*    */     //   176: dadd
/*    */     //   177: ldc2_w 0.5
/*    */     //   180: dadd
/*    */     //   181: aload_1
/*    */     //   182: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   185: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   188: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   191: invokevirtual m_22115_ : ()D
/*    */     //   194: dsub
/*    */     //   195: ldc2_w 1.5
/*    */     //   198: dmul
/*    */     //   199: dcmpg
/*    */     //   200: ifge -> 1073
/*    */     //   203: aload_1
/*    */     //   204: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   207: ifeq -> 237
/*    */     //   210: aload_1
/*    */     //   211: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   214: astore #7
/*    */     //   216: aload #7
/*    */     //   218: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   221: dup
/*    */     //   222: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   225: bipush #20
/*    */     //   227: iconst_1
/*    */     //   228: iconst_0
/*    */     //   229: iconst_1
/*    */     //   230: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   233: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   236: pop
/*    */     //   237: goto -> 1073
/*    */     //   240: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   243: aload_1
/*    */     //   244: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   247: ifeq -> 264
/*    */     //   250: aload_1
/*    */     //   251: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   254: astore #5
/*    */     //   256: aload #5
/*    */     //   258: invokevirtual m_21206_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   261: goto -> 267
/*    */     //   264: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   267: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   270: ifeq -> 413
/*    */     //   273: aload_1
/*    */     //   274: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   277: aconst_null
/*    */     //   278: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   281: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   284: dup
/*    */     //   285: invokespecial <init> : ()V
/*    */     //   288: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   291: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   294: getfield STR : D
/*    */     //   297: ldc2_w 1.5
/*    */     //   300: dmul
/*    */     //   301: aload_1
/*    */     //   302: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   305: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   308: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   311: invokevirtual m_22135_ : ()D
/*    */     //   314: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   317: aload_1
/*    */     //   318: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   321: ifeq -> 338
/*    */     //   324: aload_1
/*    */     //   325: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   328: astore #6
/*    */     //   330: aload #6
/*    */     //   332: invokevirtual m_21206_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   335: goto -> 341
/*    */     //   338: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   341: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   344: i2d
/*    */     //   345: ldc2_w 0.5
/*    */     //   348: dmul
/*    */     //   349: dadd
/*    */     //   350: ldc2_w 0.5
/*    */     //   353: dadd
/*    */     //   354: aload_1
/*    */     //   355: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   358: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   361: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   364: invokevirtual m_22115_ : ()D
/*    */     //   367: dsub
/*    */     //   368: ldc2_w 1.5
/*    */     //   371: dmul
/*    */     //   372: dcmpg
/*    */     //   373: ifge -> 1073
/*    */     //   376: aload_1
/*    */     //   377: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   380: ifeq -> 410
/*    */     //   383: aload_1
/*    */     //   384: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   387: astore #7
/*    */     //   389: aload #7
/*    */     //   391: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   394: dup
/*    */     //   395: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   398: bipush #20
/*    */     //   400: iconst_1
/*    */     //   401: iconst_0
/*    */     //   402: iconst_1
/*    */     //   403: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   406: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   409: pop
/*    */     //   410: goto -> 1073
/*    */     //   413: aload_1
/*    */     //   414: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   417: aconst_null
/*    */     //   418: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   421: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   424: dup
/*    */     //   425: invokespecial <init> : ()V
/*    */     //   428: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   431: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   434: getfield STR : D
/*    */     //   437: ldc2_w 1.5
/*    */     //   440: dmul
/*    */     //   441: aload_1
/*    */     //   442: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   445: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   448: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   451: invokevirtual m_22135_ : ()D
/*    */     //   454: aload_1
/*    */     //   455: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   458: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   461: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   464: invokevirtual m_22115_ : ()D
/*    */     //   467: dsub
/*    */     //   468: ldc2_w 1.5
/*    */     //   471: dmul
/*    */     //   472: dcmpg
/*    */     //   473: ifge -> 1073
/*    */     //   476: aload_1
/*    */     //   477: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   480: ifeq -> 510
/*    */     //   483: aload_1
/*    */     //   484: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   487: astore #6
/*    */     //   489: aload #6
/*    */     //   491: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   494: dup
/*    */     //   495: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   498: bipush #20
/*    */     //   500: iconst_1
/*    */     //   501: iconst_0
/*    */     //   502: iconst_1
/*    */     //   503: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   506: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   509: pop
/*    */     //   510: goto -> 1073
/*    */     //   513: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   516: aload_1
/*    */     //   517: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   520: ifeq -> 537
/*    */     //   523: aload_1
/*    */     //   524: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   527: astore #4
/*    */     //   529: aload #4
/*    */     //   531: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   534: goto -> 540
/*    */     //   537: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   540: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   543: ifeq -> 725
/*    */     //   546: aload_1
/*    */     //   547: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   550: aconst_null
/*    */     //   551: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   554: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   557: dup
/*    */     //   558: invokespecial <init> : ()V
/*    */     //   561: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   564: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   567: getfield STR : D
/*    */     //   570: aload_1
/*    */     //   571: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   574: ifeq -> 608
/*    */     //   577: aload_1
/*    */     //   578: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   581: astore #6
/*    */     //   583: aload #6
/*    */     //   585: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   588: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   591: ifeq -> 608
/*    */     //   594: aload #6
/*    */     //   596: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   599: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
/*    */     //   602: invokevirtual m_19564_ : ()I
/*    */     //   605: goto -> 609
/*    */     //   608: iconst_0
/*    */     //   609: iconst_1
/*    */     //   610: iadd
/*    */     //   611: i2d
/*    */     //   612: dmul
/*    */     //   613: aload_1
/*    */     //   614: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   617: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   620: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   623: invokevirtual m_22135_ : ()D
/*    */     //   626: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   629: aload_1
/*    */     //   630: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   633: ifeq -> 650
/*    */     //   636: aload_1
/*    */     //   637: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   640: astore #7
/*    */     //   642: aload #7
/*    */     //   644: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   647: goto -> 653
/*    */     //   650: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   653: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   656: i2d
/*    */     //   657: ldc2_w 0.5
/*    */     //   660: dmul
/*    */     //   661: dadd
/*    */     //   662: ldc2_w 0.5
/*    */     //   665: dadd
/*    */     //   666: aload_1
/*    */     //   667: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   670: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   673: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   676: invokevirtual m_22115_ : ()D
/*    */     //   679: dsub
/*    */     //   680: ldc2_w 1.5
/*    */     //   683: dmul
/*    */     //   684: dcmpg
/*    */     //   685: ifge -> 1073
/*    */     //   688: aload_1
/*    */     //   689: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   692: ifeq -> 722
/*    */     //   695: aload_1
/*    */     //   696: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   699: astore #8
/*    */     //   701: aload #8
/*    */     //   703: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   706: dup
/*    */     //   707: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   710: bipush #20
/*    */     //   712: iconst_1
/*    */     //   713: iconst_0
/*    */     //   714: iconst_1
/*    */     //   715: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   718: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   721: pop
/*    */     //   722: goto -> 1073
/*    */     //   725: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   728: aload_1
/*    */     //   729: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   732: ifeq -> 749
/*    */     //   735: aload_1
/*    */     //   736: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   739: astore #5
/*    */     //   741: aload #5
/*    */     //   743: invokevirtual m_21206_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   746: goto -> 752
/*    */     //   749: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   752: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   755: ifeq -> 937
/*    */     //   758: aload_1
/*    */     //   759: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   762: aconst_null
/*    */     //   763: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   766: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   769: dup
/*    */     //   770: invokespecial <init> : ()V
/*    */     //   773: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   776: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   779: getfield STR : D
/*    */     //   782: aload_1
/*    */     //   783: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   786: ifeq -> 820
/*    */     //   789: aload_1
/*    */     //   790: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   793: astore #6
/*    */     //   795: aload #6
/*    */     //   797: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   800: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   803: ifeq -> 820
/*    */     //   806: aload #6
/*    */     //   808: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   811: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
/*    */     //   814: invokevirtual m_19564_ : ()I
/*    */     //   817: goto -> 821
/*    */     //   820: iconst_0
/*    */     //   821: iconst_1
/*    */     //   822: iadd
/*    */     //   823: i2d
/*    */     //   824: dmul
/*    */     //   825: aload_1
/*    */     //   826: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   829: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   832: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   835: invokevirtual m_22135_ : ()D
/*    */     //   838: getstatic net/minecraft/world/item/enchantment/Enchantments.f_44977_ : Lnet/minecraft/world/item/enchantment/Enchantment;
/*    */     //   841: aload_1
/*    */     //   842: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   845: ifeq -> 862
/*    */     //   848: aload_1
/*    */     //   849: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   852: astore #7
/*    */     //   854: aload #7
/*    */     //   856: invokevirtual m_21206_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   859: goto -> 865
/*    */     //   862: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   865: invokestatic m_44843_ : (Lnet/minecraft/world/item/enchantment/Enchantment;Lnet/minecraft/world/item/ItemStack;)I
/*    */     //   868: i2d
/*    */     //   869: ldc2_w 0.5
/*    */     //   872: dmul
/*    */     //   873: dadd
/*    */     //   874: ldc2_w 0.5
/*    */     //   877: dadd
/*    */     //   878: aload_1
/*    */     //   879: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   882: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   885: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   888: invokevirtual m_22115_ : ()D
/*    */     //   891: dsub
/*    */     //   892: ldc2_w 1.5
/*    */     //   895: dmul
/*    */     //   896: dcmpg
/*    */     //   897: ifge -> 1073
/*    */     //   900: aload_1
/*    */     //   901: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   904: ifeq -> 934
/*    */     //   907: aload_1
/*    */     //   908: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   911: astore #8
/*    */     //   913: aload #8
/*    */     //   915: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   918: dup
/*    */     //   919: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   922: bipush #20
/*    */     //   924: iconst_1
/*    */     //   925: iconst_0
/*    */     //   926: iconst_1
/*    */     //   927: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   930: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   933: pop
/*    */     //   934: goto -> 1073
/*    */     //   937: aload_1
/*    */     //   938: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
/*    */     //   941: aconst_null
/*    */     //   942: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
/*    */     //   945: new net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   948: dup
/*    */     //   949: invokespecial <init> : ()V
/*    */     //   952: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   955: checkcast net/mcreator/ksmpstats/network/KsmpStatsModVariables$PlayerVariables
/*    */     //   958: getfield STR : D
/*    */     //   961: aload_1
/*    */     //   962: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   965: ifeq -> 999
/*    */     //   968: aload_1
/*    */     //   969: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   972: astore #6
/*    */     //   974: aload #6
/*    */     //   976: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   979: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
/*    */     //   982: ifeq -> 999
/*    */     //   985: aload #6
/*    */     //   987: getstatic net/minecraft/world/effect/MobEffects.f_19600_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   990: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
/*    */     //   993: invokevirtual m_19564_ : ()I
/*    */     //   996: goto -> 1000
/*    */     //   999: iconst_0
/*    */     //   1000: iconst_1
/*    */     //   1001: iadd
/*    */     //   1002: i2d
/*    */     //   1003: dmul
/*    */     //   1004: aload_1
/*    */     //   1005: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1008: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   1011: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   1014: invokevirtual m_22135_ : ()D
/*    */     //   1017: aload_1
/*    */     //   1018: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1021: getstatic net/minecraft/world/entity/ai/attributes/Attributes.f_22281_ : Lnet/minecraft/world/entity/ai/attributes/Attribute;
/*    */     //   1024: invokevirtual m_21051_ : (Lnet/minecraft/world/entity/ai/attributes/Attribute;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
/*    */     //   1027: invokevirtual m_22115_ : ()D
/*    */     //   1030: dsub
/*    */     //   1031: ldc2_w 1.5
/*    */     //   1034: dmul
/*    */     //   1035: dcmpg
/*    */     //   1036: ifge -> 1073
/*    */     //   1039: aload_1
/*    */     //   1040: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1043: ifeq -> 1073
/*    */     //   1046: aload_1
/*    */     //   1047: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1050: astore #7
/*    */     //   1052: aload #7
/*    */     //   1054: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   1057: dup
/*    */     //   1058: getstatic net/minecraft/world/effect/MobEffects.f_19613_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   1061: bipush #20
/*    */     //   1063: iconst_1
/*    */     //   1064: iconst_0
/*    */     //   1065: iconst_1
/*    */     //   1066: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   1069: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   1072: pop
/*    */     //   1073: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #35	-> 4
/*    */     //   #36	-> 5
/*    */     //   #37	-> 27
/*    */     //   #38	-> 49
/*    */     //   #39	-> 62
/*    */     //   #40	-> 67
/*    */     //   #41	-> 70
/*    */     //   #40	-> 94
/*    */     //   #42	-> 100
/*    */     //   #43	-> 115
/*    */     //   #44	-> 135
/*    */     //   #46	-> 144
/*    */     //   #45	-> 168
/*    */     //   #48	-> 188
/*    */     //   #49	-> 191
/*    */     //   #51	-> 203
/*    */     //   #52	-> 216
/*    */     //   #54	-> 240
/*    */     //   #55	-> 243
/*    */     //   #54	-> 267
/*    */     //   #56	-> 273
/*    */     //   #57	-> 288
/*    */     //   #58	-> 308
/*    */     //   #60	-> 317
/*    */     //   #59	-> 341
/*    */     //   #62	-> 361
/*    */     //   #63	-> 364
/*    */     //   #65	-> 376
/*    */     //   #66	-> 389
/*    */     //   #69	-> 413
/*    */     //   #70	-> 428
/*    */     //   #71	-> 448
/*    */     //   #72	-> 461
/*    */     //   #73	-> 464
/*    */     //   #75	-> 476
/*    */     //   #76	-> 489
/*    */     //   #80	-> 513
/*    */     //   #81	-> 516
/*    */     //   #80	-> 540
/*    */     //   #82	-> 546
/*    */     //   #83	-> 561
/*    */     //   #84	-> 570
/*    */     //   #85	-> 594
/*    */     //   #86	-> 608
/*    */     //   #87	-> 620
/*    */     //   #88	-> 623
/*    */     //   #90	-> 629
/*    */     //   #89	-> 653
/*    */     //   #92	-> 673
/*    */     //   #93	-> 676
/*    */     //   #95	-> 688
/*    */     //   #96	-> 701
/*    */     //   #98	-> 725
/*    */     //   #99	-> 728
/*    */     //   #98	-> 752
/*    */     //   #100	-> 758
/*    */     //   #101	-> 773
/*    */     //   #102	-> 782
/*    */     //   #103	-> 806
/*    */     //   #104	-> 820
/*    */     //   #105	-> 832
/*    */     //   #106	-> 835
/*    */     //   #108	-> 841
/*    */     //   #107	-> 865
/*    */     //   #110	-> 885
/*    */     //   #111	-> 888
/*    */     //   #113	-> 900
/*    */     //   #114	-> 913
/*    */     //   #117	-> 937
/*    */     //   #118	-> 952
/*    */     //   #119	-> 961
/*    */     //   #120	-> 985
/*    */     //   #121	-> 999
/*    */     //   #122	-> 1011
/*    */     //   #123	-> 1014
/*    */     //   #124	-> 1024
/*    */     //   #125	-> 1027
/*    */     //   #127	-> 1039
/*    */     //   #128	-> 1052
/*    */     //   #132	-> 1073
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   39	23	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   83	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   157	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   216	21	7	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   256	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   330	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   389	21	7	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   489	21	6	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   17	496	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   529	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   583	25	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   642	8	7	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   701	21	8	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   741	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   795	25	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   854	8	7	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   913	21	8	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   974	25	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1052	21	7	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	1074	0	event	Lnet/minecraftforge/eventbus/api/Event;
/*    */     //   0	1074	1	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\WeaponConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */