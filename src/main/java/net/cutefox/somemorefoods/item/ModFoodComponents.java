package net.cutefox.somemorefoods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //Secret Waffle
    public static final FoodComponent WAFFLE_WAFFLE = new FoodComponent.Builder()
            .hunger(15)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 10), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 10), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 10), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 10), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 800, 10), 1F)
            .alwaysEdible()
            .build();
    //PLain Waffle
    public static final FoodComponent WAFFLE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60, 1), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 60, 1), 0.1F)
            .build();
    public static final FoodComponent FROZEN_WAFFLE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 1), 0.5F)
            .build();
    public static final FoodComponent WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 5), 0.9F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 5), 0.9F)
            .build();
    public static final FoodComponent FROZEN_WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 5), 0.9F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 5), 0.9F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 1), 0.5F)
            .build();
    //Blueberry Waffle
    public static final FoodComponent BLUEBERRY_WAFFLE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(1.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 80, 2), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 80, 2), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 2), 0.5F)
            .build();
    public static final FoodComponent FROZEN_BLUEBERRY_WAFFLE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.4f)
            .build();
    public static final FoodComponent BLUEBERRY_WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent FROZEN_BLUEBERRY_WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .build();
    //Chocolate Chip Waffle
    public static final FoodComponent CHOCOLATE_CHIP_WAFFLE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.8f)
            .build();
    public static final FoodComponent FROZEN_CHOCOLATE_CHIP_WAFFLE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.7f)
            .build();
    public static final FoodComponent CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.9f)
            .build();
    public static final FoodComponent FROZEN_CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.9f)
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
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 0.25F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1), 0.25F)
            .build();
    public static final FoodComponent MAPLE_SYRUP = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 5), 1.0F)
            .build();
    public static final FoodComponent CHOCOLATE_CHIP = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 5), 0.9F)
            .build();
    public static final FoodComponent WAFFLE_BATTER = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 10), 1.0F)
            .build();
    public static final FoodComponent MAPLE_SUGAR = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 800, 12), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 800, 12), 1.0F)
            .build();
}
