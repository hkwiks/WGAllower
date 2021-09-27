package ua.hkwiks.wgallower;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import ua.hkwiks.wgallower.commands.Commands;
import ua.hkwiks.wgallower.listeners.BlockInteractListener;
import ua.hkwiks.wgallower.listeners.PlayerListener;

import java.util.HashMap;

public final class WGAllower extends JavaPlugin {

    private static WGAllower instance;
    public HashMap<Player, Player> playerHashMap = new HashMap<>();
    @Override
    public void onEnable() {
        instance = this;
        getCommand("allowerinfo").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new BlockInteractListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static WGAllower getInstance() {
        return instance;
    }
}
