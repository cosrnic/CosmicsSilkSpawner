package me.cosmic.cosmicssilkspawners;

import me.cosmic.cosmicssilkspawners.listeners.BlockBreakListener;
import me.cosmic.cosmicssilkspawners.listeners.CustomListener;
import me.cosmic.cosmicssilkspawners.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class CosmicsSilkSpawners extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(Utils.chat("&bCSSpawners &7>> &aPlugin Enabled!"));//prints enabled message to console
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);//lets the plugin read this file
        getServer().getPluginManager().registerEvents(new CustomListener(), this);//lets the plugin read this file

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(Utils.chat("&bCSSpawners &7>> &cPlugin Disabled!"));//prints disabled message to console
    }
}
