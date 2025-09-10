package dev.draconicdevelopment.pluginTemplate.configs;

import dev.draconicdevelopment.pluginTemplate.PluginTemplate;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public enum ConfigEnum {

    MESSAGES;

    private final File file;
    private FileConfiguration configuration;

    ConfigEnum() {
        this.file = new File(PluginTemplate.getInstance().getDataFolder(), this.toString().toUpperCase(Locale.ROOT) + ".yml");
    }

    public File getFile() {
        return file;
    }

    public void reload() {
        configuration = null;
    }

    public FileConfiguration get() {
        if (configuration == null) {
            configuration = YamlConfiguration.loadConfiguration(file);
        }
        return configuration;
    }

    public void save() {
        if (configuration == null) return;
        try {
            configuration.save(file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void create() {
        PluginTemplate.getInstance().saveResource(this.toString().toLowerCase(Locale.ROOT) + ".yml", false);
    }

    public static void reloadAll() {
        for (ConfigEnum value : values()) {
            value.reload();
        }
    }


}
