package fun.bugfix.fish.idea.utils;


import fun.bugfix.fish.idea.PersistentState;

import java.awt.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class SettingUtil {
    public static PersistentState getPersistentState() {
        return PersistentState.getInstance();
    }
    
    public static List<String> getAllFontType() {
        Font[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        List<String> fontList = new LinkedList<>();
        for (Font font : allFonts) {
            fontList.add(font.getFamily());
        }
        fontList = removeDuplicate(fontList);
        return fontList;
    }
    
    private static List<String> removeDuplicate(List<String> fontList) {
        HashSet<String> temp = new LinkedHashSet<>(fontList);
        return new LinkedList<>(temp);
    }
}
