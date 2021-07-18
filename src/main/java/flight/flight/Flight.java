package flight.flight;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Flight extends JavaPlugin {

    @Override
    public void onLoad() {
        getLogger().info("Flightがロードされました");
    }

    @Override
    public void onEnable() {
        getLogger().info("Flightを有効にしました");
    }

    @Override
    public void onDisable() {
        getLogger().warning("Flightを無効にしました");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("flight")) {
            if(args[0].equals("enable")) {
                Player p = (Player) sender;
                p.setAllowFlight(true);
                p.sendMessage("Flightが有効になりました");
                return true;
            } else if(args[0].equals("disable")) {
                Player p = (Player) sender;
                p.setAllowFlight(false);
                p.sendMessage("Flightが無効になりました");
                return true;
            } else {
                Player p = (Player) sender;
                p.sendMessage("引数が無効です。");
                return true;
            }
        }
        return false;
    }
}
