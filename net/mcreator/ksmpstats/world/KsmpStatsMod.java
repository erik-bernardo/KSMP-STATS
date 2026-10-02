/*    */ package net.mcreator.ksmpstats;
/*    */ 
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.ksmpstats.init.KsmpStatsModMobEffects;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("ksmp_stats")
/*    */ public class KsmpStatsMod
/*    */ {
/* 37 */   public static final Logger LOGGER = LogManager.getLogger(KsmpStatsMod.class);
/*    */   public static final String MODID = "ksmp_stats";
/*    */   private static final String PROTOCOL_VERSION = "1";
/* 40 */   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("ksmp_stats", "ksmp_stats"), () -> "1", "1"::equals, "1"::equals);
/*    */   
/* 42 */   private static int messageID = 0;
/*    */ 
/*    */   
/*    */   public KsmpStatsMod() {
/* 46 */     IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
/*    */     
/* 48 */     KsmpStatsModMobEffects.REGISTRY.register(bus);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 54 */     PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
/* 55 */     messageID++;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\KsmpStatsMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */