<p align="center">
  <img src="https://i.ibb.co/Y7g37mNq/Draconic-Plugin-Template-Banner-2x.png" width="600" alt="Draconic Development Banner"/>
</p>

<h1 align="center">🔥 Draconic Development Plugin Template 🔥</h1>
<p align="center">
  <em>Plugins that just work — simple, powerful, all-in-one.</em>
</p>

<p align="center">
  <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-17+-red.svg" alt="Java 17+"></a>
  <a href="https://www.spigotmc.org/"><img src="https://img.shields.io/badge/Spigot-1.20+-orange.svg" alt="Spigot 1.20+"></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License"></a>
  <a href="https://discord.gg/YOURDISCORD"><img src="https://img.shields.io/discord/000000000000?logo=discord&logoColor=white&label=Discord&color=5865F2" alt="Join our Discord"></a>
</p>

---

## 📂 About This Template
This repository provides a clean **template for creating new Draconic Development plugins** without having to worry about writing all the boilerplate code.

---

## 🛠 Files to Modify
These are the files you’ll need to update when creating a new plugin:

- **`build.gradle`** → Update `archiveFilename` and `destinationDirectory`.  
- **`build.properties`** → Update `spigotVersion` and `java` version.  
- **`src/main/draconicDevelopment/PluginTemplate`** → Rename this package to your plugin’s name.  
- **`src/main/draconicDevelopment/PluginTemplate.class`** → Update plugin instance name.  
- **`ExampleCommand`** → Add or change commands. Register in `plugin.yml`.  
- **`TabComplete`** → Add subcommands (example included).  
- **`events/` package** → Add event classes and register them.  
- **`plugin.yml`** → Update name, description, main class, commands, dependencies.  
- **`messages.yml` / `config.yml`** → Update plugin name references.  

> Example dependencies in `plugin.yml`:
> ```yaml
> softdepend:
>   - PlaceholderAPI
> depend:
>   - Vault
> ```

---

## 💬 Support
Need help? Join our **[Discord server](https://discord.gg/YOURDISCORD)** where we provide direct support for all Draconic Development plugins.  

---

<p align="center">
  <sub>© 2025 Draconic Development — Plugins that just work.</sub>
</p>
