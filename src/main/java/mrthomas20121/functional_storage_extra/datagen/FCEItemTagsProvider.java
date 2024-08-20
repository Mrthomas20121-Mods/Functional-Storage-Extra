package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.util.StorageTags;
import mrthomas20121.functional_storage_extra.FunctionalStorageExtra;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

public class FCEItemTagsProvider extends ItemTagsProvider {

    public FCEItemTagsProvider(DataGenerator p_126530_, BlockTagsProvider p_126531_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, FunctionalStorageExtra.MOD_ID, existingFileHelper);
    }


    //public FCEItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> lookupCompletableFuture, String modId, @Nullable ExistingFileHelper existingFileHelper) {
    //    super(packOutput, completableFuture, lookupCompletableFuture, modId, existingFileHelper);
    //}

    @Override
    protected void addTags() {
        TagsProvider.TagAppender<Item> drawerTag = this.tag(StorageTags.DRAWER);
        for (CustomWoodType woodType: CustomWoodType.VALUES) {
            for (FunctionalStorage.DrawerType type: FunctionalStorage.DrawerType.values()) {
                String blockName = "%s_%s".formatted(woodType.getName(), type.getSlots());
                drawerTag.addOptional(new ResourceLocation(FunctionalStorage.MOD_ID, blockName));
            }
        }
    }

    @Override
    public String getName()
    {
        return "Functional Storage Item Tags";
    }

}