package me.kr1sz.xengine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class walkspeed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if (sender instanceof Player) {

            Player p = (Player) sender;

            if(sender.hasPermission("xengine.walkspeed")) {

                if (args.length > 1) {

                    Player t = Bukkit.getServer().getPlayerExact(args[0]);

                    if (t == null) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("walkspeed-offline-player"));
                        p.sendMessage(" ");
                    } else {


                        setWalkSpeed(sender, t, args[1]);
                    }
                } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("walkspeed-wrong-usage"));
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("walkspeed-usage"));
                    p.sendMessage(" ");
                }
            } else {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("walkspeed-no-permission"));
                p.sendMessage(" ");
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("walkspeed-only-for-players"));
        }
        return true;
    }

    public void setWalkSpeed(CommandSender sender, Player p, String speed) {

        main plugin = (main)main.getPlugin(main.class);


        int integer = Integer.parseInt(speed);

        float f = (float) (integer * .01);

        if (integer > 50) {
            sender.sendMessage(" ");
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("walkspeed-enter-valid-number"));
            sender.sendMessage(" ");
        } else {

            p.setWalkSpeed(f);
            sender.sendMessage("");
            sender.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("walkspeed-successfull") + ChatColor.GRAY + p.getDisplayName() + ChatColor.GRAY + "'s" + ChatColor.GREEN + " fly speed to " + ChatColor.GRAY + speed + "%" + ChatColor.GREEN + ".");
            sender.sendMessage("");
        }
    }
}
