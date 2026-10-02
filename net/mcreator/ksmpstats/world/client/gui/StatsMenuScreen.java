/*     */ package net.mcreator.ksmpstats.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import java.util.HashMap;
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.mcreator.ksmpstats.network.StatsMenuButtonMessage;
/*     */ import net.mcreator.ksmpstats.procedures.CanDEXProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanEndProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanExancheProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanINTProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanLuckProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanMindProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanSTRProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.CanVitProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultDexProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultEndProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultIntProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultLuckProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultMndProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowMultStrProcedure;
/*     */ import net.mcreator.ksmpstats.procedures.ShowVitMultProcedure;
/*     */ import net.mcreator.ksmpstats.world.inventory.StatsMenuMenu;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.components.Button;
/*     */ import net.minecraft.client.gui.components.events.GuiEventListener;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ 
/*     */ public class StatsMenuScreen extends AbstractContainerScreen<StatsMenuMenu> {
/*  40 */   private static final HashMap<String, Object> guistate = StatsMenuMenu.guistate;
/*     */   
/*     */   private final Level world;
/*     */   private final int x;
/*     */   
/*     */   public StatsMenuScreen(StatsMenuMenu container, Inventory inventory, Component text) {
/*  46 */     super((AbstractContainerMenu)container, inventory, text);
/*  47 */     this.world = container.world;
/*  48 */     this.x = container.x;
/*  49 */     this.y = container.y;
/*  50 */     this.z = container.z;
/*  51 */     this.entity = container.entity;
/*  52 */     this.f_97726_ = 376;
/*  53 */     this.f_97727_ = 213;
/*     */   }
/*     */   private final int y; private final int z; private final Player entity;
/*     */   
/*     */   public void m_6305_(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
/*  58 */     m_7333_(ms);
/*  59 */     super.m_6305_(ms, mouseX, mouseY, partialTicks);
/*  60 */     m_7025_(ms, mouseX, mouseY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7286_(PoseStack ms, float partialTicks, int gx, int gy) {
/*  65 */     RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
/*  66 */     RenderSystem.m_69478_();
/*  67 */     RenderSystem.m_69453_();
/*     */     
/*  69 */     RenderSystem.m_157456_(0, new ResourceLocation("ksmp_stats:textures/screens/trueback.png"));
/*  70 */     this; m_93133_(ms, this.f_97735_ + 0, this.f_97736_ + 0, 0.0F, 0.0F, 376, 213, 376, 213);
/*     */     
/*  72 */     RenderSystem.m_157456_(0, new ResourceLocation("ksmp_stats:textures/screens/trueborder.png"));
/*  73 */     this; m_93133_(ms, this.f_97735_ + 0, this.f_97736_ + 0, 0.0F, 0.0F, 376, 213, 376, 213);
/*     */     
/*  75 */     RenderSystem.m_157456_(0, new ResourceLocation("ksmp_stats:textures/screens/truuline.png"));
/*  76 */     this; m_93133_(ms, this.f_97735_ + 118, this.f_97736_ + 17, 0.0F, 0.0F, 376, 213, 376, 213);
/*     */     
/*  78 */     RenderSystem.m_69461_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7933_(int key, int b, int c) {
/*  83 */     if (key == 256) {
/*  84 */       this.f_96541_.f_91074_.m_6915_();
/*  85 */       return true;
/*     */     } 
/*  87 */     return super.m_7933_(key, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_181908_() {
/*  92 */     super.m_181908_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7027_(PoseStack poseStack, int mouseX, int mouseY) {
/*  97 */     this.f_96547_.m_92883_(poseStack, "xp: " + 
/*     */         
/*  99 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + "/" + 
/*     */         
/* 101 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).NEEDXP, 10.0F, 22.0F, -1);
/*     */ 
/*     */     
/* 104 */     this.f_96547_.m_92883_(poseStack, "Level: " + 
/* 105 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LVL, 10.0F, 12.0F, -1);
/* 106 */     this.f_96547_.m_92883_(poseStack, "VIT: " + 
/* 107 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA, 10.0F, 37.0F, -1);
/* 108 */     this.f_96547_.m_92883_(poseStack, "MND: " + 
/* 109 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANA, 10.0F, 62.0F, -1);
/* 110 */     this.f_96547_.m_92883_(poseStack, "END: " + 
/* 111 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END, 10.0F, 87.0F, -1);
/* 112 */     this.f_96547_.m_92883_(poseStack, "STR: " + 
/* 113 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STR, 10.0F, 112.0F, -1);
/* 114 */     this.f_96547_.m_92883_(poseStack, "DEX: " + 
/* 115 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX, 10.0F, 137.0F, -1);
/* 116 */     this.f_96547_.m_92883_(poseStack, "INT: " + 
/* 117 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTE, 10.0F, 162.0F, -1);
/* 118 */     this.f_96547_.m_92883_(poseStack, "LCK: " + 
/* 119 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK, 10.0F, 187.0F, -1);
/* 120 */     this.f_96547_.m_92883_(poseStack, "Vida Máxima: " + 
/* 121 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currantMaxHP, 130.0F, 12.0F, -34439);
/* 122 */     this.f_96547_.m_92883_(poseStack, "Mana máxima: " + 
/* 123 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentMaxMana, 130.0F, 22.0F, -9320705);
/* 124 */     this.f_96547_.m_92883_(poseStack, "Defesa: " + 
/* 125 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currantArmor + "%", 130.0F, 42.0F, -1);
/* 126 */     this.f_96547_.m_92883_(poseStack, "Resistência: " + 
/* 127 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentToughness, 130.0F, 52.0F, -6291470);
/* 128 */     this.f_96547_.m_92883_(poseStack, "Dano Base: " + 
/* 129 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentDamage, 130.0F, 82.0F, -56027);
/* 130 */     this.f_96547_.m_92883_(poseStack, "Veloc. de atk: " + 
/* 131 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentAttSpd + "%", 130.0F, 92.0F, -18833);
/* 132 */     this.f_96547_.m_92883_(poseStack, "Res. Mágica: " + 
/* 133 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentSpellResis + "%", 130.0F, 62.0F, -9855745);
/* 134 */     this.f_96547_.m_92883_(poseStack, "Poder mágico: +" + 
/* 135 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).extraSpellPow + "%", 130.0F, 127.0F, -4814337);
/* 136 */     this.f_96547_.m_92883_(poseStack, "Cooldown: -" + 
/* 137 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).cooldown + "%", 130.0F, 137.0F, -3640577);
/* 138 */     this.f_96547_.m_92883_(poseStack, "Velocidade: " + 
/* 139 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentSpd + "%", 130.0F, 102.0F, -9896047);
/* 140 */     this.f_96547_.m_92883_(poseStack, "Desc. de Itens: +" + 
/* 141 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentLuck + "%", 130.0F, 177.0F, -9437338);
/* 142 */     this.f_96547_.m_92883_(poseStack, "Tempo de cast: -" + 
/* 143 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).casttime + "%", 130.0F, 147.0F, -52612);
/* 144 */     if (ShowVitMultProcedure.execute((Entity)this.entity))
/* 145 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 146 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).VITTotal, 55.0F, 37.0F, -13312); 
/* 147 */     if (ShowMultMndProcedure.execute((Entity)this.entity))
/* 148 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 149 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).MANATotal, 55.0F, 62.0F, -13312); 
/* 150 */     if (ShowMultEndProcedure.execute((Entity)this.entity))
/* 151 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 152 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDTotal, 55.0F, 87.0F, -13312); 
/* 153 */     if (ShowMultStrProcedure.execute((Entity)this.entity))
/* 154 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 155 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).STRTotal, 55.0F, 112.0F, -13312); 
/* 156 */     if (ShowMultDexProcedure.execute((Entity)this.entity))
/* 157 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 158 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXTotal, 55.0F, 137.0F, -13312); 
/* 159 */     if (ShowMultIntProcedure.execute((Entity)this.entity))
/* 160 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 161 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).INTTotal, 55.0F, 162.0F, -13312); 
/* 162 */     if (ShowMultLuckProcedure.execute((Entity)this.entity))
/* 163 */       this.f_96547_.m_92883_(poseStack, "x" + ((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 164 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCKTotal, 55.0F, 187.0F, -13312); 
/* 165 */     this.f_96547_.m_92883_(poseStack, "Magia de Fogo: +" + 
/* 166 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentFirePow + "%", 245.0F, 26.0F, -31157);
/* 167 */     this.f_96547_.m_92883_(poseStack, "Magia de Gelo: +" + 
/* 168 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentIcePow + "%", 245.0F, 44.0F, -7536672);
/* 169 */     this.f_96547_.m_92883_(poseStack, "Magia de Raio: +" + 
/* 170 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentLightPow + "%", 245.0F, 64.0F, -13844225);
/* 171 */     this.f_96547_.m_92883_(poseStack, "Magia de Veneno: +" + 
/* 172 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentPsnPow + "%", 245.0F, 81.0F, -16737509);
/* 173 */     this.f_96547_.m_92883_(poseStack, "Magia Sagrada: +" + 
/* 174 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentHolyPow + "%", 245.0F, 101.0F, -3445);
/* 175 */     this.f_96547_.m_92883_(poseStack, "Magia do Fim: +" + 
/* 176 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentEndPow + "%", 245.0F, 119.0F, -7602004);
/* 177 */     this.f_96547_.m_92883_(poseStack, "Magia de Sangue: +" + 
/* 178 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentBldPow + "%", 245.0F, 140.0F, -7012352);
/* 179 */     this.f_96547_.m_92883_(poseStack, "Magia Evocação: +" + 
/*     */         
/* 181 */         (int)((KsmpStatsModVariables.PlayerVariables)this.entity.getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).currentEvoPow + "%", 244.0F, 159.0F, -9062764);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7379_() {
/* 187 */     super.m_7379_();
/* 188 */     (Minecraft.m_91087_()).f_91068_.m_90926_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7856_() {
/* 193 */     super.m_7856_();
/* 194 */     this.f_96541_.f_91068_.m_90926_(true);
/* 195 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 295, this.f_97736_ + 185, 72, 20, (Component)new TextComponent("Exchange XP"), e -> {
/*     */             if (CanExancheProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(0, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 0, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 203 */             if (CanExancheProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 204 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 207 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 57, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanMindProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(1, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 1, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 215 */             if (CanMindProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 216 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 219 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 82, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanEndProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(2, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 2, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 227 */             if (CanEndProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 228 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 231 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 107, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanSTRProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(3, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 3, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 239 */             if (CanSTRProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 240 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 243 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 132, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanDEXProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(4, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 4, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 251 */             if (CanDEXProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 252 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 255 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 157, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanINTProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(5, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 5, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 263 */             if (CanINTProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 264 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 267 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 182, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanLuckProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(6, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 6, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 275 */             if (CanLuckProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 276 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/* 279 */     m_142416_((GuiEventListener)new Button(this.f_97735_ + 90, this.f_97736_ + 32, 18, 20, (Component)new TextComponent("+"), e -> {
/*     */             if (CanVitProcedure.execute((LevelAccessor)this.world, (Entity)this.entity)) {
/*     */               KsmpStatsMod.PACKET_HANDLER.sendToServer(new StatsMenuButtonMessage(7, this.x, this.y, this.z));
/*     */               StatsMenuButtonMessage.handleButtonAction(this.entity, 7, this.x, this.y, this.z);
/*     */             } 
/*     */           })
/*     */         {
/*     */           public void m_6305_(PoseStack ms, int gx, int gy, float ticks) {
/* 287 */             if (CanVitProcedure.execute((LevelAccessor)StatsMenuScreen.this.world, (Entity)StatsMenuScreen.this.entity))
/* 288 */               super.m_6305_(ms, gx, gy, ticks); 
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\client\gui\StatsMenuScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */