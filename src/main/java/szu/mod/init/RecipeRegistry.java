package szu.mod.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import szu.mod.TemplateMod;
import szu.mod.block.slimepacker.recipe.SlimePackerRecipe;


public class RecipeRegistry {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TemplateMod.MOD_ID, SlimePackerRecipe.Serializer.ID),
                SlimePackerRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TemplateMod.MOD_ID, SlimePackerRecipe.Type.ID),
                SlimePackerRecipe.Type.INSTANCE);
    }
}