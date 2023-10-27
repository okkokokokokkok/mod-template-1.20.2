package szu.mod.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import szu.mod.TemplateMod;
import szu.mod.block.slimepacker.SlimePackerBlockEntity;

public class BlockEntities {
    public static void registerBlockEntities() {
    }

    public static final BlockEntityType<SlimePackerBlockEntity> SLIME_PACKER_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TemplateMod.MOD_ID, "slime_packer_block_entity"), FabricBlockEntityTypeBuilder.create(SlimePackerBlockEntity::new, BlockRegistry.SLIME_PACKER).build());


}