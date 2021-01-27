package me.kr1sz.xengine;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class privatemessage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {
            Player p = (Player) sender;

                if(sender.hasPermission("xengine.privatemessages")) {

                    if (args.length == 0) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-wrong-usage"));
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("pm-usage"));
                        p.sendMessage(" ");
                    } else {

                        Player target = Bukkit.getPlayer(args[0]);
                        if (target != null) {

                            String message = "";

                            for (int i = 1; i != args.length; i++)

                                message += args[i] + " ";

                            if (target == p) {
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-can-not-send-yourself"));
                                p.sendMessage(" ");
                            } else {
                                if (args.length == 1) {
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-empty-message"));
                                    p.sendMessage(" ");
                                } else {
                                    target.sendMessage(" ");
                                    target.sendMessage(ChatColor.DARK_GREEN + "⚠ " + ChatColor.GREEN + plugin.getConfig().getString("pm-received-alert") + ChatColor.GRAY + sender.getName());
                                    target.sendMessage(" ");
                                    target.sendMessage(ChatColor.AQUA + "» " + ChatColor.WHITE + message);
                                    target.sendMessage(" ");
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("pm-successfully-sent") + ChatColor.GRAY + target.getName());
                                    p.sendMessage(" ");

                                }
                            }
                        } else {

                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-offline-player"));
                            p.sendMessage(" ");
                        }
                        return true;
                    }
                    return true;
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-no-permission"));
                    p.sendMessage(" ");
                }
                return true;

        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("pm-only-for-players"));
        }

        return true;
    }
}
