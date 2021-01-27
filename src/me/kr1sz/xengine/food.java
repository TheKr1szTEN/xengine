package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class food implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {


            Player p = (Player) sender;
            if(sender.hasPermission("xengine.food")) {
                if (args.length == 0) {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("food-wrong-usage"));
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("food-usage"));
                    p.sendMessage(" ");
                } else {

                    Player t = Bukkit.getPlayerExact(args[0]);

                    if (t == null) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("food-offline-player"));
                        p.sendMessage(" ");
                    } else {
                        if (t.getFoodLevel() == 20) {
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("food-already-recharged"));
                            p.sendMessage(" ");
                        } else {
                            t.setFoodLevel(20);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("food-successfull"));
                            p.sendMessage(" ");
                            t.sendMessage(" ");
                            t.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("food-target-successfull"));
                            t.sendMessage(" ");
                        }
                    }
                    return true;
                }
            } else {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("food-no-permission"));
                p.sendMessage(" ");
            }
            return true;

        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("food-only-for-players"));
        }

        return true;
    }
}
