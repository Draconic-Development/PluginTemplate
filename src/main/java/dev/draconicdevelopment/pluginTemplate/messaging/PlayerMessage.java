package dev.draconicdevelopment.pluginTemplate.messaging;

import dev.draconicdevelopment.pluginTemplate.PluginTemplate;
import dev.draconicdevelopment.pluginTemplate.utils.HexUtils;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class PlayerMessage {

    public static  void sendMessageWithoutConfig(Player player, String key) {
        String message = PluginTemplate.getInstance().messageFormat(key);
        player.sendMessage(message);
    }

    public static void sendMessage(Player player, String key) {
        File messagesConfig = new File(PluginTemplate.getInstance().getDataFolder(), "messages.yml");
        YamlConfiguration configMessages = YamlConfiguration.loadConfiguration(messagesConfig);
        String message = configMessages.getString("Messages.Prefix") + configMessages.getString("Messages." + key);
        player.sendMessage(HexUtils.colorify(message));
    }

    public static void sendMessageWithTarget(Player player, String key, String target) {
        File messagesConfig = new File((PluginTemplate.getInstance().getDataFolder()), "messages.yml");
        YamlConfiguration configMessages = YamlConfiguration.loadConfiguration(messagesConfig);
        String message = configMessages.getString("Messages.Prefix") + configMessages.getString("Messages." + key) + target;
        player.sendMessage(HexUtils.colorify(message));
    }


}
