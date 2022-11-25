package io.github.sahibkhokhar.testplugin;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CommandFakeDiamond implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player player) {
            ItemStack diamond = new ItemStack(Material.DEAD_BRAIN_CORAL);
            diamond.setAmount(2);
            player.getInventory().addItem(diamond);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 1);
            player.playSound(player, Sound.ENTITY_ENDER_DRAGON_DEATH, 100, 1);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 2);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 3);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 4);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 5);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 6);
            player.playSound(player, Sound.BLOCK_ANVIL_LAND, 100, 7);
        }

        return true;
    }
}
