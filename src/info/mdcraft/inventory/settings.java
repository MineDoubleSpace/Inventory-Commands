package info.mdcraft.inventory;

import java.io.File;

public class settings {
	
	private settings(){}
	
	static settings instance = new settings();
	
	public static settings getInstance(){
		return instance;
	}
	
	public void runEnable(plugin plugin){
		if (!plugin.getDataFolder().exists()){
			plugin.getDataFolder().mkdir();
		}
		
		File file = new File(plugin.getDataFolder(), "config.yml");
		if (!file.exists()){
			plugin.saveDefaultConfig();
		}
		plugin.saveConfig();
		manager.getInstance().startMenu(plugin);	
	}

}
