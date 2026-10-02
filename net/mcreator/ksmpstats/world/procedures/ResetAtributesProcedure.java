/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityArgument;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ public class ResetAtributesProcedure
/*     */ {
/*     */   public static void execute(final CommandContext<CommandSourceStack> arguments) {
/*  14 */     double currentLVL = 0.0D;
/*  15 */     double xpAmount = 0.0D;
/*  16 */     double xpNeed = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  27 */     currentLVL = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LVL;
/*  28 */     xpNeed = 10.0D;
/*  29 */     xpAmount = 0.0D;
/*  30 */     for (int index0 = 0; index0 < (int)currentLVL; index0++) {
/*  31 */       xpAmount += xpNeed;
/*  32 */       xpNeed += 10.0D;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + xpAmount;
/*  46 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/*  49 */             return EntityArgument.m_91452_(arguments, "player");
/*  50 */           } catch (CommandSyntaxException e) {
/*  51 */             e.printStackTrace();
/*  52 */             return null;
/*     */           } 
/*     */         }
/*  55 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.XP = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/*  60 */                     return EntityArgument.m_91452_(arguments, "player");
/*  61 */                   } catch (CommandSyntaxException e) {
/*  62 */                     e.printStackTrace();
/*  63 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/*  70 */     _setval = 0.0D;
/*  71 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/*  74 */             return EntityArgument.m_91452_(arguments, "player");
/*  75 */           } catch (CommandSyntaxException e) {
/*  76 */             e.printStackTrace();
/*  77 */             return null;
/*     */           } 
/*     */         }
/*  80 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.VIDA = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/*  85 */                     return EntityArgument.m_91452_(arguments, "player");
/*  86 */                   } catch (CommandSyntaxException e) {
/*  87 */                     e.printStackTrace();
/*  88 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/*  95 */     _setval = 0.0D;
/*  96 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/*  99 */             return EntityArgument.m_91452_(arguments, "player");
/* 100 */           } catch (CommandSyntaxException e) {
/* 101 */             e.printStackTrace();
/* 102 */             return null;
/*     */           } 
/*     */         }
/* 105 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.STR = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 110 */                     return EntityArgument.m_91452_(arguments, "player");
/* 111 */                   } catch (CommandSyntaxException e) {
/* 112 */                     e.printStackTrace();
/* 113 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/* 120 */     _setval = 0.0D;
/* 121 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 124 */             return EntityArgument.m_91452_(arguments, "player");
/* 125 */           } catch (CommandSyntaxException e) {
/* 126 */             e.printStackTrace();
/* 127 */             return null;
/*     */           } 
/*     */         }
/* 130 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.LUCK = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 135 */                     return EntityArgument.m_91452_(arguments, "player");
/* 136 */                   } catch (CommandSyntaxException e) {
/* 137 */                     e.printStackTrace();
/* 138 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/* 145 */     _setval = 0.0D;
/* 146 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 149 */             return EntityArgument.m_91452_(arguments, "player");
/* 150 */           } catch (CommandSyntaxException e) {
/* 151 */             e.printStackTrace();
/* 152 */             return null;
/*     */           } 
/*     */         }
/* 155 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.END = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 160 */                     return EntityArgument.m_91452_(arguments, "player");
/* 161 */                   } catch (CommandSyntaxException e) {
/* 162 */                     e.printStackTrace();
/* 163 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/* 170 */     _setval = 0.0D;
/* 171 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 174 */             return EntityArgument.m_91452_(arguments, "player");
/* 175 */           } catch (CommandSyntaxException e) {
/* 176 */             e.printStackTrace();
/* 177 */             return null;
/*     */           } 
/*     */         }
/* 180 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.MANA = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 185 */                     return EntityArgument.m_91452_(arguments, "player");
/* 186 */                   } catch (CommandSyntaxException e) {
/* 187 */                     e.printStackTrace();
/* 188 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/* 195 */     _setval = 0.0D;
/* 196 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 199 */             return EntityArgument.m_91452_(arguments, "player");
/* 200 */           } catch (CommandSyntaxException e) {
/* 201 */             e.printStackTrace();
/* 202 */             return null;
/*     */           } 
/*     */         }
/* 205 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.INTE = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 210 */                     return EntityArgument.m_91452_(arguments, "player");
/* 211 */                   } catch (CommandSyntaxException e) {
/* 212 */                     e.printStackTrace();
/* 213 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */ 
/*     */     
/* 220 */     _setval = 0.0D;
/* 221 */     (new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 224 */             return EntityArgument.m_91452_(arguments, "player");
/* 225 */           } catch (CommandSyntaxException e) {
/* 226 */             e.printStackTrace();
/* 227 */             return null;
/*     */           } 
/*     */         }
/* 230 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */           capability.DEX = _setval;
/*     */           capability.syncPlayerVariables((new Object() {
/*     */                 public Entity getEntity() {
/*     */                   try {
/* 235 */                     return EntityArgument.m_91452_(arguments, "player");
/* 236 */                   } catch (CommandSyntaxException e) {
/* 237 */                     e.printStackTrace();
/* 238 */                     return null;
/*     */                   } 
/*     */                 }
/*     */               }).getEntity());
/*     */         });
/*     */     
/* 244 */     OnCommandProcedure.execute(arguments);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ResetAtributesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */