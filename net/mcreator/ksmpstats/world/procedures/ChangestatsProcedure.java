/*      */ package net.mcreator.ksmpstats.procedures;
/*      */ 
/*      */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*      */ import com.mojang.brigadier.arguments.StringArgumentType;
/*      */ import com.mojang.brigadier.context.CommandContext;
/*      */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*      */ import net.mcreator.ksmpstats.network.KsmpStatsModVariables;
/*      */ import net.minecraft.commands.CommandSourceStack;
/*      */ import net.minecraft.commands.arguments.EntityArgument;
/*      */ import net.minecraft.world.entity.Entity;
/*      */ 
/*      */ 
/*      */ public class ChangestatsProcedure
/*      */ {
/*      */   public static void execute(final CommandContext<CommandSourceStack> arguments) {
/*   16 */     if (StringArgumentType.getString(arguments, "attribute").equals("xp")) {
/*   17 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*   29 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP + DoubleArgumentType.getDouble(arguments, "value");
/*   30 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*   33 */                 return EntityArgument.m_91452_(arguments, "player");
/*   34 */               } catch (CommandSyntaxException e) {
/*   35 */                 e.printStackTrace();
/*   36 */                 return null;
/*      */               } 
/*      */             }
/*   39 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.XP = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*   44 */                         return EntityArgument.m_91452_(arguments, "player");
/*   45 */                       } catch (CommandSyntaxException e) {
/*   46 */                         e.printStackTrace();
/*   47 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*   53 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*   55 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*   56 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*   59 */                 return EntityArgument.m_91452_(arguments, "player");
/*   60 */               } catch (CommandSyntaxException e) {
/*   61 */                 e.printStackTrace();
/*   62 */                 return null;
/*      */               } 
/*      */             }
/*   65 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.XP = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*   70 */                         return EntityArgument.m_91452_(arguments, "player");
/*   71 */                       } catch (CommandSyntaxException e) {
/*   72 */                         e.printStackTrace();
/*   73 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*   79 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*   80 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*   83 */                 return EntityArgument.m_91452_(arguments, "player");
/*   84 */               } catch (CommandSyntaxException e) {
/*   85 */                 e.printStackTrace();
/*   86 */                 return null;
/*      */               } 
/*      */             }
/*   89 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*   90 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).XP - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*   92 */           double _setval = 0.0D;
/*   93 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*   96 */                   return EntityArgument.m_91452_(arguments, "player");
/*   97 */                 } catch (CommandSyntaxException e) {
/*   98 */                   e.printStackTrace();
/*   99 */                   return null;
/*      */                 } 
/*      */               }
/*  102 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.XP = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  107 */                           return EntityArgument.m_91452_(arguments, "player");
/*  108 */                         } catch (CommandSyntaxException e) {
/*  109 */                           e.printStackTrace();
/*  110 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  128 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP - DoubleArgumentType.getDouble(arguments, "value");
/*  129 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  132 */                   return EntityArgument.m_91452_(arguments, "player");
/*  133 */                 } catch (CommandSyntaxException e) {
/*  134 */                   e.printStackTrace();
/*  135 */                   return null;
/*      */                 } 
/*      */               }
/*  138 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.XP = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  143 */                           return EntityArgument.m_91452_(arguments, "player");
/*  144 */                         } catch (CommandSyntaxException e) {
/*  145 */                           e.printStackTrace();
/*  146 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  154 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("vit")) {
/*  155 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  167 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).VIDA + DoubleArgumentType.getDouble(arguments, "value");
/*  168 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  171 */                 return EntityArgument.m_91452_(arguments, "player");
/*  172 */               } catch (CommandSyntaxException e) {
/*  173 */                 e.printStackTrace();
/*  174 */                 return null;
/*      */               } 
/*      */             }
/*  177 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.VIDA = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  182 */                         return EntityArgument.m_91452_(arguments, "player");
/*  183 */                       } catch (CommandSyntaxException e) {
/*  184 */                         e.printStackTrace();
/*  185 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  191 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  193 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  194 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  197 */                 return EntityArgument.m_91452_(arguments, "player");
/*  198 */               } catch (CommandSyntaxException e) {
/*  199 */                 e.printStackTrace();
/*  200 */                 return null;
/*      */               } 
/*      */             }
/*  203 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.VIDA = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  208 */                         return EntityArgument.m_91452_(arguments, "player");
/*  209 */                       } catch (CommandSyntaxException e) {
/*  210 */                         e.printStackTrace();
/*  211 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  217 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  218 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  221 */                 return EntityArgument.m_91452_(arguments, "player");
/*  222 */               } catch (CommandSyntaxException e) {
/*  223 */                 e.printStackTrace();
/*  224 */                 return null;
/*      */               } 
/*      */             }
/*  227 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  228 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  230 */           double _setval = 0.0D;
/*  231 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  234 */                   return EntityArgument.m_91452_(arguments, "player");
/*  235 */                 } catch (CommandSyntaxException e) {
/*  236 */                   e.printStackTrace();
/*  237 */                   return null;
/*      */                 } 
/*      */               }
/*  240 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.VIDA = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  245 */                           return EntityArgument.m_91452_(arguments, "player");
/*  246 */                         } catch (CommandSyntaxException e) {
/*  247 */                           e.printStackTrace();
/*  248 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  266 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).XP - DoubleArgumentType.getDouble(arguments, "value");
/*  267 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  270 */                   return EntityArgument.m_91452_(arguments, "player");
/*  271 */                 } catch (CommandSyntaxException e) {
/*  272 */                   e.printStackTrace();
/*  273 */                   return null;
/*      */                 } 
/*      */               }
/*  276 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.VIDA = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  281 */                           return EntityArgument.m_91452_(arguments, "player");
/*  282 */                         } catch (CommandSyntaxException e) {
/*  283 */                           e.printStackTrace();
/*  284 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  292 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("mnd")) {
/*  293 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  305 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANA + DoubleArgumentType.getDouble(arguments, "value");
/*  306 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  309 */                 return EntityArgument.m_91452_(arguments, "player");
/*  310 */               } catch (CommandSyntaxException e) {
/*  311 */                 e.printStackTrace();
/*  312 */                 return null;
/*      */               } 
/*      */             }
/*  315 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.MANA = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  320 */                         return EntityArgument.m_91452_(arguments, "player");
/*  321 */                       } catch (CommandSyntaxException e) {
/*  322 */                         e.printStackTrace();
/*  323 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  329 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  331 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  332 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  335 */                 return EntityArgument.m_91452_(arguments, "player");
/*  336 */               } catch (CommandSyntaxException e) {
/*  337 */                 e.printStackTrace();
/*  338 */                 return null;
/*      */               } 
/*      */             }
/*  341 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.MANA = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  346 */                         return EntityArgument.m_91452_(arguments, "player");
/*  347 */                       } catch (CommandSyntaxException e) {
/*  348 */                         e.printStackTrace();
/*  349 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  355 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  356 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  359 */                 return EntityArgument.m_91452_(arguments, "player");
/*  360 */               } catch (CommandSyntaxException e) {
/*  361 */                 e.printStackTrace();
/*  362 */                 return null;
/*      */               } 
/*      */             }
/*  365 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  366 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).MANA - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  368 */           double _setval = 0.0D;
/*  369 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  372 */                   return EntityArgument.m_91452_(arguments, "player");
/*  373 */                 } catch (CommandSyntaxException e) {
/*  374 */                   e.printStackTrace();
/*  375 */                   return null;
/*      */                 } 
/*      */               }
/*  378 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.MANA = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  383 */                           return EntityArgument.m_91452_(arguments, "player");
/*  384 */                         } catch (CommandSyntaxException e) {
/*  385 */                           e.printStackTrace();
/*  386 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  404 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).MANA - DoubleArgumentType.getDouble(arguments, "value");
/*  405 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  408 */                   return EntityArgument.m_91452_(arguments, "player");
/*  409 */                 } catch (CommandSyntaxException e) {
/*  410 */                   e.printStackTrace();
/*  411 */                   return null;
/*      */                 } 
/*      */               }
/*  414 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.MANA = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  419 */                           return EntityArgument.m_91452_(arguments, "player");
/*  420 */                         } catch (CommandSyntaxException e) {
/*  421 */                           e.printStackTrace();
/*  422 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  430 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("end")) {
/*  431 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  443 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END + DoubleArgumentType.getDouble(arguments, "value");
/*  444 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  447 */                 return EntityArgument.m_91452_(arguments, "player");
/*  448 */               } catch (CommandSyntaxException e) {
/*  449 */                 e.printStackTrace();
/*  450 */                 return null;
/*      */               } 
/*      */             }
/*  453 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.END = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  458 */                         return EntityArgument.m_91452_(arguments, "player");
/*  459 */                       } catch (CommandSyntaxException e) {
/*  460 */                         e.printStackTrace();
/*  461 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  467 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  469 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  470 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  473 */                 return EntityArgument.m_91452_(arguments, "player");
/*  474 */               } catch (CommandSyntaxException e) {
/*  475 */                 e.printStackTrace();
/*  476 */                 return null;
/*      */               } 
/*      */             }
/*  479 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.END = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  484 */                         return EntityArgument.m_91452_(arguments, "player");
/*  485 */                       } catch (CommandSyntaxException e) {
/*  486 */                         e.printStackTrace();
/*  487 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  493 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  494 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  497 */                 return EntityArgument.m_91452_(arguments, "player");
/*  498 */               } catch (CommandSyntaxException e) {
/*  499 */                 e.printStackTrace();
/*  500 */                 return null;
/*      */               } 
/*      */             }
/*  503 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  504 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).END - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  506 */           double _setval = 0.0D;
/*  507 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  510 */                   return EntityArgument.m_91452_(arguments, "player");
/*  511 */                 } catch (CommandSyntaxException e) {
/*  512 */                   e.printStackTrace();
/*  513 */                   return null;
/*      */                 } 
/*      */               }
/*  516 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.END = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  521 */                           return EntityArgument.m_91452_(arguments, "player");
/*  522 */                         } catch (CommandSyntaxException e) {
/*  523 */                           e.printStackTrace();
/*  524 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  542 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).END - DoubleArgumentType.getDouble(arguments, "value");
/*  543 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  546 */                   return EntityArgument.m_91452_(arguments, "player");
/*  547 */                 } catch (CommandSyntaxException e) {
/*  548 */                   e.printStackTrace();
/*  549 */                   return null;
/*      */                 } 
/*      */               }
/*  552 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.END = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  557 */                           return EntityArgument.m_91452_(arguments, "player");
/*  558 */                         } catch (CommandSyntaxException e) {
/*  559 */                           e.printStackTrace();
/*  560 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  568 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("str")) {
/*  569 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  581 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STR + DoubleArgumentType.getDouble(arguments, "value");
/*  582 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  585 */                 return EntityArgument.m_91452_(arguments, "player");
/*  586 */               } catch (CommandSyntaxException e) {
/*  587 */                 e.printStackTrace();
/*  588 */                 return null;
/*      */               } 
/*      */             }
/*  591 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.STR = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  596 */                         return EntityArgument.m_91452_(arguments, "player");
/*  597 */                       } catch (CommandSyntaxException e) {
/*  598 */                         e.printStackTrace();
/*  599 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  605 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  607 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  608 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  611 */                 return EntityArgument.m_91452_(arguments, "player");
/*  612 */               } catch (CommandSyntaxException e) {
/*  613 */                 e.printStackTrace();
/*  614 */                 return null;
/*      */               } 
/*      */             }
/*  617 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.STR = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  622 */                         return EntityArgument.m_91452_(arguments, "player");
/*  623 */                       } catch (CommandSyntaxException e) {
/*  624 */                         e.printStackTrace();
/*  625 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  631 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  632 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  635 */                 return EntityArgument.m_91452_(arguments, "player");
/*  636 */               } catch (CommandSyntaxException e) {
/*  637 */                 e.printStackTrace();
/*  638 */                 return null;
/*      */               } 
/*      */             }
/*  641 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  642 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).STR - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  644 */           double _setval = 0.0D;
/*  645 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  648 */                   return EntityArgument.m_91452_(arguments, "player");
/*  649 */                 } catch (CommandSyntaxException e) {
/*  650 */                   e.printStackTrace();
/*  651 */                   return null;
/*      */                 } 
/*      */               }
/*  654 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.STR = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  659 */                           return EntityArgument.m_91452_(arguments, "player");
/*  660 */                         } catch (CommandSyntaxException e) {
/*  661 */                           e.printStackTrace();
/*  662 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  680 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).STR - DoubleArgumentType.getDouble(arguments, "value");
/*  681 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  684 */                   return EntityArgument.m_91452_(arguments, "player");
/*  685 */                 } catch (CommandSyntaxException e) {
/*  686 */                   e.printStackTrace();
/*  687 */                   return null;
/*      */                 } 
/*      */               }
/*  690 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.STR = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  695 */                           return EntityArgument.m_91452_(arguments, "player");
/*  696 */                         } catch (CommandSyntaxException e) {
/*  697 */                           e.printStackTrace();
/*  698 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  706 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("dex")) {
/*  707 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  719 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX + DoubleArgumentType.getDouble(arguments, "value");
/*  720 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  723 */                 return EntityArgument.m_91452_(arguments, "player");
/*  724 */               } catch (CommandSyntaxException e) {
/*  725 */                 e.printStackTrace();
/*  726 */                 return null;
/*      */               } 
/*      */             }
/*  729 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.DEX = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  734 */                         return EntityArgument.m_91452_(arguments, "player");
/*  735 */                       } catch (CommandSyntaxException e) {
/*  736 */                         e.printStackTrace();
/*  737 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  743 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  745 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  746 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  749 */                 return EntityArgument.m_91452_(arguments, "player");
/*  750 */               } catch (CommandSyntaxException e) {
/*  751 */                 e.printStackTrace();
/*  752 */                 return null;
/*      */               } 
/*      */             }
/*  755 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.DEX = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  760 */                         return EntityArgument.m_91452_(arguments, "player");
/*  761 */                       } catch (CommandSyntaxException e) {
/*  762 */                         e.printStackTrace();
/*  763 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  769 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  770 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  773 */                 return EntityArgument.m_91452_(arguments, "player");
/*  774 */               } catch (CommandSyntaxException e) {
/*  775 */                 e.printStackTrace();
/*  776 */                 return null;
/*      */               } 
/*      */             }
/*  779 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  780 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).DEX - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  782 */           double _setval = 0.0D;
/*  783 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  786 */                   return EntityArgument.m_91452_(arguments, "player");
/*  787 */                 } catch (CommandSyntaxException e) {
/*  788 */                   e.printStackTrace();
/*  789 */                   return null;
/*      */                 } 
/*      */               }
/*  792 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.DEX = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  797 */                           return EntityArgument.m_91452_(arguments, "player");
/*  798 */                         } catch (CommandSyntaxException e) {
/*  799 */                           e.printStackTrace();
/*  800 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  818 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).DEX - DoubleArgumentType.getDouble(arguments, "value");
/*  819 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  822 */                   return EntityArgument.m_91452_(arguments, "player");
/*  823 */                 } catch (CommandSyntaxException e) {
/*  824 */                   e.printStackTrace();
/*  825 */                   return null;
/*      */                 } 
/*      */               }
/*  828 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.DEX = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  833 */                           return EntityArgument.m_91452_(arguments, "player");
/*  834 */                         } catch (CommandSyntaxException e) {
/*  835 */                           e.printStackTrace();
/*  836 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  844 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("int")) {
/*  845 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  857 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTE + DoubleArgumentType.getDouble(arguments, "value");
/*  858 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  861 */                 return EntityArgument.m_91452_(arguments, "player");
/*  862 */               } catch (CommandSyntaxException e) {
/*  863 */                 e.printStackTrace();
/*  864 */                 return null;
/*      */               } 
/*      */             }
/*  867 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.INTE = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  872 */                         return EntityArgument.m_91452_(arguments, "player");
/*  873 */                       } catch (CommandSyntaxException e) {
/*  874 */                         e.printStackTrace();
/*  875 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  881 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/*  883 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/*  884 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  887 */                 return EntityArgument.m_91452_(arguments, "player");
/*  888 */               } catch (CommandSyntaxException e) {
/*  889 */                 e.printStackTrace();
/*  890 */                 return null;
/*      */               } 
/*      */             }
/*  893 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.INTE = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/*  898 */                         return EntityArgument.m_91452_(arguments, "player");
/*  899 */                       } catch (CommandSyntaxException e) {
/*  900 */                         e.printStackTrace();
/*  901 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/*  907 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/*  908 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  911 */                 return EntityArgument.m_91452_(arguments, "player");
/*  912 */               } catch (CommandSyntaxException e) {
/*  913 */                 e.printStackTrace();
/*  914 */                 return null;
/*      */               } 
/*      */             }
/*  917 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/*  918 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).INTE - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/*  920 */           double _setval = 0.0D;
/*  921 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  924 */                   return EntityArgument.m_91452_(arguments, "player");
/*  925 */                 } catch (CommandSyntaxException e) {
/*  926 */                   e.printStackTrace();
/*  927 */                   return null;
/*      */                 } 
/*      */               }
/*  930 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.INTE = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  935 */                           return EntityArgument.m_91452_(arguments, "player");
/*  936 */                         } catch (CommandSyntaxException e) {
/*  937 */                           e.printStackTrace();
/*  938 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/*  956 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).INTE - DoubleArgumentType.getDouble(arguments, "value");
/*  957 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/*  960 */                   return EntityArgument.m_91452_(arguments, "player");
/*  961 */                 } catch (CommandSyntaxException e) {
/*  962 */                   e.printStackTrace();
/*  963 */                   return null;
/*      */                 } 
/*      */               }
/*  966 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.INTE = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/*  971 */                           return EntityArgument.m_91452_(arguments, "player");
/*  972 */                         } catch (CommandSyntaxException e) {
/*  973 */                           e.printStackTrace();
/*  974 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*  982 */     } else if (StringArgumentType.getString(arguments, "attribute").equals("lck")) {
/*  983 */       if (StringArgumentType.getString(arguments, "action").equals("add")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  995 */         double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK + DoubleArgumentType.getDouble(arguments, "value");
/*  996 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/*  999 */                 return EntityArgument.m_91452_(arguments, "player");
/* 1000 */               } catch (CommandSyntaxException e) {
/* 1001 */                 e.printStackTrace();
/* 1002 */                 return null;
/*      */               } 
/*      */             }
/* 1005 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.LUCK = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/* 1010 */                         return EntityArgument.m_91452_(arguments, "player");
/* 1011 */                       } catch (CommandSyntaxException e) {
/* 1012 */                         e.printStackTrace();
/* 1013 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/* 1019 */       } else if (StringArgumentType.getString(arguments, "action").equals("set")) {
/*      */         
/* 1021 */         double _setval = DoubleArgumentType.getDouble(arguments, "value");
/* 1022 */         (new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/* 1025 */                 return EntityArgument.m_91452_(arguments, "player");
/* 1026 */               } catch (CommandSyntaxException e) {
/* 1027 */                 e.printStackTrace();
/* 1028 */                 return null;
/*      */               } 
/*      */             }
/* 1031 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */               capability.LUCK = _setval;
/*      */               capability.syncPlayerVariables((new Object() {
/*      */                     public Entity getEntity() {
/*      */                       try {
/* 1036 */                         return EntityArgument.m_91452_(arguments, "player");
/* 1037 */                       } catch (CommandSyntaxException e) {
/* 1038 */                         e.printStackTrace();
/* 1039 */                         return null;
/*      */                       }
/*      */                     
/*      */                     }
/*      */                   }).getEntity());
/*      */             });
/* 1045 */       } else if (StringArgumentType.getString(arguments, "action").equals("remove")) {
/* 1046 */         if (((KsmpStatsModVariables.PlayerVariables)(new Object() {
/*      */             public Entity getEntity() {
/*      */               try {
/* 1049 */                 return EntityArgument.m_91452_(arguments, "player");
/* 1050 */               } catch (CommandSyntaxException e) {
/* 1051 */                 e.printStackTrace();
/* 1052 */                 return null;
/*      */               } 
/*      */             }
/* 1055 */           }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
/* 1056 */           .orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK - DoubleArgumentType.getDouble(arguments, "value") < 0.0D) {
/*      */           
/* 1058 */           double _setval = 0.0D;
/* 1059 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/* 1062 */                   return EntityArgument.m_91452_(arguments, "player");
/* 1063 */                 } catch (CommandSyntaxException e) {
/* 1064 */                   e.printStackTrace();
/* 1065 */                   return null;
/*      */                 } 
/*      */               }
/* 1068 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.LUCK = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/* 1073 */                           return EntityArgument.m_91452_(arguments, "player");
/* 1074 */                         } catch (CommandSyntaxException e) {
/* 1075 */                           e.printStackTrace();
/* 1076 */                           return null;
/*      */                         }
/*      */                       
/*      */                       }
/*      */                     }).getEntity());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               });
/*      */         }
/*      */         else {
/*      */           
/* 1094 */           double _setval = ((KsmpStatsModVariables.PlayerVariables)(new Object() { public Entity getEntity() { try { return EntityArgument.m_91452_(arguments, "player"); } catch (CommandSyntaxException e) { e.printStackTrace(); return null; }  } }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KsmpStatsModVariables.PlayerVariables())).LUCK - DoubleArgumentType.getDouble(arguments, "value");
/* 1095 */           (new Object() {
/*      */               public Entity getEntity() {
/*      */                 try {
/* 1098 */                   return EntityArgument.m_91452_(arguments, "player");
/* 1099 */                 } catch (CommandSyntaxException e) {
/* 1100 */                   e.printStackTrace();
/* 1101 */                   return null;
/*      */                 } 
/*      */               }
/* 1104 */             }).getEntity().getCapability(KsmpStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
/*      */                 capability.LUCK = _setval;
/*      */                 capability.syncPlayerVariables((new Object() {
/*      */                       public Entity getEntity() {
/*      */                         try {
/* 1109 */                           return EntityArgument.m_91452_(arguments, "player");
/* 1110 */                         } catch (CommandSyntaxException e) {
/* 1111 */                           e.printStackTrace();
/* 1112 */                           return null;
/*      */                         } 
/*      */                       }
/*      */                     }).getEntity());
/*      */               });
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1121 */     OnCommandProcedure.execute(arguments);
/*      */   }
/*      */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\procedures\ChangestatsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */