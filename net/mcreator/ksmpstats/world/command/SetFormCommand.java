/*    */ package net.mcreator.ksmpstats.command;
/*    */ 
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import net.mcreator.ksmpstats.procedures.SetFormProcedureProcedure;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.commands.Commands;
/*    */ import net.minecraft.commands.arguments.EntityArgument;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.common.util.FakePlayer;
/*    */ import net.minecraftforge.common.util.FakePlayerFactory;
/*    */ import net.minecraftforge.event.RegisterCommandsEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class SetFormCommand {
/*    */   @SubscribeEvent
/*    */   public static void registerCommand(RegisterCommandsEvent event) {
/* 26 */     event.getDispatcher()
/* 27 */       .register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.m_82127_("statsform").requires(s -> s.m_6761_(3)))
/* 28 */         .then(Commands.m_82129_("player", (ArgumentType)EntityArgument.m_91466_()).then(Commands.m_82129_("form", (ArgumentType)StringArgumentType.word())
/* 29 */             .then(Commands.m_82129_("true_false", (ArgumentType)BoolArgumentType.bool()).executes(arguments -> {
/*    */                   FakePlayer fakePlayer;
/*    */                   ServerLevel world = ((CommandSourceStack)arguments.getSource()).m_81372_();
/*    */                   double x = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7096_();
/*    */                   double y = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7098_();
/*    */                   double z = ((CommandSourceStack)arguments.getSource()).m_81371_().m_7094_();
/*    */                   Entity entity = ((CommandSourceStack)arguments.getSource()).m_81373_();
/*    */                   if (entity == null)
/*    */                     fakePlayer = FakePlayerFactory.getMinecraft(world); 
/*    */                   Direction direction = fakePlayer.m_6350_();
/*    */                   SetFormProcedureProcedure.execute(arguments);
/*    */                   return 0;
/*    */                 })))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrador\curseforge\minecraft\Instances\Brazil Kingdom SMP\mods\KSMP-Statsv1.2.1.jar!\net\mcreator\ksmpstats\command\SetFormCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */