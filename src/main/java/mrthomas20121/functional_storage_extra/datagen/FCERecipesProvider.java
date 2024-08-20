package mrthomas20121.functional_storage_extra.datagen;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.hrznstudio.titanium.recipe.generator.TitaniumRecipeProvider;
import mrthomas20121.functional_storage_extra.FunctionalStorageExtra;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class FCERecipesProvider extends TitaniumRecipeProvider implements IConditionBuilder {

    public FCERecipesProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void register(Consumer<FinishedRecipe> consumer) {
        // todo: use the wood type to change the recipe
        for(CustomWoodType woodType: CustomWoodType.VALUES) {
            for(FunctionalStorage.DrawerType type: FunctionalStorage.DrawerType.values()) {
                // block name
                String name = woodType.getName() + "_" + type.getSlots();
                ResourceLocation blockName = new ResourceLocation(FunctionalStorage.MOD_ID, name);
                Block drawer = ForgeRegistries.BLOCKS.getValue(blockName);

                switch (type) {
                    case X_1 -> ConditionalRecipe.builder()
                            .addCondition(new ModLoadedCondition(woodType.getModID()))
                            .addRecipe(c -> ShapedRecipeBuilder.shaped(drawer)
                                    .define('P', woodType.getWood())
                                    .define('C', Tags.Items.CHESTS_WOODEN)
                                    .pattern("PPP")
                                    .pattern("PCP")
                                    .pattern("PPP")
                                    .unlockedBy(getHasName(woodType.getPlanks()), has(woodType.getPlanks()))
                                    .save(c)).build(consumer, new ResourceLocation(FunctionalStorageExtra.MOD_ID, "crafting/"+name));
                    case X_2 -> ConditionalRecipe.builder()
                            .addCondition(new ModLoadedCondition(woodType.getModID()))
                            .addRecipe(c -> ShapedRecipeBuilder.shaped(drawer)
                                    .define('P', woodType.getWood())
                                    .define('C', Tags.Items.CHESTS_WOODEN)
                                    .pattern("PCP")
                                    .pattern("PPP")
                                    .pattern("PCP")
                                    .unlockedBy(getHasName(woodType.getPlanks()), has(woodType.getPlanks()))
                                    .save(c)).build(consumer, new ResourceLocation(FunctionalStorageExtra.MOD_ID, "crafting/"+name));
                    case X_4 -> ConditionalRecipe.builder()
                            .addCondition(new ModLoadedCondition(woodType.getModID()))
                            .addRecipe(c -> ShapedRecipeBuilder.shaped(drawer)
                                    .define('P', woodType.getWood())
                                    .define('C', Tags.Items.CHESTS_WOODEN)
                                    .pattern("CPC")
                                    .pattern("PPP")
                                    .pattern("CPC")
                                    .unlockedBy(getHasName(woodType.getPlanks()), has(woodType.getPlanks()))
                                    .save(c)).build(consumer, new ResourceLocation(FunctionalStorageExtra.MOD_ID, "crafting/"+name));
                }

            }
        }
    }
}
