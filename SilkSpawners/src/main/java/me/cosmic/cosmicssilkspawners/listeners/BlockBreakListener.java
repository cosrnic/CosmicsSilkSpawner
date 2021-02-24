package me.cosmic.cosmicssilkspawners.listeners;

import me.cosmic.cosmicssilkspawners.events.SpawnerBreakEvent;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Block blockBroken = e.getBlock();//Checks what block gets broken
        if (blockBroken.getType().equals(Material.SPAWNER) && e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH) && e.getPlayer().hasPermission("csspawner.silk")){//checks if player has the enchant, has permission and the broken block is a spawner
            Bukkit.getServer().getPluginManager().callEvent(new SpawnerBreakEvent(e.getPlayer(), blockBroken));//calls an event to drop the spawner type
        }

    }
}
