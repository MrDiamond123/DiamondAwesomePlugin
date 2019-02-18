package io.github.MrDiamond123.DiamondAwesomePlugin;

import org.bukkit.ChatColor;

public class DiamondLikesPrettyColors {

    /**
     * @param Boolean
     * Takes a boolean input and returns DARK_GREEN or DARK_RED + the boolean in string form
     * @return
     */
    public static String outputBooleanColors(boolean Boolean) {
        if (Boolean) {
            return ChatColor.DARK_GREEN + "True";
        } else {
            return ChatColor.DARK_RED + "False";
        }

    }
}
