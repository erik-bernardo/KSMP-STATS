package net.mcreator.ksmpstats.procedures;

import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
import net.minecraft.world.entity.Entity;

public class EnragedEffectProcedure {
  public static void execute(Entity entity) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_0
    //   6: instanceof net/minecraft/world/entity/LivingEntity
    //   9: ifeq -> 52
    //   12: aload_0
    //   13: checkcast net/minecraft/world/entity/LivingEntity
    //   16: astore_3
    //   17: aload_3
    //   18: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   21: invokevirtual get : ()Ljava/lang/Object;
    //   24: checkcast net/minecraft/world/effect/MobEffect
    //   27: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   30: ifeq -> 52
    //   33: aload_3
    //   34: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   37: invokevirtual get : ()Ljava/lang/Object;
    //   40: checkcast net/minecraft/world/effect/MobEffect
    //   43: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   46: invokevirtual m_19564_ : ()I
    //   49: goto -> 53
    //   52: iconst_0
    //   53: iconst_2
    //   54: idiv
    //   55: i2d
    //   56: ldc2_w 0.5
    //   59: dadd
    //   60: dstore_1
    //   61: aload_0
    //   62: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   65: aconst_null
    //   66: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   69: dload_1
    //   70: aload_0
    //   71: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   76: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   79: aload_0
    //   80: instanceof net/minecraft/world/entity/LivingEntity
    //   83: ifeq -> 126
    //   86: aload_0
    //   87: checkcast net/minecraft/world/entity/LivingEntity
    //   90: astore_3
    //   91: aload_3
    //   92: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   95: invokevirtual get : ()Ljava/lang/Object;
    //   98: checkcast net/minecraft/world/effect/MobEffect
    //   101: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   104: ifeq -> 126
    //   107: aload_3
    //   108: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   111: invokevirtual get : ()Ljava/lang/Object;
    //   114: checkcast net/minecraft/world/effect/MobEffect
    //   117: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   120: invokevirtual m_19564_ : ()I
    //   123: goto -> 127
    //   126: iconst_0
    //   127: iconst_2
    //   128: idiv
    //   129: i2d
    //   130: ldc2_w 0.5
    //   133: dadd
    //   134: dstore_1
    //   135: aload_0
    //   136: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   139: aconst_null
    //   140: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   143: dload_1
    //   144: aload_0
    //   145: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   150: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   153: aload_0
    //   154: instanceof net/minecraft/world/entity/LivingEntity
    //   157: ifeq -> 200
    //   160: aload_0
    //   161: checkcast net/minecraft/world/entity/LivingEntity
    //   164: astore_3
    //   165: aload_3
    //   166: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   169: invokevirtual get : ()Ljava/lang/Object;
    //   172: checkcast net/minecraft/world/effect/MobEffect
    //   175: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   178: ifeq -> 200
    //   181: aload_3
    //   182: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   185: invokevirtual get : ()Ljava/lang/Object;
    //   188: checkcast net/minecraft/world/effect/MobEffect
    //   191: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   194: invokevirtual m_19564_ : ()I
    //   197: goto -> 201
    //   200: iconst_0
    //   201: iconst_2
    //   202: idiv
    //   203: i2d
    //   204: ldc2_w 0.5
    //   207: dadd
    //   208: dstore_1
    //   209: aload_0
    //   210: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   213: aconst_null
    //   214: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   217: dload_1
    //   218: aload_0
    //   219: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   224: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   227: aload_0
    //   228: instanceof net/minecraft/world/entity/LivingEntity
    //   231: ifeq -> 274
    //   234: aload_0
    //   235: checkcast net/minecraft/world/entity/LivingEntity
    //   238: astore_3
    //   239: aload_3
    //   240: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   243: invokevirtual get : ()Ljava/lang/Object;
    //   246: checkcast net/minecraft/world/effect/MobEffect
    //   249: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   252: ifeq -> 274
    //   255: aload_3
    //   256: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   259: invokevirtual get : ()Ljava/lang/Object;
    //   262: checkcast net/minecraft/world/effect/MobEffect
    //   265: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   268: invokevirtual m_19564_ : ()I
    //   271: goto -> 275
    //   274: iconst_0
    //   275: iconst_2
    //   276: idiv
    //   277: i2d
    //   278: ldc2_w 0.5
    //   281: dadd
    //   282: dstore_1
    //   283: aload_0
    //   284: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   287: aconst_null
    //   288: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   291: dload_1
    //   292: aload_0
    //   293: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   298: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   301: aload_0
    //   302: instanceof net/minecraft/world/entity/LivingEntity
    //   305: ifeq -> 348
    //   308: aload_0
    //   309: checkcast net/minecraft/world/entity/LivingEntity
    //   312: astore_3
    //   313: aload_3
    //   314: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   317: invokevirtual get : ()Ljava/lang/Object;
    //   320: checkcast net/minecraft/world/effect/MobEffect
    //   323: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   326: ifeq -> 348
    //   329: aload_3
    //   330: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   333: invokevirtual get : ()Ljava/lang/Object;
    //   336: checkcast net/minecraft/world/effect/MobEffect
    //   339: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   342: invokevirtual m_19564_ : ()I
    //   345: goto -> 349
    //   348: iconst_0
    //   349: iconst_2
    //   350: idiv
    //   351: i2d
    //   352: ldc2_w 0.5
    //   355: dadd
    //   356: dstore_1
    //   357: aload_0
    //   358: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   361: aconst_null
    //   362: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   365: dload_1
    //   366: aload_0
    //   367: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   372: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   375: aload_0
    //   376: instanceof net/minecraft/world/entity/LivingEntity
    //   379: ifeq -> 422
    //   382: aload_0
    //   383: checkcast net/minecraft/world/entity/LivingEntity
    //   386: astore_3
    //   387: aload_3
    //   388: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   391: invokevirtual get : ()Ljava/lang/Object;
    //   394: checkcast net/minecraft/world/effect/MobEffect
    //   397: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   400: ifeq -> 422
    //   403: aload_3
    //   404: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   407: invokevirtual get : ()Ljava/lang/Object;
    //   410: checkcast net/minecraft/world/effect/MobEffect
    //   413: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   416: invokevirtual m_19564_ : ()I
    //   419: goto -> 423
    //   422: iconst_0
    //   423: iconst_2
    //   424: idiv
    //   425: i2d
    //   426: ldc2_w 0.5
    //   429: dadd
    //   430: dstore_1
    //   431: aload_0
    //   432: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   435: aconst_null
    //   436: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   439: dload_1
    //   440: aload_0
    //   441: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   446: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   449: aload_0
    //   450: instanceof net/minecraft/world/entity/LivingEntity
    //   453: ifeq -> 496
    //   456: aload_0
    //   457: checkcast net/minecraft/world/entity/LivingEntity
    //   460: astore_3
    //   461: aload_3
    //   462: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   465: invokevirtual get : ()Ljava/lang/Object;
    //   468: checkcast net/minecraft/world/effect/MobEffect
    //   471: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   474: ifeq -> 496
    //   477: aload_3
    //   478: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.FURIA : Lnet/minecraftforge/registries/RegistryObject;
    //   481: invokevirtual get : ()Ljava/lang/Object;
    //   484: checkcast net/minecraft/world/effect/MobEffect
    //   487: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   490: invokevirtual m_19564_ : ()I
    //   493: goto -> 497
    //   496: iconst_0
    //   497: iconst_2
    //   498: idiv
    //   499: i2d
    //   500: ldc2_w 0.5
    //   503: dadd
    //   504: dstore_1
    //   505: aload_0
    //   506: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   509: aconst_null
    //   510: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   513: dload_1
    //   514: aload_0
    //   515: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   520: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   523: aload_0
    //   524: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   527: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 0
    //   #12	-> 4
    //   #14	-> 5
    //   #15	-> 33
    //   #16	-> 52
    //   #17	-> 61
    //   #23	-> 79
    //   #24	-> 107
    //   #25	-> 126
    //   #26	-> 135
    //   #32	-> 153
    //   #33	-> 181
    //   #34	-> 200
    //   #35	-> 209
    //   #41	-> 227
    //   #42	-> 255
    //   #43	-> 274
    //   #44	-> 283
    //   #50	-> 301
    //   #51	-> 329
    //   #52	-> 348
    //   #53	-> 357
    //   #59	-> 375
    //   #60	-> 403
    //   #61	-> 422
    //   #62	-> 431
    //   #68	-> 449
    //   #69	-> 477
    //   #70	-> 496
    //   #71	-> 505
    //   #76	-> 523
    //   #77	-> 527
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   17	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   61	18	1	_setval	D
    //   91	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   135	18	1	_setval	D
    //   165	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   209	18	1	_setval	D
    //   239	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   283	18	1	_setval	D
    //   313	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   357	18	1	_setval	D
    //   387	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   431	18	1	_setval	D
    //   461	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   505	18	1	_setval	D
    //   0	528	0	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\EnragedEffectProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */