/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class KsmpStatsModSounds
/*    */ {
/* 19 */   public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
/*    */   static {
/* 21 */     REGISTRY.put(new ResourceLocation("ksmp_stats", "powerup"), new SoundEvent(new ResourceLocation("ksmp_stats", "powerup")));
/* 22 */     REGISTRY.put(new ResourceLocation("ksmp_stats", "transform2"), new SoundEvent(new ResourceLocation("ksmp_stats", "transform2")));
/* 23 */     REGISTRY.put(new ResourceLocation("ksmp_stats", "powerdown"), new SoundEvent(new ResourceLocation("ksmp_stats", "powerdown")));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
/* 28 */     for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
/* 29 */       event.getRegistry().register(((SoundEvent)sound.getValue()).setRegistryName(sound.getKey())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */