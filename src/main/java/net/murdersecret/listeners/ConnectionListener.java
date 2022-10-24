package net.murdersecret.listeners;

import net.murdersecret.Plugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListener implements Listener {
    Plugin plugin;
    public ConnectionListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event) {

    }

    @EventHandler
    private void onPlayerQuit(PlayerQuitEvent event) {

    }
}
