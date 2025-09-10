package dev.draconicdevelopment.pluginTemplate.commands;

import dev.draconicdevelopment.pluginTemplate.PluginTemplate;
import dev.draconicdevelopment.pluginTemplate.messaging.ConsoleMessage;
import dev.draconicdevelopment.pluginTemplate.messaging.PlayerMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleCommand implements CommandExecutor {

    private final PluginTemplate plugin;
    // TEsting github

    //TODO: Change this executor to match the command used
    public ExampleCommand(PluginTemplate plugin) {
        this.plugin = plugin;
        plugin.getCommand("Example").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            ConsoleMessage.sendMessage(sender, "Player-Only");
            return false;
        }

        if (args.length == 0) {
            PlayerMessage.sendMessage(player, "Example Command Ran");
            return false;
        }


        return false;
    }



}
