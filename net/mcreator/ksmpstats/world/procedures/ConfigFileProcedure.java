/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.fml.loading.FMLPaths;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ConfigFileProcedure {
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 22 */     execute();
/*    */   }
/*    */   
/*    */   public static void execute() {
/* 26 */     execute(null);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event) {
/* 30 */     File KSMPconfig = new File("");
/* 31 */     JsonObject KSMPstuff = new JsonObject();
/* 32 */     KSMPconfig = new File(FMLPaths.GAMEDIR.get().toString() + "/config/", File.separator + "ksmp-config.json");
/* 33 */     if (!KSMPconfig.exists()) {
/*    */       try {
/* 35 */         KSMPconfig.getParentFile().mkdirs();
/* 36 */         KSMPconfig.createNewFile();
/* 37 */       } catch (IOException exception) {
/* 38 */         exception.printStackTrace();
/*    */       } 
/* 40 */       KSMPstuff.addProperty("Max Level", Integer.valueOf(120));
/* 41 */       KSMPstuff.addProperty("Max Atribute", Integer.valueOf(60));
/* 42 */       KSMPstuff.addProperty("Max XP", Integer.valueOf(200000));
/* 43 */       KSMPstuff.addProperty("Hidden Power Multiplier", Double.valueOf(1.5D));
/*    */       
/* 45 */       Gson mainGSONBuilderVariable = (new GsonBuilder()).setPrettyPrinting().create();
/*    */       try {
/* 47 */         FileWriter fileWriter = new FileWriter(KSMPconfig);
/* 48 */         fileWriter.write(mainGSONBuilderVariable.toJson((JsonElement)KSMPstuff));
/* 49 */         fileWriter.close();
/* 50 */       } catch (IOException exception) {
/* 51 */         exception.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ConfigFileProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */