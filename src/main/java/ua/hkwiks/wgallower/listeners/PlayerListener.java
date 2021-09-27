package ua.hkwiks.wgallower.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import ua.hkwiks.wgallower.WGAllower;

public class PlayerListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        if(WGAllower.getInstance().playerHashMap.containsKey(player)){
            WGAllower.getInstance().playerHashMap.remove(player);
        } else {
            return;
        }
    }
}
