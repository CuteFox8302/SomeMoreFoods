package net.cutefox.somemorefoods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //Waffles
    public static final FoodComponent WAFFLE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 1), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 1), 0.1F)
            .build();
    public static final FoodComponent FROZEN_WAFFLE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 1), 0.5F)
            .build();
    public static final FoodComponent BLUEBERRY_WAFFLE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(1.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 1), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 1), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 2), 0.5F)
            .build();
    //Waffle Ingredients
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 2), 0.5F)
            .build();
    public static final FoodComponent SAP = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1), 0.25f)
            .build();
    public static final FoodComponent MAPLE_SYRUP = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.4f)
            .build();
}
