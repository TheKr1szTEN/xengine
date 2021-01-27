package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(args.length == 0) {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("heal-wrong-usage"));
                p.sendMessage(" ");
                p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("heal-usage"));
                p.sendMessage(" ");
            } else {

                Player t = Bukkit.getPlayerExact(args[0]);

                if(sender.hasPermission("engine.heal")) {

                    if (t == null) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("heal-offline-player"));
                        p.sendMessage(" ");
                    } else {
                        if (t.getHealth() == 20) {
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("heal-already-recharged"));
                            p.sendMessage(" ");
                        } else {
                            t.setHealth(20);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("heal-successfull"));
                            p.sendMessage(" ");
                            t.sendMessage(" ");
                            t.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("heal-target-successfull"));
                            t.sendMessage(" ");
                        }
                    }
                    return true;
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("heal-no-permission"));
                    p.sendMessage(" ");
                }
                return true;
            }

        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("heal-only-players"));
        }

        return true;
    }
}
