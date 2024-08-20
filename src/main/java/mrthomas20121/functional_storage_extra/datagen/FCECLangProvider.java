package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import mrthomas20121.functional_storage_extra.FunctionalStorageExtra;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.text.WordUtils;

import java.util.Objects;

public class FCECLangProvider extends LanguageProvider {


    public FCECLangProvider(DataGenerator output) {
        super(output, FunctionalStorageExtra.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (CustomWoodType woodType: CustomWoodType.VALUES) {
            for (FunctionalStorage.DrawerType type: FunctionalStorage.DrawerType.values()) {
                String blockName = "%s_%s_%s".formatted(woodType.getModID(), woodType.getName(), type.getSlots());
                String name = "%s %s %s".formatted(WordUtils.capitalize(woodType.getModID()), WordUtils.capitalize(woodType.getName()), type.getSlots());
                this.add(Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(FunctionalStorage.MOD_ID, blockName))), name);
            }
        }
    }
}
