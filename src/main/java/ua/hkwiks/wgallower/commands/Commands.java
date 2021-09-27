package ua.hkwiks.wgallower.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ua.hkwiks.wgallower.WGAllower;
import ua.hkwiks.wgallower.utils.Utils;

import java.util.HashMap;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            String prefix = Utils.getPrefix();
            if(label.equals("allowerinfo")){
                if(sender instanceof Player){
                    if(sender.isOp()) {
                        sender.sendMessage(Utils.format(prefix + "Кликните ПКМ по блоку."));
                        Player player = (Player) sender;
                        WGAllower.getInstance().playerHashMap.put(player, player);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
