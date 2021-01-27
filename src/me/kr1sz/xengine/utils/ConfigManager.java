package me.kr1sz.xengine.utils;

import me.kr1sz.xengine.main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private main plugin = main.getPlugin(main.class);

    public FileConfiguration scorecfg;

    public File scorefile;

    public void setupScore() {
        if(!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        scorefile = new File(plugin.getDataFolder(), "scoreboard.yml");

        if(!scorefile.exists()) {
            try {
                scorefile.createNewFile();
                Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "A scoreboard.yml sikeresen le lett generálva");
            }catch(IOException e) {
                Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "A scoreboard.yml nem lett legenerálva");
                e.printStackTrace();
            }
        }

        scorecfg = YamlConfiguration.loadConfiguration(scorefile);
    }

    public FileConfiguration getScore() {
        return scorecfg;
    }

    public void saveScore() {
        try {
            scorecfg.save(scorefile);
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "A scoreboard.yml sikeresen elmentve");
        }catch(IOException e) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "A scoreboard.yml nem lett elmentve");
        }
    }

    public void reloadScore() {
        scorecfg = YamlConfiguration.loadConfiguration(scorefile);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "A scoreboard.yml sikeresen betöltve");

    }

}
