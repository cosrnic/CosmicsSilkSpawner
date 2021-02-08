package me.cosmic.cosmicssilkspawners.utils;

import org.bukkit.ChatColor;

public class Utils {
    // only used for startup/shutdown - allows colour codes to be used
    public static String chat (String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
