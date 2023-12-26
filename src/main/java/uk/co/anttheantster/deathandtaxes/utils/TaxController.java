package uk.co.anttheantster.deathandtaxes.utils;

import org.bukkit.entity.Player;
import uk.co.anttheantster.deathandtaxes.DeathAndTaxes;

public class TaxController {

    private DeathAndTaxes plugin;
    public TaxController(DeathAndTaxes plugin){
        this.plugin = plugin;
    }

    public void taxPlayer(Player player, Player killer){
        double balance = plugin.getEconomy().getBalance(player); //Non-static reference to a static object not allowed?
        double amountToTax = 0;

        if (plugin.getConfig().getString("Tax Type").equalsIgnoreCase("Percentage")){
            // Do Percentage Amount Tax


        }

        if (plugin.getConfig().getString("Tax Type").equalsIgnoreCase("Amount")){
            // Do Set Amount Tax
        }

        if (plugin.getConfig().getBoolean("Killer Split Enabled")){

        }
    }

}
