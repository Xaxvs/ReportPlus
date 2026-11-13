package me.xaxis.reportplus.reports;

import java.util.List;
import org.bukkit.Material;

public record ReportType(
    String id, Material material, String displayName, List<String> lore, int slot) {}
