package fr.devsylone.fallenkingdom.commands.brigadier;

import com.mojang.brigadier.arguments.*;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import fr.devsylone.fallenkingdom.commands.abstraction.Argument;
import fr.devsylone.fallenkingdom.commands.abstraction.IntegerArgument;
import fr.devsylone.fallenkingdom.utils.Messages;

import org.bukkit.NamespacedKey;

class ArgumentTypeBuilder
{
    /**
     * Traduit un argument du plugin en argument Brigadier
     * @param arg Argument Fk
     * @param <S> Type de l'argument
     * @return Argument Brigadier
     */
    public static <S> RequiredArgumentBuilder<S, ?> getFromArg(Argument<?> arg) {
        ArgumentType<?> argumentType;
        switch (arg.getName()) {
            case "block":
                argumentType = MinecraftArgumentTypes.getByKey(NamespacedKey.minecraft("block_state"));
                break;
            case "text":
                argumentType = StringArgumentType.greedyString();
                break;
            case "advancement":
                argumentType = MinecraftArgumentTypes.getByKey(NamespacedKey.minecraft("resource_location"));
                break;
            case "color":
                argumentType = MinecraftArgumentTypes.getByKey(NamespacedKey.minecraft("function")); // Type le plus proche autorisant le #
                break;
            case "entity":
            case "player":
                argumentType = MinecraftArgumentTypes.constructMinecraftArgumentType(NamespacedKey.minecraft("entity"), new Class[]{boolean.class, boolean.class}, false, "player".equals(arg.getName()));
                break;
            default:
                argumentType = getArgumentType(arg);
        }
        return RequiredArgumentBuilder.argument(arg.getName(), argumentType);
    }

    /**
     * Choisit le type d'argument Brigadier le plus approprié pour l'argument Fk donné
     * @param arg Argument Fk
     * @return Type d'argument Brigadier
     */
    private static ArgumentType<?> getArgumentType(Argument<?> arg) {
        switch (arg.getType().getSimpleName()) {
            case "int":
                if (!(arg instanceof IntegerArgument))
                    throw new RuntimeException(arg.getName() + " " + Messages.CMD_ERROR_ARGUMENT_MUST_CONTAIN_INTEGER.getMessage());
                IntegerArgument intArg = (IntegerArgument) arg;
                return IntegerArgumentType.integer(intArg.getMinimum(), intArg.getMaximum());
            case "double":
                return DoubleArgumentType.doubleArg();
            case "boolean":
                return BoolArgumentType.bool();
            default:
                return StringArgumentType.string();
        }
    }
}
