package me.kr1sz.xengine;

import me.kr1sz.xengine.utils.ConfigManager;
import org.bukkit.Bukkit;
import me.kr1sz.xengine.scoreboard;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;


public class main extends JavaPlugin{

    private ConfigManager cfg;

    public void onEnable() {

        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "██╗░░██╗" + ChatColor.AQUA + "███████╗███╗░░██╗░██████╗░██╗███╗░░██╗███████╗");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "╚██╗██╔╝" + ChatColor.AQUA + "██╔════╝████╗░██║██╔════╝░██║████╗░██║██╔════╝");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "░╚███╔╝░" + ChatColor.AQUA + "█████╗░░██╔██╗██║██║░░██╗░██║██╔██╗██║█████╗░░");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "░██╔██╗░" + ChatColor.AQUA + "██╔══╝░░██║╚████║██║░░╚██╗██║██║╚████║██╔══╝░░");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "██╔╝╚██╗" + ChatColor.AQUA + "███████╗██║░╚███║╚██████╔╝██║██║░╚███║███████╗");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "╚═╝░░╚═╝" + ChatColor.AQUA + "╚══════╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝░░╚══╝╚══════╝");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "x" + ChatColor.AQUA + "Engine" + ChatColor.GRAY + "] " + ChatColor.GREEN + "The plugin started successfully");
        getServer().getConsoleSender().sendMessage("");
        getCommand("gm").setExecutor(new gamemode());
        getCommand("fly").setExecutor(new fly());
        getCommand("flyspeed").setExecutor(new flyspeed());
        getCommand("walkspeed").setExecutor(new walkspeed());
        getCommand("hat").setExecutor(new hat());
        getCommand("pm").setExecutor(new privatemessage());
        getCommand("heal").setExecutor(new heal());
        getCommand("food").setExecutor(new food());
        getCommand("cmob").setExecutor(new createmob());
        getCommand("vanish").setExecutor(new vanish());
        loadConfig();
        loadConfigManager();
        Bukkit.getServer().getPluginManager().registerEvents(new scoreboard(), this);

        scoreboard score = new scoreboard();

        if(!getServer().getOnlinePlayers().isEmpty()) {
            for (Player online : getServer().getOnlinePlayers()) {
                score.createBoard(online);
            }
        }
    }


    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "x" + ChatColor.AQUA + "Engine" + ChatColor.GRAY + "] " + ChatColor.RED + "The plugin successfully stopped!");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        saveConfig();
    }

    public void loadConfigManager() {
        cfg = new ConfigManager();
        cfg.setupScore();
    }

}
