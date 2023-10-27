package szu.mod.compat.rei.slimepacker;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.DisplayRenderer;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.SimpleDisplayRenderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import szu.mod.TemplateMod;
import szu.mod.init.BlockRegistry;

import java.util.Collections;
import java.util.List;

public class SlimePackerCategory implements DisplayCategory<SlimePackerDisplay> {
    public static final CategoryIdentifier<SlimePackerDisplay> PACKING = CategoryIdentifier.of(TemplateMod.MOD_ID, "packing");

    @Override
    public CategoryIdentifier<? extends SlimePackerDisplay> getCategoryIdentifier() {
        return PACKING;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Slime packer");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(BlockRegistry.SLIME_PACKER.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(SlimePackerDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createBurningFire(new Point(startPoint.x + 75, startPoint.y + 31)).animationDurationMS(10000));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 6)).entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 54)).entries(display.getOutputEntries().get(0)).markOutput());
        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }

    @Override
    public DisplayRenderer getDisplayRenderer(SlimePackerDisplay display) {
        return SimpleDisplayRenderer.from(Collections.singletonList(display.getInputEntries().get(0)), display.getOutputEntries());
    }
}