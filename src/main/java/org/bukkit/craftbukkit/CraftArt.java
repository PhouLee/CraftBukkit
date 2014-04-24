package org.bukkit.craftbukkit;

import net.minecraft.server.EnumArt;
import org.bukkit.Art;

import java.util.EnumMap;
import java.util.Map;

// Safety class, will break if either side changes
public class CraftArt {
    static Map<Art, EnumArt> enumMap = new EnumMap<Art, EnumArt>(Art.class);
    
    static {
        generateEnumMap();
    }
    
    public static Art NotchToBukkit(EnumArt art) {
        
        for(Art s : enumMap.keySet()){
            if(enumMap.get(s).equals(art)) return s;
        }
        throw new AssertionError(art);
    }

    public static EnumArt BukkitToNotch(Art art) {
        
        if(enumMap.get(art)!=null) return enumMap.get(art);
        
        throw new AssertionError(art);
    }

    private static void generateEnumMap() {
        enumMap.put(Art.KEBAB, EnumArt.KEBAB);
        enumMap.put(Art.AZTEC, EnumArt.AZTEC);
        enumMap.put(Art.ALBAN, EnumArt.ALBAN);
        enumMap.put(Art.AZTEC2, EnumArt.AZTEC2);
        enumMap.put(Art.BOMB, EnumArt.BOMB);
        enumMap.put(Art.PLANT, EnumArt.PLANT);
        enumMap.put(Art.WASTELAND, EnumArt.WASTELAND);
        enumMap.put(Art.POOL, EnumArt.POOL);
        enumMap.put(Art.COURBET, EnumArt.COURBET);
        enumMap.put(Art.SEA, EnumArt.SEA);
        enumMap.put(Art.SUNSET, EnumArt.SUNSET);
        enumMap.put(Art.CREEBET, EnumArt.CREEBET);
        enumMap.put(Art.WANDERER, EnumArt.WANDERER);
        enumMap.put(Art.GRAHAM, EnumArt.GRAHAM);
        enumMap.put(Art.MATCH, EnumArt.MATCH);
        enumMap.put(Art.BUST, EnumArt.BUST);
        enumMap.put(Art.STAGE, EnumArt.STAGE);
        enumMap.put(Art.VOID, EnumArt.VOID);
        enumMap.put(Art.SKULL_AND_ROSES, EnumArt.SKULL_AND_ROSES);
        enumMap.put(Art.FIGHTERS, EnumArt.FIGHTERS);
        enumMap.put(Art.POINTER, EnumArt.POINTER);
        enumMap.put(Art.PIGSCENE, EnumArt.PIGSCENE);
        enumMap.put(Art.BURNINGSKULL, EnumArt.BURNINGSKULL);
        enumMap.put(Art.SKELETON, EnumArt.SKELETON);
        enumMap.put(Art.DONKEYKONG, EnumArt.DONKEYKONG);
        enumMap.put(Art.WITHER, EnumArt.WITHER);
    }
}
