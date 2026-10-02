/*     */ package net.mcreator.ksmpstats.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.mcreator.ksmpstats.network.SelectYouButtonMessage;
/*     */ import net.mcreator.ksmpstats.world.inventory.SelectYouMenu;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.components.Button;
/*     */ import net.minecraft.client.gui.components.events.GuiEventListener;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class SelectYouScreen
/*     */   extends AbstractContainerScreen<SelectYouMenu>
/*     */ {
/*  24 */   private static final HashMap<String, Object> guistate = SelectYouMenu.guistate;
/*     */   
/*     */   private final Level world;
/*     */   private final int x;
/*     */   
/*     */   public SelectYouScreen(SelectYouMenu container, Inventory inventory, Component text) {
/*  30 */     super((AbstractContainerMenu)container, inventory, text);
/*  31 */     this.world = container.world;
/*  32 */     this.x = container.x;
/*  33 */     this.y = container.y;
/*  34 */     this.z = container.z;
/*  35 */     this.entity = container.entity;
/*  36 */     this.f_97726_ = 376;
/*  37 */     this.f_97727_ = 213;
/*     */   }
/*     */   private final int y; private final int z; private final Player entity;
/*     */   
/*     */   public void m_6305_(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
/*  42 */     m_7333_(ms);
/*  43 */     super.m_6305_(ms, mouseX, mouseY, partialTicks);
/*  44 */     m_7025_(ms, mouseX, mouseY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7286_(PoseStack ms, float partialTicks, int gx, int gy) {
/*  49 */     RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
/*  50 */     RenderSystem.m_69478_();
/*  51 */     RenderSystem.m_69453_();
/*     */     
/*  53 */     RenderSystem.m_157456_(0, new ResourceLocation("ksmp_stats:textures/screens/trueback.png"));
/*  54 */     this; m_93133_(ms, this.f_97735_ + 0, this.f_97736_ + 0, 0.0F, 0.0F, 376, 213, 376, 213);
/*     */     
/*  56 */     RenderSystem.m_157456_(0, new ResourceLocation("ksmp_stats:textures/screens/trueborder.png"));
/*  57 */     this; m_93133_(ms, this.f_97735_ + 0, this.f_97736_ + 0, 0.0F, 0.0F, 376, 213, 376, 213);
/*     */     
/*  59 */     RenderSystem.m_69461_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  64 */     if (key == 256) {
/*  65 */       this.f_96541_.f_91074_.m_6915_();
/*  66 */       return true;
/*     */     } 
/*  68 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_181908_() {
/*  73 */     super.m_181908_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7027_(PoseStack poseStack, int mouseX, int mouseY) {
/*  78 */     this.f_96547_.m_92883_(poseStack, "Selecione seu Poder Oculto", 120.0F, 14.0F, -1);
/*  79 */     this.f_96547_.m_92883_(poseStack, "REGRA", 174.0F, 171.0F, -1);
/*  80 */     this.f_96547_.m_92883_(poseStack, "Você só pode usar o Poder Oculto fora de live", 73.0F, 182.0F, -1);
/*  81 */     this.f_96547_.m_92883_(poseStack, "ou se previamente combinado para Lore", 90.0F, 192.0F, -1);
/*  82 */     this.f_96547_.m_92883_(poseStack, "(Não é possível mudar depois)", 113.0F, 25.0F, -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7379_() {
/*  87 */     super.m_7379_();
/*  88 */     (Minecraft.m_91087_()).f_91068_.m_90926_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/*  93 */     super.m_7856_();
/*  94 */     this.f_96541_.f_91068_.m_90926_(true);
/*  95 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 126, this.f_97736_ + 45, 119, 20, (Component)new TextComponent("Poderoso Guerreiro"), e -> {
/*     */             KsmpStatsMod.PACKET_HANDLER.sendToServer(new SelectYouButtonMessage(0, this.x, this.y, this.z));
/*     */             
/*     */             SelectYouButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z);
/*     */           }));
/*     */     
/* 101 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 148, this.f_97736_ + 70, 77, 20, (Component)new TextComponent("Super Mago"), e -> {
/*     */             KsmpStatsMod.PACKET_HANDLER.sendToServer(new SelectYouButtonMessage(1, this.x, this.y, this.z));
/*     */             
/*     */             SelectYouButtonMessage.handleButtonAction(this.entity, 1, this.x, this.y, this.z);
/*     */           }));
/*     */     
/* 107 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 124, this.f_97736_ + 95, 124, 20, (Component)new TextComponent("Assassino Sangrento"), e -> {
/*     */             KsmpStatsMod.PACKET_HANDLER.sendToServer(new SelectYouButtonMessage(2, this.x, this.y, this.z));
/*     */             
/*     */             SelectYouButtonMessage.handleButtonAction(this.entity, 2, this.x, this.y, this.z);
/*     */           }));
/*     */     
/* 113 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 124, this.f_97736_ + 122, 124, 20, (Component)new TextComponent("Escudo Impenetrável"), e -> {
/*     */             KsmpStatsMod.PACKET_HANDLER.sendToServer(new SelectYouButtonMessage(3, this.x, this.y, this.z));
/*     */             
/*     */             SelectYouButtonMessage.handleButtonAction(this.entity, 3, this.x, this.y, this.z);
/*     */           }));
/*     */     
/* 119 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 133, this.f_97736_ + 147, 108, 20, (Component)new TextComponent("Árduo Feiticeiro"), e -> {
/*     */             KsmpStatsMod.PACKET_HANDLER.sendToServer(new SelectYouButtonMessage(4, this.x, this.y, this.z));
/*     */             SelectYouButtonMessage.handleButtonAction(this.entity, 4, this.x, this.y, this.z);
/*     */           }));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\client\gui\SelectYouScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */