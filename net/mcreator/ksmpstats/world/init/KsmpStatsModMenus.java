/*    */ package net.mcreator.ksmpstats.init;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.mcreator.ksmpstats.world.inventory.SelectYouMenu;
/*    */ import net.mcreator.ksmpstats.world.inventory.StatsMenuMenu;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.network.IContainerFactory;
/*    */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class KsmpStatsModMenus
/*    */ {
/*    */   public static final MenuType<StatsMenuMenu> STATS_MENU;
/*    */   public static final MenuType<SelectYouMenu> SELECT_YOU;
/* 23 */   private static final List<MenuType<?>> REGISTRY = new ArrayList<>(); static {
/* 24 */     STATS_MENU = register("stats_menu", (id, inv, extraData) -> new StatsMenuMenu(id, inv, extraData));
/* 25 */     SELECT_YOU = register("select_you", (id, inv, extraData) -> new SelectYouMenu(id, inv, extraData));
/*    */   }
/*    */   private static <T extends net.minecraft.world.inventory.AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
/* 28 */     MenuType<T> menuType = new MenuType((MenuType.MenuSupplier)containerFactory);
/* 29 */     menuType.setRegistryName(registryname);
/* 30 */     REGISTRY.add(menuType);
/* 31 */     return menuType;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
/* 36 */     event.getRegistry().registerAll((IForgeRegistryEntry[])REGISTRY.<MenuType>toArray(new MenuType[0]));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\init\KsmpStatsModMenus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */