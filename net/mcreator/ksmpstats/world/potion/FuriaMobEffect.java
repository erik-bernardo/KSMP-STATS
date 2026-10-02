/*    */ package net.mcreator.ksmpstats.potion;
/*    */ 
/*    */ import net.mcreator.ksmpstats.procedures.EffectOffProcedure;
/*    */ import net.mcreator.ksmpstats.procedures.EnragedEffectProcedure;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectCategory;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeMap;
/*    */ 
/*    */ public class FuriaMobEffect
/*    */   extends MobEffect {
/*    */   public FuriaMobEffect() {
/* 14 */     super(MobEffectCategory.HARMFUL, -65536);
/*    */   }
/*    */ 
/*    */   
/*    */   public String m_19481_() {
/* 19 */     return "effect.ksmp_stats.furia";
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6385_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 24 */     EnragedEffectProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6386_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 29 */     super.m_6386_(entity, attributeMap, amplifier);
/* 30 */     EffectOffProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6584_(int duration, int amplifier) {
/* 35 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\potion\FuriaMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */