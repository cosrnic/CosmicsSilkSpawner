package me.cosmic.cosmicssilkspawners.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SpawnerBreakEvent extends Event {

    public static final HandlerList handlers = new HandlerList();

    Player breaker;
    Block spawner;

    public SpawnerBreakEvent(Player breaker, Block spawner) {
        this.breaker = breaker;
        this.spawner = spawner;
    }

    public Player getBreaker() {
        return breaker;
    }

    public Block getSpawner() {
        return spawner;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList(){
        return handlers;
    }
}
