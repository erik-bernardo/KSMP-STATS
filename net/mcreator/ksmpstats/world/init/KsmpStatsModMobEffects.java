/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import net.mcreator.ksmpstats.potion.ACeifadoraMobEffect;
/*    */ import net.mcreator.ksmpstats.potion.FuriaMobEffect;
/*    */ import net.mcreator.ksmpstats.potion.OLordeMobEffect;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KsmpStatsModMobEffects
/*    */ {
/* 19 */   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "ksmp_stats");
/* 20 */   public static final RegistryObject<MobEffect> A_CEIFADORA = REGISTRY.register("a_ceifadora", () -> new ACeifadoraMobEffect());
/* 21 */   public static final RegistryObject<MobEffect> O_LORDE = REGISTRY.register("o_lorde", () -> new OLordeMobEffect());
/* 22 */   public static final RegistryObject<MobEffect> FURIA = REGISTRY.register("furia", () -> new FuriaMobEffect());
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModMobEffects.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */