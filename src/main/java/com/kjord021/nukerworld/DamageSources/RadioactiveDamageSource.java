package com.kjord021.nukerworld.DamageSources;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.*;

public class RadioactiveDamageSource extends DamageSource {

    public static DamageSource Radioactive = (new RadioactiveDamageSource("radioactive")).setBypassesArmor();

    protected RadioactiveDamageSource(String name) {
        super(name);
    }

    @Override
    public Text getDeathMessage(LivingEntity entity) {
        String string = entity.getEntityName() + " died to radioactivity.";
        return entity != null ? new TranslatableText(string, new Object[]{entity.getDisplayName(), entity.getDisplayName()}) : new TranslatableText(string, new Object[]{entity.getDisplayName()});
    }
}
