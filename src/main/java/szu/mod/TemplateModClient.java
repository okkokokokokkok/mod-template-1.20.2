package szu.mod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import szu.mod.block.slimepacker.screen.SlimePackerScreen;
import szu.mod.init.ScreenRegistry;

public class TemplateModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ScreenRegistry.SLIME_PACKER_GUI, SlimePackerScreen::new);
    }
}