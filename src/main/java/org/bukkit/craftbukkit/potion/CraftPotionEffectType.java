package org.bukkit.craftbukkit.potion;

import java.util.Hashtable;
import java.util.Map;

import net.minecraft.server.MobEffectList;

import org.bukkit.potion.PotionEffectType;

public class CraftPotionEffectType extends PotionEffectType {
    private final MobEffectList handle;
    static Map<Integer, String> effectType = new Hashtable<Integer,String>();
    
    static {
        effectType.put(1, "SPEED");
        effectType.put(2, "SLOW");
        effectType.put(3, "FAST_DIGGING");
        effectType.put(4, "SLOW_DIGGING");
        effectType.put(5, "INCREASE_DAMAGE");
        effectType.put(6, "HEAL");
        effectType.put(7, "HARM");
        effectType.put(8, "JUMP");
        effectType.put(9, "CONFUSION");
        effectType.put(10, "REGENERATION");
        effectType.put(11, "DAMAGE_RESISTANCE");
        effectType.put(12, "FIRE_RESISTANCE");
        effectType.put(13, "WATER_BREATHING");
        effectType.put(14, "INVISIBILITY");
        effectType.put(15, "BLINDNESS");
        effectType.put(16, "NIGHT_VISION");
        effectType.put(17, "HUNGER");
        effectType.put(18, "WEAKNESS");
        effectType.put(19, "POISON");
        effectType.put(20, "WITHER");
        effectType.put(21, "HEALTH_BOOST");
        effectType.put(22, "ABSORPTION");
        effectType.put(23, "SATURATION");
    }
    
    public CraftPotionEffectType(MobEffectList handle) {
        super(handle.id);
        this.handle = handle;
    }

    @Override
    public double getDurationModifier() {
        return handle.getDurationModifier();
    }

    public MobEffectList getHandle() {
        return handle;
    }

    @Override
    public String getName() {
            if(effectType.get(handle.id)!=null) return effectType.get(handle.id);
            return "UNKNOWN_EFFECT_TYPE_" + handle.id;
    }

    @Override
    public boolean isInstant() {
        return handle.isInstant();
    }
}
