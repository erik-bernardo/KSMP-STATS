/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.event.world.WorldEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.loading.FMLPaths;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class AplyConfigProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onWorldLoad(WorldEvent.Load event) {
/* 26 */     execute((Event)event, event.getWorld());
/*    */   }
/*    */   
/*    */   public static void execute(LevelAccessor world) {
/* 30 */     execute(null, world);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, LevelAccessor world) {
/* 34 */     File KSMPconfig = new File("");
/* 35 */     JsonObject KSMPstuff = new JsonObject();
/* 36 */     KSMPconfig = new File(FMLPaths.GAMEDIR.get().toString() + "/config/", File.separator + "ksmp-config.json");
/*    */     
/*    */     try {
/* 39 */       BufferedReader bufferedReader = new BufferedReader(new FileReader(KSMPconfig));
/* 40 */       StringBuilder jsonstringbuilder = new StringBuilder();
/*    */       String line;
/* 42 */       while ((line = bufferedReader.readLine()) != null) {
/* 43 */         jsonstringbuilder.append(line);
/*    */       }
/* 45 */       bufferedReader.close();
/* 46 */       KSMPstuff = (JsonObject)(new Gson()).fromJson(jsonstringbuilder.toString(), JsonObject.class);
/* 47 */       (KsmpStatsModVariables.WorldVariables.get(world)).maxXP = KSMPstuff.get("Max XP").getAsDouble();
/* 48 */       KsmpStatsModVariables.WorldVariables.get(world).syncData(world);
/* 49 */       (KsmpStatsModVariables.WorldVariables.get(world)).lvlcap = KSMPstuff.get("Max Level").getAsDouble();
/* 50 */       KsmpStatsModVariables.WorldVariables.get(world).syncData(world);
/* 51 */       (KsmpStatsModVariables.WorldVariables.get(world)).AtrCap = KSMPstuff.get("Max Atribute").getAsDouble();
/* 52 */       KsmpStatsModVariables.WorldVariables.get(world).syncData(world);
/* 53 */       (KsmpStatsModVariables.WorldVariables.get(world)).Multipliyer = KSMPstuff.get("Hidden Power Multiplier").getAsDouble();
/* 54 */       KsmpStatsModVariables.WorldVariables.get(world).syncData(world);
/* 55 */     } catch (IOException e) {
/* 56 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\AplyConfigProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */