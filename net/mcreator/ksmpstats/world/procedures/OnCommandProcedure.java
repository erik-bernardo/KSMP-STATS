/*     */ package net.mcreator.ksmpstats.procedures;
/*     */ 
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityArgument;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class OnCommandProcedure
/*     */ {
/*     */   public static void execute(final CommandContext<CommandSourceStack> arguments) {
/*  18 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/*  21 */             return EntityArgument.m_91452_(arguments, "player");
/*  22 */           } catch (CommandSyntaxException e) {
/*  23 */             e.printStackTrace();
/*  24 */             return null;
/*     */           } 
/*     */         }
/*  27 */       }).getEntity()).m_21051_(Attributes.f_22276_).m_22100_(10.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  30 */               return EntityArgument.m_91452_(arguments, "player");
/*  31 */             } catch (CommandSyntaxException e) {
/*  32 */               e.printStackTrace();
/*  33 */               return null;
/*     */             } 
/*     */           }
/*  36 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  37 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  40 */               return EntityArgument.m_91452_(arguments, "player");
/*  41 */             } catch (CommandSyntaxException e) {
/*  42 */               e.printStackTrace();
/*  43 */               return null;
/*     */             } 
/*     */           }
/*  46 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  47 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  50 */               return EntityArgument.m_91452_(arguments, "player");
/*  51 */             } catch (CommandSyntaxException e) {
/*  52 */               e.printStackTrace();
/*  53 */               return null;
/*     */             } 
/*     */           }
/*  56 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  57 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).VITAdd));
/*  58 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/*  61 */             return EntityArgument.m_91452_(arguments, "player");
/*  62 */           } catch (CommandSyntaxException e) {
/*  63 */             e.printStackTrace();
/*  64 */             return null;
/*     */           } 
/*     */         }
/*  67 */       }).getEntity()).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:max_mana")))
/*  68 */       .m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  71 */               return EntityArgument.m_91452_(arguments, "player");
/*  72 */             } catch (CommandSyntaxException e) {
/*  73 */               e.printStackTrace();
/*  74 */               return null;
/*     */             } 
/*     */           }
/*  77 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  78 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  81 */               return EntityArgument.m_91452_(arguments, "player");
/*  82 */             } catch (CommandSyntaxException e) {
/*  83 */               e.printStackTrace();
/*  84 */               return null;
/*     */             } 
/*     */           }
/*  87 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  88 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/*  91 */               return EntityArgument.m_91452_(arguments, "player");
/*  92 */             } catch (CommandSyntaxException e) {
/*  93 */               e.printStackTrace();
/*  94 */               return null;
/*     */             } 
/*     */           }
/*  97 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  98 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) * 20.0D);
/*     */     
/* 100 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 103 */             return EntityArgument.m_91452_(arguments, "player");
/* 104 */           } catch (CommandSyntaxException e) {
/* 105 */             e.printStackTrace();
/* 106 */             return null;
/*     */           } 
/*     */         }
/* 109 */       }).getEntity()).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_resist")))
/* 110 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 113 */               return EntityArgument.m_91452_(arguments, "player");
/* 114 */             } catch (CommandSyntaxException e) {
/* 115 */               e.printStackTrace();
/* 116 */               return null;
/*     */             } 
/*     */           }
/* 119 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 120 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 123 */               return EntityArgument.m_91452_(arguments, "player");
/* 124 */             } catch (CommandSyntaxException e) {
/* 125 */               e.printStackTrace();
/* 126 */               return null;
/*     */             } 
/*     */           }
/* 129 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 130 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 133 */               return EntityArgument.m_91452_(arguments, "player");
/* 134 */             } catch (CommandSyntaxException e) {
/* 135 */               e.printStackTrace();
/* 136 */               return null;
/*     */             } 
/*     */           }
/* 139 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 140 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).MANAAdd) / 100.0D);
/*     */     
/* 142 */     if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 145 */             return EntityArgument.m_91452_(arguments, "player");
/* 146 */           } catch (CommandSyntaxException e) {
/* 147 */             e.printStackTrace();
/* 148 */             return null;
/*     */           } 
/*     */         }
/* 151 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)(new Object()
/*     */       {
/*     */         public Entity getEntity() {
/*     */           try {
/* 155 */             return EntityArgument.m_91452_(arguments, "player");
/* 156 */           } catch (CommandSyntaxException e) {
/* 157 */             e.printStackTrace();
/* 158 */             return null;
/*     */           } 
/*     */         }
/* 161 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 162 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 165 */             return EntityArgument.m_91452_(arguments, "player");
/* 166 */           } catch (CommandSyntaxException e) {
/* 167 */             e.printStackTrace();
/* 168 */             return null;
/*     */           } 
/*     */         }
/* 171 */       }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 172 */       .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) <= 50.0D) {
/* 173 */       ((LivingEntity)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 176 */               return EntityArgument.m_91452_(arguments, "player");
/* 177 */             } catch (CommandSyntaxException e) {
/* 178 */               e.printStackTrace();
/* 179 */               return null;
/*     */             } 
/*     */           }
/* 182 */         }).getEntity()).m_21051_(Attributes.f_22285_).m_22100_(0.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 185 */                 return EntityArgument.m_91452_(arguments, "player");
/* 186 */               } catch (CommandSyntaxException e) {
/* 187 */                 e.printStackTrace();
/* 188 */                 return null;
/*     */               } 
/*     */             }
/* 191 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 192 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 195 */                 return EntityArgument.m_91452_(arguments, "player");
/* 196 */               } catch (CommandSyntaxException e) {
/* 197 */                 e.printStackTrace();
/* 198 */                 return null;
/*     */               } 
/*     */             }
/* 201 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 202 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 205 */                 return EntityArgument.m_91452_(arguments, "player");
/* 206 */               } catch (CommandSyntaxException e) {
/* 207 */                 e.printStackTrace();
/* 208 */                 return null;
/*     */               } 
/*     */             }
/* 211 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 212 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */       
/* 214 */       ((LivingEntity)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 217 */               return EntityArgument.m_91452_(arguments, "player");
/* 218 */             } catch (CommandSyntaxException e) {
/* 219 */               e.printStackTrace();
/* 220 */               return null;
/*     */             } 
/*     */           }
/* 223 */         }).getEntity()).m_21051_(Attributes.f_22284_).m_22100_(-10.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 226 */                 return EntityArgument.m_91452_(arguments, "player");
/* 227 */               } catch (CommandSyntaxException e) {
/* 228 */                 e.printStackTrace();
/* 229 */                 return null;
/*     */               } 
/*     */             }
/* 232 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 233 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 236 */                 return EntityArgument.m_91452_(arguments, "player");
/* 237 */               } catch (CommandSyntaxException e) {
/* 238 */                 e.printStackTrace();
/* 239 */                 return null;
/*     */               } 
/*     */             }
/* 242 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 243 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 246 */                 return EntityArgument.m_91452_(arguments, "player");
/* 247 */               } catch (CommandSyntaxException e) {
/* 248 */                 e.printStackTrace();
/* 249 */                 return null;
/*     */               } 
/*     */             }
/* 252 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 253 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) / 5.0D);
/*     */     } else {
/*     */       
/* 256 */       ((LivingEntity)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 259 */               return EntityArgument.m_91452_(arguments, "player");
/* 260 */             } catch (CommandSyntaxException e) {
/* 261 */               e.printStackTrace();
/* 262 */               return null;
/*     */             } 
/*     */           }
/* 265 */         }).getEntity()).m_21051_(Attributes.f_22285_).m_22100_(0.0D + (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 268 */                 return EntityArgument.m_91452_(arguments, "player");
/* 269 */               } catch (CommandSyntaxException e) {
/* 270 */                 e.printStackTrace();
/* 271 */                 return null;
/*     */               } 
/*     */             }
/* 274 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 275 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 278 */                 return EntityArgument.m_91452_(arguments, "player");
/* 279 */               } catch (CommandSyntaxException e) {
/* 280 */                 e.printStackTrace();
/* 281 */                 return null;
/*     */               } 
/*     */             }
/* 284 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 285 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */             public Entity getEntity() {
/*     */               try {
/* 288 */                 return EntityArgument.m_91452_(arguments, "player");
/* 289 */               } catch (CommandSyntaxException e) {
/* 290 */                 e.printStackTrace();
/* 291 */                 return null;
/*     */               } 
/*     */             }
/* 294 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 295 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).ENDAdd) - 50.0D) / 2.0D);
/*     */       
/* 297 */       ((LivingEntity)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 300 */               return EntityArgument.m_91452_(arguments, "player");
/* 301 */             } catch (CommandSyntaxException e) {
/* 302 */               e.printStackTrace();
/* 303 */               return null;
/*     */             } 
/*     */           }
/* 306 */         }).getEntity()).m_21051_(Attributes.f_22284_).m_22100_(0.0D);
/*     */     } 
/* 308 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 311 */             return EntityArgument.m_91452_(arguments, "player");
/* 312 */           } catch (CommandSyntaxException e) {
/* 313 */             e.printStackTrace();
/* 314 */             return null;
/*     */           } 
/*     */         }
/* 317 */       }).getEntity()).m_21051_(Attributes.f_22281_).m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 320 */               return EntityArgument.m_91452_(arguments, "player");
/* 321 */             } catch (CommandSyntaxException e) {
/* 322 */               e.printStackTrace();
/* 323 */               return null;
/*     */             } 
/*     */           }
/* 326 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STR * (((KsmpStatsModVariables.PlayerVariables)(new Object()
/*     */         {
/*     */           public Entity getEntity() {
/*     */             try {
/* 330 */               return EntityArgument.m_91452_(arguments, "player");
/* 331 */             } catch (CommandSyntaxException e) {
/* 332 */               e.printStackTrace();
/* 333 */               return null;
/*     */             } 
/*     */           }
/* 336 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 337 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 340 */               return EntityArgument.m_91452_(arguments, "player");
/* 341 */             } catch (CommandSyntaxException e) {
/* 342 */               e.printStackTrace();
/* 343 */               return null;
/*     */             } 
/*     */           }
/* 346 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 347 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).STRAdd) / 20.0D);
/*     */     
/* 349 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 352 */             return EntityArgument.m_91452_(arguments, "player");
/* 353 */           } catch (CommandSyntaxException e) {
/* 354 */             e.printStackTrace();
/* 355 */             return null;
/*     */           } 
/*     */         }
/* 358 */       }).getEntity()).m_21051_(Attributes.f_22283_).m_22100_(4.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 361 */               return EntityArgument.m_91452_(arguments, "player");
/* 362 */             } catch (CommandSyntaxException e) {
/* 363 */               e.printStackTrace();
/* 364 */               return null;
/*     */             } 
/*     */           }
/* 367 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX * (((KsmpStatsModVariables.PlayerVariables)(new Object()
/*     */         {
/*     */           public Entity getEntity() {
/*     */             try {
/* 371 */               return EntityArgument.m_91452_(arguments, "player");
/* 372 */             } catch (CommandSyntaxException e) {
/* 373 */               e.printStackTrace();
/* 374 */               return null;
/*     */             } 
/*     */           }
/* 377 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 378 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 381 */               return EntityArgument.m_91452_(arguments, "player");
/* 382 */             } catch (CommandSyntaxException e) {
/* 383 */               e.printStackTrace();
/* 384 */               return null;
/*     */             } 
/*     */           }
/* 387 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 388 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).DEXAdd) / 25.0D);
/*     */     
/* 390 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 393 */             return EntityArgument.m_91452_(arguments, "player");
/* 394 */           } catch (CommandSyntaxException e) {
/* 395 */             e.printStackTrace();
/* 396 */             return null;
/*     */           } 
/*     */         }
/* 399 */       }).getEntity()).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cast_time_reduction")))
/* 400 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 403 */               return EntityArgument.m_91452_(arguments, "player");
/* 404 */             } catch (CommandSyntaxException e) {
/* 405 */               e.printStackTrace();
/* 406 */               return null;
/*     */             } 
/*     */           }
/* 409 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 410 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 413 */               return EntityArgument.m_91452_(arguments, "player");
/* 414 */             } catch (CommandSyntaxException e) {
/* 415 */               e.printStackTrace();
/* 416 */               return null;
/*     */             } 
/*     */           }
/* 419 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 420 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 423 */               return EntityArgument.m_91452_(arguments, "player");
/* 424 */             } catch (CommandSyntaxException e) {
/* 425 */               e.printStackTrace();
/* 426 */               return null;
/*     */             } 
/*     */           }
/* 429 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 430 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 432 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 435 */             return EntityArgument.m_91452_(arguments, "player");
/* 436 */           } catch (CommandSyntaxException e) {
/* 437 */             e.printStackTrace();
/* 438 */             return null;
/*     */           } 
/*     */         }
/* 441 */       }).getEntity()).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:cooldown_reduction")))
/* 442 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 445 */               return EntityArgument.m_91452_(arguments, "player");
/* 446 */             } catch (CommandSyntaxException e) {
/* 447 */               e.printStackTrace();
/* 448 */               return null;
/*     */             } 
/*     */           }
/* 451 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 452 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 455 */               return EntityArgument.m_91452_(arguments, "player");
/* 456 */             } catch (CommandSyntaxException e) {
/* 457 */               e.printStackTrace();
/* 458 */               return null;
/*     */             } 
/*     */           }
/* 461 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 462 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 465 */               return EntityArgument.m_91452_(arguments, "player");
/* 466 */             } catch (CommandSyntaxException e) {
/* 467 */               e.printStackTrace();
/* 468 */               return null;
/*     */             } 
/*     */           }
/* 471 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 472 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 474 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 477 */             return EntityArgument.m_91452_(arguments, "player");
/* 478 */           } catch (CommandSyntaxException e) {
/* 479 */             e.printStackTrace();
/* 480 */             return null;
/*     */           } 
/*     */         }
/* 483 */       }).getEntity()).m_21051_((Attribute)ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("irons_spellbooks:spell_power")))
/* 484 */       .m_22100_(1.0D + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 487 */               return EntityArgument.m_91452_(arguments, "player");
/* 488 */             } catch (CommandSyntaxException e) {
/* 489 */               e.printStackTrace();
/* 490 */               return null;
/*     */             } 
/*     */           }
/* 493 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 494 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 497 */               return EntityArgument.m_91452_(arguments, "player");
/* 498 */             } catch (CommandSyntaxException e) {
/* 499 */               e.printStackTrace();
/* 500 */               return null;
/*     */             } 
/*     */           }
/* 503 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 504 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 507 */               return EntityArgument.m_91452_(arguments, "player");
/* 508 */             } catch (CommandSyntaxException e) {
/* 509 */               e.printStackTrace();
/* 510 */               return null;
/*     */             } 
/*     */           }
/* 513 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 514 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).INTAdd) / 200.0D);
/*     */     
/* 516 */     ((LivingEntity)(new Object() {
/*     */         public Entity getEntity() {
/*     */           try {
/* 519 */             return EntityArgument.m_91452_(arguments, "player");
/* 520 */           } catch (CommandSyntaxException e) {
/* 521 */             e.printStackTrace();
/* 522 */             return null;
/*     */           } 
/*     */         }
/* 525 */       }).getEntity()).m_21051_(Attributes.f_22286_).m_22100_(((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 528 */               return EntityArgument.m_91452_(arguments, "player");
/* 529 */             } catch (CommandSyntaxException e) {
/* 530 */               e.printStackTrace();
/* 531 */               return null;
/*     */             } 
/*     */           }
/* 534 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 535 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK * (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 538 */               return EntityArgument.m_91452_(arguments, "player");
/* 539 */             } catch (CommandSyntaxException e) {
/* 540 */               e.printStackTrace();
/* 541 */               return null;
/*     */             } 
/*     */           }
/* 544 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 545 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKmult + ((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*     */           public Entity getEntity() {
/*     */             try {
/* 548 */               return EntityArgument.m_91452_(arguments, "player");
/* 549 */             } catch (CommandSyntaxException e) {
/* 550 */               e.printStackTrace();
/* 551 */               return null;
/*     */             } 
/*     */           }
/* 554 */         }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 555 */         .orElse(new KsmpStatsModVariables.PlayerVariables())).LCKAdd) / 10.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\OnCommandProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */