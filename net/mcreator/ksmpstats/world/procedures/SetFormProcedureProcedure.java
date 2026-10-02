/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityArgument;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ public class SetFormProcedureProcedure
/*     */ {
/*     */   public static void execute(final CommandContext<CommandSourceStack> arguments) {
/*  16 */     if (StringArgumentType.getString(arguments, "form").equals("mago")) {
/*     */       
/*  18 */       boolean _setval = BoolArgumentType.getBool(arguments, "true_false");
/*  19 */       (new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  22 */               return EntityArgument.m_91452_(arguments, "player");
/*  23 */             } catch (CommandSyntaxException e) {
/*  24 */               e.printStackTrace();
/*  25 */               return null;
/*     */             } 
/*     */           }
/*  28 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */             capability.IsMage = _setval;
/*     */             capability.syncPlayerVariables((new Object() {
/*     */                   public Entity getEntity() {
/*     */                     try {
/*  33 */                       return EntityArgument.m_91452_(arguments, "player");
/*  34 */                     } catch (CommandSyntaxException e) {
/*  35 */                       e.printStackTrace();
/*  36 */                       return null;
/*     */                     }
/*     */                   
/*     */                   }
/*     */                 }).getEntity());
/*     */           });
/*  42 */     } else if (StringArgumentType.getString(arguments, "form").equals("assassino")) {
/*     */       
/*  44 */       boolean _setval = BoolArgumentType.getBool(arguments, "true_false");
/*  45 */       (new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  48 */               return EntityArgument.m_91452_(arguments, "player");
/*  49 */             } catch (CommandSyntaxException e) {
/*  50 */               e.printStackTrace();
/*  51 */               return null;
/*     */             } 
/*     */           }
/*  54 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */             capability.IsAssass = _setval;
/*     */             capability.syncPlayerVariables((new Object() {
/*     */                   public Entity getEntity() {
/*     */                     try {
/*  59 */                       return EntityArgument.m_91452_(arguments, "player");
/*  60 */                     } catch (CommandSyntaxException e) {
/*  61 */                       e.printStackTrace();
/*  62 */                       return null;
/*     */                     }
/*     */                   
/*     */                   }
/*     */                 }).getEntity());
/*     */           });
/*  68 */     } else if (StringArgumentType.getString(arguments, "form").equals("escudo")) {
/*     */       
/*  70 */       boolean _setval = BoolArgumentType.getBool(arguments, "true_false");
/*  71 */       (new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  74 */               return EntityArgument.m_91452_(arguments, "player");
/*  75 */             } catch (CommandSyntaxException e) {
/*  76 */               e.printStackTrace();
/*  77 */               return null;
/*     */             } 
/*     */           }
/*  80 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */             capability.IsShield = _setval;
/*     */             capability.syncPlayerVariables((new Object() {
/*     */                   public Entity getEntity() {
/*     */                     try {
/*  85 */                       return EntityArgument.m_91452_(arguments, "player");
/*  86 */                     } catch (CommandSyntaxException e) {
/*  87 */                       e.printStackTrace();
/*  88 */                       return null;
/*     */                     }
/*     */                   
/*     */                   }
/*     */                 }).getEntity());
/*     */           });
/*  94 */     } else if (StringArgumentType.getString(arguments, "form").equals("guerreiro")) {
/*     */       
/*  96 */       boolean _setval = BoolArgumentType.getBool(arguments, "true_false");
/*  97 */       (new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 100 */               return EntityArgument.m_91452_(arguments, "player");
/* 101 */             } catch (CommandSyntaxException e) {
/* 102 */               e.printStackTrace();
/* 103 */               return null;
/*     */             } 
/*     */           }
/* 106 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */             capability.IsWarrior = _setval;
/*     */             capability.syncPlayerVariables((new Object() {
/*     */                   public Entity getEntity() {
/*     */                     try {
/* 111 */                       return EntityArgument.m_91452_(arguments, "player");
/* 112 */                     } catch (CommandSyntaxException e) {
/* 113 */                       e.printStackTrace();
/* 114 */                       return null;
/*     */                     }
/*     */                   
/*     */                   }
/*     */                 }).getEntity());
/*     */           });
/* 120 */     } else if (StringArgumentType.getString(arguments, "form").equals("feiticeiro")) {
/*     */       
/* 122 */       boolean _setval = BoolArgumentType.getBool(arguments, "true_false");
/* 123 */       (new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 126 */               return EntityArgument.m_91452_(arguments, "player");
/* 127 */             } catch (CommandSyntaxException e) {
/* 128 */               e.printStackTrace();
/* 129 */               return null;
/*     */             } 
/*     */           }
/* 132 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*     */             capability.IsSorcerer = _setval;
/*     */             capability.syncPlayerVariables((new Object() {
/*     */                   public Entity getEntity() {
/*     */                     try {
/* 137 */                       return EntityArgument.m_91452_(arguments, "player");
/* 138 */                     } catch (CommandSyntaxException e) {
/* 139 */                       e.printStackTrace();
/* 140 */                       return null;
/*     */                     } 
/*     */                   }
/*     */                 }).getEntity());
/*     */           });
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\SetFormProcedureProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */