package me.xaxis.reportplus.utils;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class ItemUtils {

  private final ItemStack item;
  private final ItemMeta meta;

  public ItemUtils(Material material) {
    this.item = new ItemStack(material);
    this.meta = item.getItemMeta();
  }

  public ItemUtils lore(List<String> lore) {
    if (lore == null || lore.isEmpty()) {
      return this;
    }

    meta.setLore(lore.stream().map(Utils::chat).toList());

    return this;
  }

  public ItemUtils setTitle(String title, boolean colorCoded) {
    if (colorCoded) {
      meta.setDisplayName(Utils.chat(title));
    } else {
      meta.setDisplayName(title);
    }

    return this;
  }

  public ItemStack build() {
    item.setItemMeta(meta);
    return item;
  }
}
