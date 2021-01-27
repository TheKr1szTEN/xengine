package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("fly")) {
                if (sender.hasPermission("xengine.fly")) {
                    if (args.length != 0) {

                        Player t = Bukkit.getServer().getPlayerExact(args[0]);

                        if (t == null) {
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("fly-offline-player"));
                            p.sendMessage(" ");
                        } else {

                            if (t.isFlying()) {
                                t.setAllowFlight(false);
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("fly-disabled"));
                                p.sendMessage(" ");
                            } else {
                                t.setAllowFlight(true);
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("fly-enabled"));
                                p.sendMessage(" ");
                            }
                        }
                        return true;
                    } else {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("fly-wrong-usage"));
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("fly-usage"));
                        p.sendMessage(" ");
                    }
                    return true;
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("fly-no-permission"));
                    p.sendMessage(" ");
                }
                return true;
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("fly-only-for-players"));
        }
        return true;
    }

}
