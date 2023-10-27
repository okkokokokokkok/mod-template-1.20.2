package szu.mod.init;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import szu.mod.TemplateMod;
import szu.mod.block.slimepacker.screen.SlimePackerScreenHandler;

public class ScreenRegistry {
    public static void registerGui() {
    }

    public static final ScreenHandlerType<SlimePackerScreenHandler> SLIME_PACKER_GUI =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TemplateMod.MOD_ID, "slime_packer_gui"), new ExtendedScreenHandlerType<>(SlimePackerScreenHandler::new));


}