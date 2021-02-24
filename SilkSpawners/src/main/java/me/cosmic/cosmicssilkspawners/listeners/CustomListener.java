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
        CreatureSpawner cs = (CreatureSpawner) e.getSpawner().getState();//just makes it easier to find the spawner

        //create a new spawner and set its entity type for the player to have
        ItemStack spawner_to_give = new ItemStack(Material.SPAWNER);//sets a variable to give a spawner
        BlockStateMeta meta = (BlockStateMeta) spawner_to_give.getItemMeta();//sets meta to the spawner
        CreatureSpawner css = (CreatureSpawner) meta.getBlockState();//checks the blockstate


        css.setSpawnedType(cs.getSpawnedType());//checks what mob gets spawned
        meta.setBlockState(css);//adds the spawned type
        meta.setDisplayName("[" + css.getCreatureTypeName() + "] Spawner");//sets the name of the meta
        spawner_to_give.setItemMeta(meta);//applies the meta value to the spawner

        e.getBreaker().getInventory().addItem(spawner_to_give);//adds to the inventory



    }
}
