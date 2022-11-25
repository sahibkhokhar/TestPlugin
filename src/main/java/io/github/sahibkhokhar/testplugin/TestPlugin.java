package io.github.sahibkhokhar.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("freediamonds").setExecutor(new CommandFakeDiamond());
        this.getCommand("garfield").setExecutor(new CommandGarfield());
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
