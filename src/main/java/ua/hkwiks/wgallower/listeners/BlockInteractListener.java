package ua.hkwiks.wgallower.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import ua.hkwiks.wgallower.WGAllower;
import ua.hkwiks.wgallower.utils.Utils;

public class BlockInteractListener implements Listener {

    @EventHandler
    public void onBlockInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        String prefix = Utils.getPrefix();
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if(WGAllower.getInstance().playerHashMap.containsKey(player)){
                player.sendMessage(Utils.format(prefix + event.getClickedBlock().getType() + ":" + event.getClickedBlock().getData()));
            } else {
                return;
            }
        }

    }
}
