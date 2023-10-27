package szu.mod.compat.rei;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import szu.mod.block.slimepacker.recipe.SlimePackerRecipe;
import szu.mod.block.slimepacker.screen.SlimePackerScreen;
import szu.mod.compat.rei.slimepacker.SlimePackerCategory;
import szu.mod.compat.rei.slimepacker.SlimePackerDisplay;
import szu.mod.init.BlockRegistry;

public class TemplateREIClientplugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new SlimePackerCategory());

        registry.addWorkstations(SlimePackerCategory.PACKING, EntryStacks.of(BlockRegistry.SLIME_PACKER));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(SlimePackerRecipe.class, SlimePackerRecipe.Type.INSTANCE,
                SlimePackerDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(90, 82, 20, 30), SlimePackerScreen.class, SlimePackerCategory.PACKING);
    }
}