package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class FCEBlockTagsProvider extends BlockTagsProvider {
    public FCEBlockTagsProvider(DataGenerator p_126511_) {
        super(p_126511_);
    }

    //public FCEBlockTagsProvider(DataGenerator dataGenerator, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
    //    super(dataGenerator.getPackOutput(), lookupProvider, FunctionalTFC.mod_id, existingFileHelper);
    //}

    @Override
    protected void addTags() {
        TagAppender<Block> axeMineable = this.tag(BlockTags.MINEABLE_WITH_AXE);
        for (CustomWoodType woodType: CustomWoodType.VALUES) {
            for (FunctionalStorage.DrawerType type: FunctionalStorage.DrawerType.values()) {
                String blockName = "%s_%s".formatted(woodType.getName(), type.getSlots());
                axeMineable.addOptional(new ResourceLocation(FunctionalStorage.MOD_ID, blockName));
            }
        }
    }

}