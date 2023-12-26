package uk.co.anttheantster.deathandtaxes.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import uk.co.anttheantster.deathandtaxes.DeathAndTaxes;
import uk.co.anttheantster.deathandtaxes.utils.TaxController;

public class OnDeath implements Listener {

    private DeathAndTaxes plugin;
    private TaxController controller;
    public OnDeath(DeathAndTaxes plugin, TaxController controller){
        this.plugin = plugin;
        this.controller = controller;
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        Player killer = player.getKiller();
    }

}
