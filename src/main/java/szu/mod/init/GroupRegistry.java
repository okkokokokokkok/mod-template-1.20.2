package szu.mod.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import szu.mod.TemplateMod;

public class GroupRegistry {
    public static final RegistryKey<ItemGroup> MOD_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TemplateMod.MOD_ID, "blocks"));

    public static void registerGroup() {
        Registry.register(Registries.ITEM_GROUP, MOD_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.mod_blocks"))
                .icon(() -> new ItemStack(BlockRegistry.SLIME_PACKER))
                .build()
        );
    }
}
