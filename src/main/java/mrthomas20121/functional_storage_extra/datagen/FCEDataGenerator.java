package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.block.CompactingDrawerBlock;
import com.buuz135.functionalstorage.block.DrawerBlock;
import com.buuz135.functionalstorage.block.FluidDrawerBlock;
import com.buuz135.functionalstorage.block.SimpleCompactingDrawerBlock;
import com.hrznstudio.titanium.datagenerator.loot.TitaniumLootTableProvider;
import com.hrznstudio.titanium.datagenerator.model.BlockItemModelGeneratorProvider;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.util.NonNullLazy;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.buuz135.functionalstorage.FunctionalStorage.MOD_ID;

public class FCEDataGenerator {

    public static String getBlockName(Block block) {
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
    }

    public static ResourceLocation getRegistryName(Block block) {
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
    }

    public static String getModelBlockName(Block block) {
        ResourceLocation loc = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
        return loc.getNamespace()+":block/"+loc.getPath();
    }

    public static void init(GatherDataEvent event) {

        List<Block> blocks = new ArrayList<>();

        for (CustomWoodType woodType: CustomWoodType.VALUES) {
            for (FunctionalStorage.DrawerType type : FunctionalStorage.DrawerType.values()) {
                String blockName = "%s_%s".formatted(woodType.getName(), type.getSlots());
                blocks.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MOD_ID, blockName)));
            }
        }

        NonNullLazy<List<Block>> blocksToProcess = NonNullLazy.of(() -> blocks);

        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // client
        event.getGenerator().addProvider(event.includeClient(), new FCECLangProvider(dataGenerator));
        event.getGenerator().addProvider(event.includeClient(), new FCEBlockstateProvider(dataGenerator, existingFileHelper));
        event.getGenerator().addProvider(event.includeClient(), new BlockItemModelGeneratorProvider(event.getGenerator(), MOD_ID, blocksToProcess));
        event.getGenerator().addProvider(event.includeClient(), new BlockModelProvider(event.getGenerator(), MOD_ID, existingFileHelper) {
            @Override
            protected void registerModels() {
                for (Block blockRegistryObject : blocks) {
                    String blockName = getBlockName(blockRegistryObject);
                    if(blockName.contains("1")) {
                        withExistingParent(blockName, MOD_ID+":base_x_1")
                                .texture("particle", getModelBlockName(blockRegistryObject).replace("1", "front_1"))
                                .texture("front", getModelBlockName(blockRegistryObject).replace("1", "front_1"))
                                .texture("side", getModelBlockName(blockRegistryObject).replace("1", "side"));
                    }
                    else if(blockName.contains("2")) {
                        withExistingParent(blockName, MOD_ID+":base_x_2")
                                .texture("particle", getModelBlockName(blockRegistryObject).replace("2", "front_2"))
                                .texture("front", getModelBlockName(blockRegistryObject).replace("2", "front_2"))
                                .texture("side", getModelBlockName(blockRegistryObject).replace("2", "side"));
                    }
                    else if(blockName.contains("4")) {
                        withExistingParent(blockName, MOD_ID+":base_x_4")
                                .texture("particle", getModelBlockName(blockRegistryObject).replace("4", "front_4"))
                                .texture("front", getModelBlockName(blockRegistryObject).replace("4", "front_4"))
                                .texture("side", getModelBlockName(blockRegistryObject).replace("4", "side"));
                    }

                    withExistingParent(ForgeRegistries.BLOCKS.getKey(blockRegistryObject).getPath() + "_locked", modLoc(ForgeRegistries.BLOCKS.getKey(blockRegistryObject).getPath()))
                            .texture("lock_icon", modLoc("block/lock"));
                }
            }
        });
        event.getGenerator().addProvider(event.includeClient(), new ItemModelProvider(event.getGenerator(), MOD_ID, existingFileHelper) {
            @Override
            protected void registerModels() {
                blocksToProcess.get().forEach(block -> {
                    if ((block instanceof DrawerBlock) || (block instanceof CompactingDrawerBlock) || (block instanceof SimpleCompactingDrawerBlock) || (block instanceof FluidDrawerBlock)){
                        withUnchecked(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation("minecraft", "builtin/entity"));
                    } else {
                        withUnchecked(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
                    }
                });
            }

            private void item(Item item) {
                withUnchecked(ForgeRegistries.ITEMS.getKey(item).getPath(), new ResourceLocation("minecraft:item/generated")).texture( "layer0", new ResourceLocation(MOD_ID, "item/" + ForgeRegistries.ITEMS.getKey(item).getPath()));
            }

            private ItemModelBuilder withUnchecked(String name, ResourceLocation parent){
                return getBuilder(name).parent(new ModelFile.UncheckedModelFile(parent));
            }
        });

        // server
        FCEBlockTagsProvider blockTagsProvider = new FCEBlockTagsProvider(dataGenerator);
        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
        dataGenerator.addProvider(event.includeServer(), new FCEItemTagsProvider(dataGenerator, blockTagsProvider, existingFileHelper));
        dataGenerator.addProvider(event.includeServer(), new TitaniumLootTableProvider(dataGenerator, blocksToProcess));
        dataGenerator.addProvider(event.includeServer(), new FCERecipesProvider(dataGenerator));
    }
}
