package info.mdcraft.inventory;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class manager {
	
	private manager(){}
	
	static manager instance = new manager();
	
	public static manager getInstance(){
		return instance;
	}
	
	public plugin p;
	public Inventory inv;
	public ItemStack i0, i1 ,i2 ,i3 ,i4 ,i5 ,i6 ,i7, i8;
	
	@SuppressWarnings("deprecation")
	public void startMenu(Plugin plugin){
		
		inv = Bukkit.getServer().createInventory(null, 9, "");
//		ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("name"))
		
		i0 = createItem(new ItemStack(p.getConfig().getInt("item-1.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-1.name")) , p.getConfig().getStringList("item-1.lore"));
		i1 = createItem(new ItemStack(p.getConfig().getInt("item-2.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-2.name")) , p.getConfig().getStringList("item-2.lore"));
		i2 = createItem(new ItemStack(p.getConfig().getInt("item-3.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-3.name")) , p.getConfig().getStringList("item-3.lore"));
		i3 = createItem(new ItemStack(p.getConfig().getInt("item-4.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-4.name")) , p.getConfig().getStringList("item-4.lore"));
		i4 = createItem(new ItemStack(p.getConfig().getInt("item-5.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-5.name")) , p.getConfig().getStringList("item-5.lore"));
		i5 = createItem(new ItemStack(p.getConfig().getInt("item-6.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-6.name")) , p.getConfig().getStringList("item-6.lore"));
		i6 = createItem(new ItemStack(p.getConfig().getInt("item-7.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-7.name")) , p.getConfig().getStringList("item-7.lore"));
		i7 = createItem(new ItemStack(p.getConfig().getInt("item-8.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-8.name")) , p.getConfig().getStringList("item-8.lore"));
		i8 = createItem(new ItemStack(p.getConfig().getInt("item-9.ID")), ChatColor.translateAlternateColorCodes('&', p.getConfig().getString("item-9.name")) , p.getConfig().getStringList("item-9.lore"));
		
		
		inv.setItem(0, i0);
		inv.setItem(1, i1);
		inv.setItem(2, i2);
		inv.setItem(3, i3);		
		inv.setItem(4, i4);
		inv.setItem(5, i5);
		inv.setItem(6, i6);
		inv.setItem(7, i7);
		inv.setItem(8, i8);
		
		
		}
	
	
	public void showMenu(Player p){
		p.openInventory(inv);
	}
	
    private ItemStack createItem(ItemStack itemstack, String name, List<String> lore) {
    	ItemStack item = itemstack;
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        im.setLore(lore);
        item.setItemMeta(im);
        return item;
}

}
