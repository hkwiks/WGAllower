package ua.hkwiks.wgallower.utils;

import org.bukkit.ChatColor;

public class Utils {

    public static String prefix = "&a[WGAllower] ";

    public static String format(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String getPrefix(){
        return prefix;
    }
}
