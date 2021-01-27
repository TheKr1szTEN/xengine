package me.kr1sz.xengine;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flyspeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(sender.hasPermission("xengine.flyspeed")) {

                if (args.length > 1) {

                    Player t = Bukkit.getServer().getPlayerExact(args[0]);

                    if (t == null) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("flyspeed-offline-player"));
                        p.sendMessage(" ");
                    } else {


                        setSpeed(sender, t, args[1]);
                    }
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("flyspeed-wrong-usage"));
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("flyspeed-usage"));
                    p.sendMessage(" ");
                }
            } else {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("flyspeed-no-permission"));
                p.sendMessage(" ");
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("flyspeed-only-for-players"));
        }
        return true;
    }

    public void setSpeed(CommandSender sender, Player p, String speed) {

        main plugin = (main)main.getPlugin(main.class);

        int integer = Integer.parseInt(speed);
        if (integer > 50) {
            sender.sendMessage(" ");
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("flyspeed-enter-valid-number"));
            sender.sendMessage(" ");
            return;
        }

        float f = (float) (integer * .01);
        p.setFlySpeed(f);
        sender.sendMessage("");
        sender.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("flyspeed-successfull")  + ChatColor.GRAY + speed + "%" + ChatColor.GREEN + ".");
        sender.sendMessage("");
    }

}
