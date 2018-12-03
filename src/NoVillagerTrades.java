import org.bukkit.Server;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoVillagerTrades extends JavaPlugin {

    public void onEnable() {
        final VillagerTradeListener listener;
        final Server server;
        final PluginManager pluginManager;
        listener = new VillagerTradeListener();
        server = getServer();
        pluginManager = server.getPluginManager();
        pluginManager.registerEvents(listener, this);
    }

    public void onDisable() {

    }

}
