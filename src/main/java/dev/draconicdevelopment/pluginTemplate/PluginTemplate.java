package dev.draconicdevelopment.pluginTemplate;

import dev.draconicdevelopment.pluginTemplate.commands.ExampleCommand;
import dev.draconicdevelopment.pluginTemplate.commands.TabComplete;
import dev.draconicdevelopment.pluginTemplate.configs.ConfigEnum;
import dev.draconicdevelopment.pluginTemplate.utils.HexUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

    //TODO: Make sure you change the class name for the specific plugin.
    private static PluginTemplate INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(messageFormat("&2Enabled"));

        // Config loader
        ConfigEnum.MESSAGES.create();
        saveDefaultConfig();

        // Event register


        // Command register
        registerCommands();


        // API Check
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(messageFormat("&4Disabled"));
    }

    //TODO: Change this to reflect the plugin prefix
    public String messageFormat(String key) {
        return HexUtils.colorify("#ffffff[<g:#fc1c03:#fc7f03>Plugin Template#ffffff] #f6ff00> &r" + key);
    }

    public static PluginTemplate getInstance() {
        return INSTANCE;
    }

    private void registerCommands() {
        new ExampleCommand(this);
        new TabComplete();
    }

}
