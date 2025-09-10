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
