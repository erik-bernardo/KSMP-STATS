/*    */ package net.mcreator.ksmpstats.procedures;
/*    */ 
/*    */ import io.netty.buffer.Unpooled;
/*    */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*    */ import net.mcreator.ksmpstats.world.inventory.StatsMenuMenu;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.network.NetworkHooks;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AssassinProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 27 */     boolean _setval = true;
/* 28 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.IsAssass = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/*    */     
/* 34 */     _setval = true;
/* 35 */     entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*    */           capability.HasPower = _setval;
/*    */           
/*    */           capability.syncPlayerVariables(entity);
/*    */         });
/* 40 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 41 */       _player.m_6915_(); }
/*    */     
/* 43 */     if (entity instanceof ServerPlayer) { ServerPlayer _ent = (ServerPlayer)entity;
/* 44 */       final BlockPos _bpos = new BlockPos(x, y, z);
/* 45 */       NetworkHooks.openGui(_ent, new MenuProvider()
/*    */           {
/*    */             public Component m_5446_() {
/* 48 */               return (Component)new TextComponent("StatsMenu");
/*    */             }
/*    */ 
/*    */             
/*    */             public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 53 */               return (AbstractContainerMenu)new StatsMenuMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(_bpos));
/*    */             }
/*    */           }_bpos); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\AssassinProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */