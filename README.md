# Draconic Development Plugin Template
## This is a template repository for creating new Draconic Development plugins without having to worry about writing all the boilerplate code.

Files to Modify
These are all the files that should be modified when creating a new plugin from this template.

- build.gradle - Change archiveFilename to the name of your plugin, and change the destinationDirectory to where you want the plugin jar to be output.

- build.properties - Change spigotVersion and java to the versions of the dependencies you want to use.

- src/main/draconicDevelopment/PluginTemplate - Change this to the name of your plugin and refactor all.

- src/main/draconicDevelopment/PluginTemplate.class - Make sure the plugin instance matches your plugin's name.

- src/main/draconicDevelopment/PluginTemplate/ExampleCommand - Change this to be what you want your command to be, add more classes here for commands, and ensure you register them in the plugin.yml

- src/main/draconicDevelopment/PluginTemplate/TabComplete - Add in your commands and sub commands to this class. (See example in the class)

- src/main/draconicDevelopment/PluginTemplate/events - Add in any event classes into this package, and make sure you register them in your plugins main class.

- src/main/resources/plugin.yml - Change name, description, commands, etc. and main class path to fit your plugin value.

- src/main/resources/messages.yml - Change the top of this to match the plugin name.

- src/main/resources/config.yml - Change the top of this to match the plugin name.

- src/main/resources/plugin.yml - Add any api's that your plugin soft depends or hard depends on here under the plugin description.
- 
> Example:
> softdepend:
> - PlaceholderAPI

> Example:
> depend:
> - Vault

Support
If there's anything I have left out, or anything else, please join our Discord server. We offer any and all support in our server.


New Layout
---


<p align="center">
  <img src="https://i.ibb.co/Y7g37mNq/Draconic-Plugin-Template-Banner-2x.png" width="600" alt="Draconic Development Banner"/>
</p>

<h1 align="center">🔥 Draconic Development Plugin Template 🔥</h1>
<p align="center">
  <em>Plugins that just work — simple, powerful, all-in-one.</em>
</p>

<p align="center">
  <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-17+-red.svg" alt="Java 17+">#</a>
  <a href="https://www.spigotmc.org/"><img src="https://img.shields.io/badge/Spigot-1.20+-orange.svg" alt="Spigot 1.20+">#</a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">#</a>
  <a href="https://discord.gg/YOURDISCORD"><img src="https://img.shields.io/discord/000000000000?logo=discord&logoColor=white&label=Discord&color=5865F2" alt="Join our Discord">#</a>
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
