package io.github.maplemods.maplesparrotcollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesparrotcollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "autumn", "flannel_parrot", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "autumn", "pumpkin_parrot", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "spring", "cherry_blossom_parrot", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "spring", "flower_parrot", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "summer", "midsommar_parrot", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "summer", "watermelon_parrot", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "winter", "frozen_parrot", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "winter", "snow_covered_parrot", 1);
    }
}
