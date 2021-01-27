package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class vanish implements CommandExecutor {

    ArrayList<Player> vanished = new ArrayList<Player>();

    String vanish = "vanish";
    String unvanish = "unvanish";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        Player p = (Player) sender;

        main plugin = (main)main.getPlugin(main.class);


            if(p.hasPermission("xengine.vanish")) {

                if(args.length == 0) {

                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("vanish-wrong-usage"));
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("vanish-usage"));
                    p.sendMessage(" ");

                } else {

                    Player t = Bukkit.getPlayerExact(args[0]);

                    if(t == null) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("vanish-offline-player"));
                        p.sendMessage(" ");
                    } else {

                        if(cmd.getName().equalsIgnoreCase("vanish")) {

                            if(vanished.contains(t)) {
                                for (Player online : Bukkit.getOnlinePlayers()) {
                                    vanished.remove(t);
                                    online.showPlayer(t);
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("vanish-successfully-showed"));
                                    t.sendMessage(ChatColor.GREEN + plugin.getConfig().getString("vanish-admin-showed-you"));
                                    return true;
                                }
                            } else {
                                for (Player online : Bukkit.getOnlinePlayers()) {
                                    vanished.add(t);
                                    online.hidePlayer(t);
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("vanish-successfully-hidden"));
                                    t.sendMessage(ChatColor.GREEN + plugin.getConfig().getString("vanish-admin-hidden-you"));
                                    return true;
                                }
                            }
                            return false;
                        }
                        return false;

                    }
                }
            } else {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("vanish-no-permission"));
                p.sendMessage(" ");
            }
        return false;
    }
}
