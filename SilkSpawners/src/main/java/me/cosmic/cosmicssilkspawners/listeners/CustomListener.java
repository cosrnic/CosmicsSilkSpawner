package me.cosmic.cosmicssilkspawners.listeners;

import me.cosmic.cosmicssilkspawners.events.SpawnerBreakEvent;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

public class CustomListener implements Listener {

    @EventHandler
    public void onSpawnerBreakEvent(SpawnerBreakEvent e){
        CreatureSpawner cs = (CreatureSpawner) e.getSpawner().getState();

        //create a new spawner and set its entity type for the player to have
        ItemStack spawner_to_give = new ItemStack(Material.SPAWNER);
        BlockStateMeta meta = (BlockStateMeta) spawner_to_give.getItemMeta();
        CreatureSpawner css = (CreatureSpawner) meta.getBlockState();


        css.setSpawnedType(cs.getSpawnedType());
        meta.setBlockState(css);
        meta.setDisplayName("[" + css.getCreatureTypeName() + "] Spawner");
        spawner_to_give.setItemMeta(meta);

        e.getBreaker().getInventory().addItem(spawner_to_give);



    }
}
