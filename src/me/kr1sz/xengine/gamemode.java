package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {


            Player p = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("gm")) {
                if (sender.hasPermission("xengine.gamemode")) {
                    if (args.length != 0 && args.length != 1) {
                        if (args[0].equalsIgnoreCase("creative")) {

                            Player t = Bukkit.getServer().getPlayerExact(args[1]);

                            if (t == null) {
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-offline-player-creative"));
                                p.sendMessage(" ");
                            } else {
                                if (t.getGameMode() == GameMode.CREATIVE) {
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-already-creative"));
                                    p.sendMessage(" ");
                                } else {
                                    t.setGameMode(GameMode.CREATIVE);
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("gm-successfully-creative"));
                                    p.sendMessage(" ");
                                }
                                return true;
                            }
                        }
                        if (args[0].equalsIgnoreCase("survival")) {

                            Player t = Bukkit.getServer().getPlayerExact(args[1]);

                            if (t == null) {
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-offline-player-survival"));
                                p.sendMessage(" ");
                            } else {
                                if (t.getGameMode() == GameMode.SURVIVAL) {
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-already-survival"));
                                    p.sendMessage(" ");
                                } else {
                                    t.setGameMode(GameMode.SURVIVAL);
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("gm-successfully-survival"));
                                    p.sendMessage(" ");
                                }
                                return true;
                            }
                        }
                        if (args[0].equalsIgnoreCase("adventure")) {

                            Player t = Bukkit.getServer().getPlayerExact(args[1]);

                            if (t == null) {
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-offline-player-adventure"));
                                p.sendMessage(" ");
                            } else {
                                if (t.getGameMode() == GameMode.ADVENTURE) {
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-already-adventure"));
                                    p.sendMessage(" ");
                                } else {
                                    t.setGameMode(GameMode.ADVENTURE);
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("gm-successfully-adventure"));
                                    p.sendMessage(" ");
                                }
                                return true;
                            }
                        }
                        if (args[0].equalsIgnoreCase("spectator")) {

                            Player t = Bukkit.getServer().getPlayerExact(args[1]);

                            if (t == null) {
                                p.sendMessage(" ");
                                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-offline-player-spectator"));
                                p.sendMessage(" ");
                            } else {
                                if (t.getGameMode() == GameMode.SPECTATOR) {
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-already-spectator"));
                                    p.sendMessage(" ");
                                } else {
                                    t.setGameMode(GameMode.SPECTATOR);
                                    p.sendMessage(" ");
                                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("gm-successfully-spectator"));
                                    p.sendMessage(" ");
                                }
                                return true;
                            }
                        }
                    } else {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-wrong-usage"));
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("gm-usage"));
                        p.sendMessage(" ");
                    }
                    return true;
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-no-permission"));
                    p.sendMessage(" ");
                }
                return true;
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("gm-only-for-players"));
        }
        return false;
    }
}
