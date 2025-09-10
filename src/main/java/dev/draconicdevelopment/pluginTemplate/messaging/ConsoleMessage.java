package dev.draconicdevelopment.pluginTemplate.messaging;

import dev.draconicdevelopment.pluginTemplate.PluginTemplate;
import dev.draconicdevelopment.pluginTemplate.utils.HexUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ConsoleMessage {

    public static void sendMessageWithoutConfig(CommandSender sender, String key) {
        String message = PluginTemplate.getInstance().messageFormat(key);
        sender.sendMessage(message);
    }

    public static void sendMessage(CommandSender sender, String key) {
        File messagesConfig = new File(PluginTemplate.getInstance().getDataFolder(), "messages.yml");
        YamlConfiguration configMessages = YamlConfiguration.loadConfiguration(messagesConfig);
        String message = configMessages.getString("Messages.Prefix") + configMessages.getString("Messages." + key);
        sender.sendMessage(HexUtils.colorify(message));
    }

}
