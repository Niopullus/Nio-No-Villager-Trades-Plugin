import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class VillagerTradeListener implements Listener {

    public VillagerTradeListener() {
        super();
    }

    @EventHandler
    public void onPlayerInteract(final PlayerInteractEntityEvent event) {
        final Entity entity;
        final EntityType type;
        entity = event.getRightClicked();
        type = entity.getType();
        if (type == EntityType.VILLAGER) {
            final Villager villager;
            final Villager.Profession profession;
            villager = (Villager) entity;
            profession = villager.getProfession();
            if (profession == Villager.Profession.BLACKSMITH || profession == Villager.Profession.LIBRARIAN) {
                event.setCancelled(true);
            }
        }
    }

}
