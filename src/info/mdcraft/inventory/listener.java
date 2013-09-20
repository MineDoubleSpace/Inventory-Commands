package info.mdcraft.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class listener implements Listener{
	
	public plugin plugin;
	manager man = manager.getInstance();
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
        if (!e.getInventory().getName().equalsIgnoreCase(man.inv.getName())){
        	return;
        	}
        if (e.getCurrentItem().getItemMeta() == null){
        	return;
        	}
        	Player p = (Player) e.getWhoClicked();
        	 if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-1.name"))) {
        		p.chat(plugin.getConfig().getString("item-1.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-2.name"))) {
        		p.chat(plugin.getConfig().getString("item-2.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-3.name"))) {
        		p.chat(plugin.getConfig().getString("item-3.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-4.name"))) {
        		p.chat(plugin.getConfig().getString("item-4.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-5.name"))) {
        		p.chat(plugin.getConfig().getString("item-5.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-6.name"))) {
        		p.chat(plugin.getConfig().getString("item-6.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-7.name"))) {
        		p.chat(plugin.getConfig().getString("item-7.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-8.name"))) {
        		p.chat(plugin.getConfig().getString("item-8.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}if (e.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.getConfig().getString("item-9.name"))) {
        		p.chat(plugin.getConfig().getString("item-9.command"));
        		e.setCancelled(true);
        		p.closeInventory();
        		return;
        	}
	}

}
