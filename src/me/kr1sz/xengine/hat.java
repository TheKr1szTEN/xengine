package me.kr1sz.xengine;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class hat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {

            Player p = (Player) sender;

            ItemStack item = p.getInventory().getItemInMainHand();

            if(sender.hasPermission("xengine.hat")) {

                if (p.getInventory().getItemInMainHand().getType() == Material.AIR) {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("hat-empty-mainhand"));
                    p.sendMessage(" ");
                } else {
                    p.getInventory().setHelmet(p.getInventory().getItemInMainHand());
                    p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("hat-successful"));
                    p.sendMessage(" ");
                }
            } else {
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("hat-no-permission"));
                p.sendMessage(" ");
            }
            return true;

        } else {
            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("hat-only-players"));
        }
        return true;
    }
}
