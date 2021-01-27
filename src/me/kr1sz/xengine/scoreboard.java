package me.kr1sz.xengine;

import me.kr1sz.xengine.utils.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;

public class scoreboard implements Listener {

    ConfigManager cfg = new ConfigManager();

    main plugin = (main)main.getPlugin(main.class);

    ScoreboardManager manager = Bukkit.getScoreboardManager();


    public void createBoard(Player player) {
        ScoreboardManager sbm = Bukkit.getServer().getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective obj = board.registerNewObjective("test", "dummy");
        obj.setDisplayName(ChatColor.RED + plugin.getConfig().getString("scoreboard.title"));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score score1 = obj.getScore(cfg.scorecfg.getString("scoreboard.title").replaceAll("%name%", player.getDisplayName()));
        score1.setScore(1);
        Score score2 = obj.getScore(plugin.getConfig().getString("scoreboard.line-1").replaceAll("%name%", player.getDisplayName()));
        score2.setScore(2);
        Score score3 = obj.getScore(plugin.getConfig().getString("scoreboard.line-2").replaceAll("%name%", player.getDisplayName()));
        score3.setScore(3);

        player.setScoreboard(board);
    }
}
