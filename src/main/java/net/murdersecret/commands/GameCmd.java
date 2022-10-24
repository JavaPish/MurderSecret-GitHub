package net.murdersecret.commands;

import net.murdersecret.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GameCmd implements CommandExecutor {

    Plugin plugin;
    public GameCmd(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        //Variables
        Player player = (Player) sender;

        //Checks
        if (!player.isOp()) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.pluginDisplayName + "У вас нет прав на выполнение данной команды."));
            return true;
        }
        if (args.length != 1) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.pluginDisplayName + "Неверное количество аргументов."));
            return true;
        }

        //Sub-Commands
        if (args[0].equals("start")) {
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&',plugin.pluginDisplayName + "Игра начинается..."));
            return true;
        }

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.pluginDisplayName + "Не найдено условий совпадающих с вашими."));
        return true;
    }
}
