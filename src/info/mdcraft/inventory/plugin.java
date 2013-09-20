package info.mdcraft.inventory;

import org.bukkit.plugin.java.JavaPlugin;

public class plugin extends JavaPlugin{
	
	public plugin plugin;
	
	@Override
	public void onEnable() {
		settings.getInstance().runEnable(plugin);				
	}
}
