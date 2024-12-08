package net.pengi.potatoperks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
        public static final FoodComponent COOKED_PINK_POTATO = new FoodComponent.Builder()
                .nutrition(5)
                .saturationModifier(0.5f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2), 95f)
                .build();

public static final FoodComponent COOKED_BLUE_POTATO = new FoodComponent.Builder()
        .nutrition(5)
        .saturationModifier(0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2), 95f)
        .build();

public static final FoodComponent COOKED_ORANGE_POTATO = new FoodComponent.Builder()
        .nutrition(5)
        .saturationModifier(0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 2), 95f)
        .build();

public static final FoodComponent COOKED_PURPLE_POTATO = new FoodComponent.Builder()
        .nutrition(5)
        .saturationModifier(0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2000, 1), 1.0f)
        .build();

    }
