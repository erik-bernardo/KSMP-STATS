package net.mcreator.ksmpstats.procedures;

import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
import net.minecraft.world.entity.Entity;

public class LordeEffectProcedure {
  public static void execute(Entity entity) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 5
    //   4: return
    //   5: ldc2_w 0.5
    //   8: aload_0
    //   9: instanceof net/minecraft/world/entity/LivingEntity
    //   12: ifeq -> 55
    //   15: aload_0
    //   16: checkcast net/minecraft/world/entity/LivingEntity
    //   19: astore_3
    //   20: aload_3
    //   21: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   24: invokevirtual get : ()Ljava/lang/Object;
    //   27: checkcast net/minecraft/world/effect/MobEffect
    //   30: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   33: ifeq -> 55
    //   36: aload_3
    //   37: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   40: invokevirtual get : ()Ljava/lang/Object;
    //   43: checkcast net/minecraft/world/effect/MobEffect
    //   46: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   49: invokevirtual m_19564_ : ()I
    //   52: goto -> 56
    //   55: iconst_0
    //   56: iconst_4
    //   57: idiv
    //   58: i2d
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
    //   79: iconst_1
    //   80: aload_0
    //   81: instanceof net/minecraft/world/entity/LivingEntity
    //   84: ifeq -> 127
    //   87: aload_0
    //   88: checkcast net/minecraft/world/entity/LivingEntity
    //   91: astore_3
    //   92: aload_3
    //   93: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   96: invokevirtual get : ()Ljava/lang/Object;
    //   99: checkcast net/minecraft/world/effect/MobEffect
    //   102: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   105: ifeq -> 127
    //   108: aload_3
    //   109: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   112: invokevirtual get : ()Ljava/lang/Object;
    //   115: checkcast net/minecraft/world/effect/MobEffect
    //   118: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   121: invokevirtual m_19564_ : ()I
    //   124: goto -> 128
    //   127: iconst_0
    //   128: iadd
    //   129: i2d
    //   130: dstore_1
    //   131: aload_0
    //   132: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   135: aconst_null
    //   136: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   139: dload_1
    //   140: aload_0
    //   141: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   146: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   149: iconst_1
    //   150: aload_0
    //   151: instanceof net/minecraft/world/entity/LivingEntity
    //   154: ifeq -> 197
    //   157: aload_0
    //   158: checkcast net/minecraft/world/entity/LivingEntity
    //   161: astore_3
    //   162: aload_3
    //   163: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   166: invokevirtual get : ()Ljava/lang/Object;
    //   169: checkcast net/minecraft/world/effect/MobEffect
    //   172: invokevirtual m_21023_ : (Lnet/minecraft/world/effect/MobEffect;)Z
    //   175: ifeq -> 197
    //   178: aload_3
    //   179: getstatic net/mcreator/ksmpstats/init/KsmpStatsModMobEffects.A_CEIFADORA : Lnet/minecraftforge/registries/RegistryObject;
    //   182: invokevirtual get : ()Ljava/lang/Object;
    //   185: checkcast net/minecraft/world/effect/MobEffect
    //   188: invokevirtual m_21124_ : (Lnet/minecraft/world/effect/MobEffect;)Lnet/minecraft/world/effect/MobEffectInstance;
    //   191: invokevirtual m_19564_ : ()I
    //   194: goto -> 198
    //   197: iconst_0
    //   198: iadd
    //   199: i2d
    //   200: dstore_1
    //   201: aload_0
    //   202: getstatic net/mcreator/ksmpstats/network/KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY : Lnet/minecraftforge/common/capabilities/Capability;
    //   205: aconst_null
    //   206: invokevirtual getCapability : (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/core/Direction;)Lnet/minecraftforge/common/util/LazyOptional;
    //   209: dload_1
    //   210: aload_0
    //   211: <illegal opcode> accept : (DLnet/minecraft/world/entity/Entity;)Lnet/minecraftforge/common/util/NonNullConsumer;
    //   216: invokevirtual ifPresent : (Lnet/minecraftforge/common/util/NonNullConsumer;)V
    //   219: aload_0
    //   220: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   223: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 0
    //   #12	-> 4
    //   #14	-> 5
    //   #15	-> 36
    //   #16	-> 55
    //   #17	-> 61
    //   #23	-> 79
    //   #24	-> 108
    //   #25	-> 127
    //   #26	-> 131
    //   #32	-> 149
    //   #33	-> 178
    //   #34	-> 197
    //   #35	-> 201
    //   #40	-> 219
    //   #41	-> 223
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   20	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   61	18	1	_setval	D
    //   92	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   131	18	1	_setval	D
    //   162	35	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   201	18	1	_setval	D
    //   0	224	0	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\LordeEffectProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */