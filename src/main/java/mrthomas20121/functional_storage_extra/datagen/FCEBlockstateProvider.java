package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.block.*;
import com.hrznstudio.titanium.block.RotatableBlock;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.util.NonNullLazy;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class FCEBlockstateProvider extends BlockStateProvider {

    public FCEBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FunctionalStorage.MOD_ID, exFileHelper);
    }

    public static ResourceLocation getModel(Block block) {
        return new ResourceLocation(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath());
    }

    public static ResourceLocation getModelLocked(Block block) {
        return new ResourceLocation(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath() + "_locked");
    }

    @Override
    protected void registerStatesAndModels() {
        for(CustomWoodType woodType: CustomWoodType.VALUES) {
            for(FunctionalStorage.DrawerType type: FunctionalStorage.DrawerType.values()) {
                // block name
                String name = woodType.getName() + "_" + type.getSlots();
                ResourceLocation blockName = new ResourceLocation(FunctionalStorage.MOD_ID, name);
                Block drawer = ForgeRegistries.BLOCKS.getValue(blockName);

                if(drawer instanceof RotatableBlock<?> rotatableBlock) {
                    VariantBlockStateBuilder builder = getVariantBuilder(rotatableBlock);
                    if (rotatableBlock.getRotationType().getProperties().length > 0) {
                        for (DirectionProperty property : rotatableBlock.getRotationType().getProperties()) {
                            for (Direction allowedValue : property.getPossibleValues()) {
                                if (rotatableBlock instanceof DrawerBlock || rotatableBlock instanceof CompactingDrawerBlock || rotatableBlock instanceof EnderDrawerBlock || rotatableBlock instanceof FluidDrawerBlock || rotatableBlock instanceof SimpleCompactingDrawerBlock) {
                                    builder.partialState().with(property, allowedValue).with(DrawerBlock.LOCKED, false)
                                            .addModels(new ConfiguredModel(new ModelFile.UncheckedModelFile(getModel(rotatableBlock)), allowedValue.get2DDataValue() == -1 ? allowedValue.getOpposite().getAxisDirection().getStep() * 90 : 0, (int) allowedValue.getOpposite().toYRot(), true));
                                    builder.partialState().with(property, allowedValue).with(DrawerBlock.LOCKED, true)
                                            .addModels(new ConfiguredModel(new ModelFile.UncheckedModelFile(getModelLocked(rotatableBlock)), allowedValue.get2DDataValue() == -1 ? allowedValue.getOpposite().getAxisDirection().getStep() * 90 : 0, (int) allowedValue.getOpposite().toYRot(), true));
                                } else {
                                    builder.partialState().with(property, allowedValue)
                                            .addModels(new ConfiguredModel(new ModelFile.UncheckedModelFile(getModel(rotatableBlock)), allowedValue.get2DDataValue() == -1 ? allowedValue.getOpposite().getAxisDirection().getStep() * 90 : 0, (int) allowedValue.getOpposite().toYRot(), true));
                                }
                            }
                        }
                    } else {
                        builder.partialState().addModels(new ConfiguredModel(new ModelFile.UncheckedModelFile(getModel(rotatableBlock))));
                    }
                }
            }
        }
    }
}