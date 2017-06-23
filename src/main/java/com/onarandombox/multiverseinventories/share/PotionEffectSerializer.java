package com.onarandombox.multiverseinventories.share;

import com.onarandombox.multiverseinventories.DataStrings;
import org.bukkit.potion.PotionEffect;

/**
 * A simple {@link com.onarandombox.multiverseinventories.share.SharableSerializer} usable with PotionEffect[]
 * which converts the PotionEffect[] to the string format that is used by default in Multiverse-Inventories.
 */
public final class PotionEffectSerializer implements SharableSerializer<PotionEffect[]> {

    @Override
    public PotionEffect[] deserialize(Object obj) {
        return DataStrings.parsePotionEffects(obj.toString());
    }

    @Override
    public Object serialize(PotionEffect[] potionEffects) {
        return DataStrings.valueOf(potionEffects);
    }
}
