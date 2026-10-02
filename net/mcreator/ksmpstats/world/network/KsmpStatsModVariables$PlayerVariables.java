/*     */ package net.mcreator.ksmpstats.network;
/*     */ 
/*     */ import net.mcreator.ksmpstats.KsmpStatsMod;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.nbt.Tag;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraftforge.network.PacketDistributor;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlayerVariables
/*     */ {
/* 322 */   public double VIDA = 0.0D;
/* 323 */   public double STR = 0.0D;
/* 324 */   public double LUCK = 0.0D;
/* 325 */   public double END = 0.0D;
/* 326 */   public double MANA = 0.0D;
/* 327 */   public double LVL = 0.0D;
/* 328 */   public double INTE = 0.0D;
/* 329 */   public double FAITH = 0.0D;
/* 330 */   public double DEX = 0.0D;
/* 331 */   public double ARC = 0.0D;
/* 332 */   public double ATRPOINT = 0.0D;
/* 333 */   public double XP = 0.0D;
/* 334 */   public double NEEDXP = 10.0D;
/* 335 */   public double currantMaxHP = 0.0D;
/* 336 */   public double currentMaxMana = 0.0D;
/* 337 */   public double currentSpellResis = 0.0D;
/* 338 */   public double currantArmor = 0.0D;
/* 339 */   public double currentToughness = 0.0D;
/* 340 */   public double extraSpellPow = 0.0D;
/* 341 */   public double currentDamage = 0.0D;
/* 342 */   public double currentAttSpd = 0.0D;
/* 343 */   public double currentSpd = 0.0D;
/* 344 */   public double currentFirePow = 0.0D;
/* 345 */   public double currentIcePow = 0.0D;
/* 346 */   public double currentLightPow = 0.0D;
/* 347 */   public double currentPsnPow = 0.0D;
/* 348 */   public double currentHolyPow = 0.0D;
/* 349 */   public double currentEndPow = 0.0D;
/* 350 */   public double currentBldPow = 0.0D;
/* 351 */   public double currentEvoPow = 0.0D;
/* 352 */   public double cooldown = 0.0D;
/* 353 */   public double casttime = 0.0D;
/* 354 */   public double currentLuck = 0.0D;
/* 355 */   public double STRmult = 1.0D;
/* 356 */   public double VITmult = 1.0D;
/* 357 */   public double MANAmult = 1.0D;
/* 358 */   public double ENDmult = 1.0D;
/* 359 */   public double DEXmult = 1.0D;
/* 360 */   public double INTmult = 1.0D;
/* 361 */   public double LCKmult = 1.0D;
/*     */   public boolean IsFormActive = false;
/*     */   public boolean IsMage = false;
/*     */   public boolean IsAssass = false;
/*     */   public boolean IsWarrior = false;
/*     */   public boolean IsShield = false;
/*     */   public boolean IsSorcerer = false;
/*     */   public boolean HasPower = false;
/* 369 */   public double EffectAdd = 1.0D;
/* 370 */   public double VITAdd = 0.0D;
/* 371 */   public double ENDAdd = 0.0D;
/* 372 */   public double MANAAdd = 0.0D;
/* 373 */   public double STRAdd = 0.0D;
/* 374 */   public double DEXAdd = 0.0D;
/* 375 */   public double INTAdd = 0.0D;
/* 376 */   public double LCKAdd = 0.0D;
/* 377 */   public double VITTotal = 0.0D;
/* 378 */   public double MANATotal = 0.0D;
/* 379 */   public double ENDTotal = 0.0D;
/* 380 */   public double STRTotal = 0.0D;
/* 381 */   public double DEXTotal = 0.0D;
/* 382 */   public double INTTotal = 0.0D;
/* 383 */   public double LUCKTotal = 0.0D;
/*     */   
/*     */   public void syncPlayerVariables(Entity entity) {
/* 386 */     if (entity instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)entity;
/* 387 */       KsmpStatsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new KsmpStatsModVariables.PlayerVariablesSyncMessage(this)); }
/*     */   
/*     */   }
/*     */   public Tag writeNBT() {
/* 391 */     CompoundTag nbt = new CompoundTag();
/* 392 */     nbt.m_128347_("VIDA", this.VIDA);
/* 393 */     nbt.m_128347_("STR", this.STR);
/* 394 */     nbt.m_128347_("LUCK", this.LUCK);
/* 395 */     nbt.m_128347_("END", this.END);
/* 396 */     nbt.m_128347_("MANA", this.MANA);
/* 397 */     nbt.m_128347_("LVL", this.LVL);
/* 398 */     nbt.m_128347_("INTE", this.INTE);
/* 399 */     nbt.m_128347_("FAITH", this.FAITH);
/* 400 */     nbt.m_128347_("DEX", this.DEX);
/* 401 */     nbt.m_128347_("ARC", this.ARC);
/* 402 */     nbt.m_128347_("ATRPOINT", this.ATRPOINT);
/* 403 */     nbt.m_128347_("XP", this.XP);
/* 404 */     nbt.m_128347_("NEEDXP", this.NEEDXP);
/* 405 */     nbt.m_128347_("currantMaxHP", this.currantMaxHP);
/* 406 */     nbt.m_128347_("currentMaxMana", this.currentMaxMana);
/* 407 */     nbt.m_128347_("currentSpellResis", this.currentSpellResis);
/* 408 */     nbt.m_128347_("currantArmor", this.currantArmor);
/* 409 */     nbt.m_128347_("currentToughness", this.currentToughness);
/* 410 */     nbt.m_128347_("extraSpellPow", this.extraSpellPow);
/* 411 */     nbt.m_128347_("currentDamage", this.currentDamage);
/* 412 */     nbt.m_128347_("currentAttSpd", this.currentAttSpd);
/* 413 */     nbt.m_128347_("currentSpd", this.currentSpd);
/* 414 */     nbt.m_128347_("currentFirePow", this.currentFirePow);
/* 415 */     nbt.m_128347_("currentIcePow", this.currentIcePow);
/* 416 */     nbt.m_128347_("currentLightPow", this.currentLightPow);
/* 417 */     nbt.m_128347_("currentPsnPow", this.currentPsnPow);
/* 418 */     nbt.m_128347_("currentHolyPow", this.currentHolyPow);
/* 419 */     nbt.m_128347_("currentEndPow", this.currentEndPow);
/* 420 */     nbt.m_128347_("currentBldPow", this.currentBldPow);
/* 421 */     nbt.m_128347_("currentEvoPow", this.currentEvoPow);
/* 422 */     nbt.m_128347_("cooldown", this.cooldown);
/* 423 */     nbt.m_128347_("casttime", this.casttime);
/* 424 */     nbt.m_128347_("currentLuck", this.currentLuck);
/* 425 */     nbt.m_128347_("STRmult", this.STRmult);
/* 426 */     nbt.m_128347_("VITmult", this.VITmult);
/* 427 */     nbt.m_128347_("MANAmult", this.MANAmult);
/* 428 */     nbt.m_128347_("ENDmult", this.ENDmult);
/* 429 */     nbt.m_128347_("DEXmult", this.DEXmult);
/* 430 */     nbt.m_128347_("INTmult", this.INTmult);
/* 431 */     nbt.m_128347_("LCKmult", this.LCKmult);
/* 432 */     nbt.m_128379_("IsFormActive", this.IsFormActive);
/* 433 */     nbt.m_128379_("IsMage", this.IsMage);
/* 434 */     nbt.m_128379_("IsAssass", this.IsAssass);
/* 435 */     nbt.m_128379_("IsWarrior", this.IsWarrior);
/* 436 */     nbt.m_128379_("IsShield", this.IsShield);
/* 437 */     nbt.m_128379_("IsSorcerer", this.IsSorcerer);
/* 438 */     nbt.m_128379_("HasPower", this.HasPower);
/* 439 */     nbt.m_128347_("EffectAdd", this.EffectAdd);
/* 440 */     nbt.m_128347_("VITAdd", this.VITAdd);
/* 441 */     nbt.m_128347_("ENDAdd", this.ENDAdd);
/* 442 */     nbt.m_128347_("MANAAdd", this.MANAAdd);
/* 443 */     nbt.m_128347_("STRAdd", this.STRAdd);
/* 444 */     nbt.m_128347_("DEXAdd", this.DEXAdd);
/* 445 */     nbt.m_128347_("INTAdd", this.INTAdd);
/* 446 */     nbt.m_128347_("LCKAdd", this.LCKAdd);
/* 447 */     nbt.m_128347_("VITTotal", this.VITTotal);
/* 448 */     nbt.m_128347_("MANATotal", this.MANATotal);
/* 449 */     nbt.m_128347_("ENDTotal", this.ENDTotal);
/* 450 */     nbt.m_128347_("STRTotal", this.STRTotal);
/* 451 */     nbt.m_128347_("DEXTotal", this.DEXTotal);
/* 452 */     nbt.m_128347_("INTTotal", this.INTTotal);
/* 453 */     nbt.m_128347_("LUCKTotal", this.LUCKTotal);
/* 454 */     return (Tag)nbt;
/*     */   }
/*     */   
/*     */   public void readNBT(Tag tag) {
/* 458 */     CompoundTag nbt = (CompoundTag)tag;
/* 459 */     this.VIDA = nbt.m_128459_("VIDA");
/* 460 */     this.STR = nbt.m_128459_("STR");
/* 461 */     this.LUCK = nbt.m_128459_("LUCK");
/* 462 */     this.END = nbt.m_128459_("END");
/* 463 */     this.MANA = nbt.m_128459_("MANA");
/* 464 */     this.LVL = nbt.m_128459_("LVL");
/* 465 */     this.INTE = nbt.m_128459_("INTE");
/* 466 */     this.FAITH = nbt.m_128459_("FAITH");
/* 467 */     this.DEX = nbt.m_128459_("DEX");
/* 468 */     this.ARC = nbt.m_128459_("ARC");
/* 469 */     this.ATRPOINT = nbt.m_128459_("ATRPOINT");
/* 470 */     this.XP = nbt.m_128459_("XP");
/* 471 */     this.NEEDXP = nbt.m_128459_("NEEDXP");
/* 472 */     this.currantMaxHP = nbt.m_128459_("currantMaxHP");
/* 473 */     this.currentMaxMana = nbt.m_128459_("currentMaxMana");
/* 474 */     this.currentSpellResis = nbt.m_128459_("currentSpellResis");
/* 475 */     this.currantArmor = nbt.m_128459_("currantArmor");
/* 476 */     this.currentToughness = nbt.m_128459_("currentToughness");
/* 477 */     this.extraSpellPow = nbt.m_128459_("extraSpellPow");
/* 478 */     this.currentDamage = nbt.m_128459_("currentDamage");
/* 479 */     this.currentAttSpd = nbt.m_128459_("currentAttSpd");
/* 480 */     this.currentSpd = nbt.m_128459_("currentSpd");
/* 481 */     this.currentFirePow = nbt.m_128459_("currentFirePow");
/* 482 */     this.currentIcePow = nbt.m_128459_("currentIcePow");
/* 483 */     this.currentLightPow = nbt.m_128459_("currentLightPow");
/* 484 */     this.currentPsnPow = nbt.m_128459_("currentPsnPow");
/* 485 */     this.currentHolyPow = nbt.m_128459_("currentHolyPow");
/* 486 */     this.currentEndPow = nbt.m_128459_("currentEndPow");
/* 487 */     this.currentBldPow = nbt.m_128459_("currentBldPow");
/* 488 */     this.currentEvoPow = nbt.m_128459_("currentEvoPow");
/* 489 */     this.cooldown = nbt.m_128459_("cooldown");
/* 490 */     this.casttime = nbt.m_128459_("casttime");
/* 491 */     this.currentLuck = nbt.m_128459_("currentLuck");
/* 492 */     this.STRmult = nbt.m_128459_("STRmult");
/* 493 */     this.VITmult = nbt.m_128459_("VITmult");
/* 494 */     this.MANAmult = nbt.m_128459_("MANAmult");
/* 495 */     this.ENDmult = nbt.m_128459_("ENDmult");
/* 496 */     this.DEXmult = nbt.m_128459_("DEXmult");
/* 497 */     this.INTmult = nbt.m_128459_("INTmult");
/* 498 */     this.LCKmult = nbt.m_128459_("LCKmult");
/* 499 */     this.IsFormActive = nbt.m_128471_("IsFormActive");
/* 500 */     this.IsMage = nbt.m_128471_("IsMage");
/* 501 */     this.IsAssass = nbt.m_128471_("IsAssass");
/* 502 */     this.IsWarrior = nbt.m_128471_("IsWarrior");
/* 503 */     this.IsShield = nbt.m_128471_("IsShield");
/* 504 */     this.IsSorcerer = nbt.m_128471_("IsSorcerer");
/* 505 */     this.HasPower = nbt.m_128471_("HasPower");
/* 506 */     this.EffectAdd = nbt.m_128459_("EffectAdd");
/* 507 */     this.VITAdd = nbt.m_128459_("VITAdd");
/* 508 */     this.ENDAdd = nbt.m_128459_("ENDAdd");
/* 509 */     this.MANAAdd = nbt.m_128459_("MANAAdd");
/* 510 */     this.STRAdd = nbt.m_128459_("STRAdd");
/* 511 */     this.DEXAdd = nbt.m_128459_("DEXAdd");
/* 512 */     this.INTAdd = nbt.m_128459_("INTAdd");
/* 513 */     this.LCKAdd = nbt.m_128459_("LCKAdd");
/* 514 */     this.VITTotal = nbt.m_128459_("VITTotal");
/* 515 */     this.MANATotal = nbt.m_128459_("MANATotal");
/* 516 */     this.ENDTotal = nbt.m_128459_("ENDTotal");
/* 517 */     this.STRTotal = nbt.m_128459_("STRTotal");
/* 518 */     this.DEXTotal = nbt.m_128459_("DEXTotal");
/* 519 */     this.INTTotal = nbt.m_128459_("INTTotal");
/* 520 */     this.LUCKTotal = nbt.m_128459_("LUCKTotal");
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\network\KsmpStatsModVariables$PlayerVariables.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */