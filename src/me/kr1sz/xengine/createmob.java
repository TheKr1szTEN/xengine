package me.kr1sz.xengine;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Objects;

public class createmob implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        main plugin = (main)main.getPlugin(main.class);

        if(sender instanceof Player) {


            Player p = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("cmob")) {
                if (sender.hasPermission("xengine.cmob")) {
                    if (args.length == 0) {
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("cmob-wrong-usage"));
                        p.sendMessage(" ");
                        p.sendMessage(ChatColor.GRAY + plugin.getConfig().getString("cmob-usage"));
                        p.sendMessage(" ");
                    } else {
                        if (args[0].equalsIgnoreCase("bat")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.BAT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("cat")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.CAT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("chicken")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.CHICKEN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("cod")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.COD);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("cow")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.COW);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("donkey")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.DONKEY);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("fox")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.HORSE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("mushroom_crow")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.MUSHROOM_COW);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("mule")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.MULE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("ocelot")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.OCELOT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("parrot")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PARROT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("piglin")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PIGLIN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("polar_bear")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.POLAR_BEAR);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("rabbit")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.RABBIT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("salmon")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SALMON);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("sheep")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SHEEP);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("skeleton_horse")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON_HORSE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("snow_golem")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SNOWMAN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("squid")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SQUID);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("strider")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.STRIDER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("tropical_fish")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.TROPICAL_FISH);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("turtle")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.TURTLE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("villager")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("wandering_villager")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.WANDERING_TRADER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("bee")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.BEE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("cave_spider")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.CAVE_SPIDER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("dolphin")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.DOLPHIN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("enderman")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ENDERMAN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("iron_golem")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.IRON_GOLEM);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("llama")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.LLAMA);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("panda")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PANDA);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("pufferfish")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PUFFERFISH);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("spider")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SPIDER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("wolf")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.WOLF);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("zombified_piglin")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIFIED_PIGLIN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("blaze")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.BLAZE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("creeper")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.CREEPER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("drowned")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.DROWNED);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("elder-guardian")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ELDER_GUARDIAN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("endermite")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ENDERMITE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("evoker")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.EVOKER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("ghast")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.GHAST);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("guardian")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.GUARDIAN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("hoglin")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.HOGLIN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("husk")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.HUSK);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("magma_cube")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.MAGMA_CUBE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("phantom")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PHANTOM);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("piglin_brute")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PIGLIN_BRUTE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("pillager")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.PILLAGER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("ravager")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.RAVAGER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("shulker")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SHULKER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("silverfish")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SILVERFISH);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("skeleton")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("skeleton_horse")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON_HORSE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("slime")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.SLIME);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("stray")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.STRAY);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("vex")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.VEX);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("vindicator")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.VINDICATOR);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("witch")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.WITCH);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("wither_skeleton")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.WITHER_SKELETON);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("zoglin")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ZOGLIN);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("zombie")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("zombie_villager")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE_VILLAGER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("ender_dragon")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ENDER_DRAGON);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("wither")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.WITHER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("giant")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.GIANT);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("zombie_horse")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE_HORSE);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else if (args[0].equalsIgnoreCase("illusioner")) {
                            Objects.requireNonNull(p.getPlayer()).getWorld().spawnEntity(p.getLocation(), EntityType.ILLUSIONER);
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_GREEN + "✔ " + ChatColor.GREEN + plugin.getConfig().getString("cmob-successfully"));
                            p.sendMessage(" ");
                        } else {
                            p.sendMessage(" ");
                            p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("cmob-wrong-mobtype"));
                            p.sendMessage(" ");
                        }
                    }
            } else {
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("cmob-no-permission"));
                    p.sendMessage(" ");
                }
            }

        } else {

            sender.sendMessage(ChatColor.DARK_RED + "✘ " + ChatColor.RED + plugin.getConfig().getString("cmob-only-for-players"));
        }

        return true;
    }
}