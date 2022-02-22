package me;

import org.bukkit.plugin.java.JavaPlugin;

public final class Paqlio extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EmojiListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
