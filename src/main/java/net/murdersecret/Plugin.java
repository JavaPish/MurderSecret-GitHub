package net.murdersecret;

import net.murdersecret.listeners.ConnectionListener;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    //Variables
    public Location spawnLocation = new Location(this.getServer().getWorld("murder-secret-map"), 0.5 , 61 , 0.5);

    @Override
    public void onEnable() {

        //Listeners
        getServer().getPluginManager().registerEvents(new ConnectionListener(this) , this);
    }
}
