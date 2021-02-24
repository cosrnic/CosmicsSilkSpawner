package me.cosmic.cosmicssilkspawners.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SpawnerBreakEvent extends Event {

    public static final HandlerList handlers = new HandlerList();

    Player breaker;//faster to type
    Block spawner;//faster to type

    public SpawnerBreakEvent(Player breaker, Block spawner) {
        this.breaker = breaker;//just implements from above
        this.spawner = spawner;//just implements from above
    }

    public Player getBreaker() {
        return breaker;//check if its a player and returns breaker
    }

    public Block getSpawner() {
        return spawner;//checks what block and returns spawner
    }

    public HandlerList getHandlers() {
        return handlers;//just grabs handlers
    }
    public static HandlerList getHandlerList(){
        return handlers;//checks if they are all there
    }
}
