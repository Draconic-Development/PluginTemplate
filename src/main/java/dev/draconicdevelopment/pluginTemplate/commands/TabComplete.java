package dev.draconicdevelopment.pluginTemplate.commands;

import dev.draconicdevelopment.pluginTemplate.PluginTemplate;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabComplete implements TabCompleter {

    //TODO: Change this to match the actual command used
    public TabComplete() {
        PluginTemplate.getInstance().getCommand("Example").setTabCompleter(this);
    }

    List<String> arguments = new ArrayList<>();

    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (arguments.isEmpty()) {
            //TODO: Change this to add examples of different arguments
            arguments.add("Example");
        }

        List<String> result = new ArrayList<>();
        if (args.length == 1) {
            for (String string : arguments) {
                if (string.toLowerCase().startsWith(args[0].toLowerCase())) {
                    result.add(string);
                }
            }
            return result;
        }
        arguments.clear();

        // If you need to add more suggestions for things such as sub commands or players you can check args here.
        // EXAMPLE:
        //if (args.length > 1) {
        //    if (args[1].equalsIgnoreCase("Admin")) {
        //        Player target = Bukkit.getPlayer(args[2]);
        //        if (target == null) return null;
        //        arguments.add(target.getName());
        //        for (String s : arguments) {
        //            if (s.toLowerCase().startsWith(args[2].toLowerCase())) result.add(s);
        //        }
        //        return result;
        //    }

        //    if (args.length == 2) return null;
        //    Player target = Bukkit.getPlayer(args[1]);
        //    if (target == null) return null;
        //    if (args[1].equalsIgnoreCase(target.getName())) {
        //        arguments.add("ListActive");
        //        arguments.add("ForceRemove");
        //        arguments.add("Recover");
        //        for (String s : arguments) {
        //            if (s.toLowerCase().startsWith(args[2].toLowerCase())) result.add(s);
        //        }
        //        arguments.clear();
        //        return result;
        //    }
        //    arguments.clear();
        //}



        return null;
    }


}
