package io.github.sahibkhokhar.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cat;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandGarfield implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player player) {
            World world = player.getWorld();
            Cat garfield = (Cat) world.spawnEntity(player.getLocation(), EntityType.CAT);
            garfield.setCatType(Cat.Type.RED);
            garfield.setCustomName("garfield");
            garfield.setCustomNameVisible(true);
            Bukkit.broadcastMessage("garfield said he loves lasaga");
        }
        return true;
    }
}
