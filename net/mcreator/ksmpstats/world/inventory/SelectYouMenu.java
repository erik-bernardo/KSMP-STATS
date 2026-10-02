/*    */ package net.mcreator.ksmpstats.world.inventory;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.ksmpstats.init.KsmpStatsModMenus;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.inventory.Slot;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.items.IItemHandler;
/*    */ import net.minecraftforge.items.ItemStackHandler;
/*    */ 
/*    */ 
/*    */ public class SelectYouMenu
/*    */   extends AbstractContainerMenu
/*    */   implements Supplier<Map<Integer, Slot>>
/*    */ {
/* 22 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*    */   
/*    */   public final Level world;
/*    */   public final Player entity;
/*    */   public int x;
/* 27 */   private final Map<Integer, Slot> customSlots = new HashMap<>(); public int y; public int z; private IItemHandler internal;
/*    */   private boolean bound = false;
/*    */   
/*    */   public SelectYouMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/* 31 */     super(KsmpStatsModMenus.SELECT_YOU, id);
/* 32 */     this.entity = inv.f_35978_;
/* 33 */     this.world = inv.f_35978_.f_19853_;
/* 34 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/* 35 */     BlockPos pos = null;
/* 36 */     if (extraData != null) {
/* 37 */       pos = extraData.m_130135_();
/* 38 */       this.x = pos.m_123341_();
/* 39 */       this.y = pos.m_123342_();
/* 40 */       this.z = pos.m_123343_();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6875_(Player player) {
/* 46 */     return true;
/*    */   }
/*    */   
/*    */   public Map<Integer, Slot> get() {
/* 50 */     return this.customSlots;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\world\inventory\SelectYouMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
