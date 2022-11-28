package mrthomas20121.functional_storage_extra.api;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.util.IWoodType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;

public enum CustomWoodType implements IWoodType {

    ARCHITECTS_PALETTE_TWISTED("architects_palette", "twisted_log", "twisted_planks"),
    ARS_NOUVEAU_ARCHWOOD("ars_nouveau", "blue_archwood_log", "archwood_planks"),
    BIOMESOPLENTY_FIR("biomesoplenty", "fir_log", "fir_planks"),
    BIOMESOPLENTY_REDWOOD("biomesoplenty", "redwood_log", "redwood_planks"),
    BIOMESOPLENTY_CHERRY("biomesoplenty", "cherry_log", "cherry_planks"),
    BIOMESOPLENTY_MAHOGANY("biomesoplenty", "mahogany_log", "mahogany_planks"),
    BIOMESOPLENTY_JACARANDA("biomesoplenty", "jacaranda_log", "jacaranda_planks"),
    BIOMESOPLENTY_PALM("biomesoplenty", "palm_log", "palm_planks"),
    BIOMESOPLENTY_WILLOW("biomesoplenty", "willow_log", "willow_planks"),
    BIOMESOPLENTY_DEAD("biomesoplenty", "dead_log", "dead_planks"),
    BIOMESOPLENTY_MAGIC("biomesoplenty", "magic_log", "magic_planks"),
    BIOMESOPLENTY_UMBRAN("biomesoplenty", "umbran_log", "umbran_planks"),
    BIOMESOPLENTY_HELLBARK("biomesoplenty", "hellbark_log", "hellbark_planks"),
    BLUE_SKIES_BLUEBRIGHT("blue_skies", "bluebright_log", "bluebright_planks"),
    BLUE_SKIES_STARLIT("blue_skies", "starlit_log", "starlit_planks"),
    BLUE_SKIES_FROSTBRIGHT("blue_skies", "frostbright_log", "frostbright_planks"),
    BLUE_SKIES_LUNAR("blue_skies", "lunar_log", "lunar_planks"),
    BLUE_SKIES_DUSK("blue_skies", "dusk_log", "dusk_planks"),
    BLUE_SKIES_MAPLE("blue_skies", "maple_log", "maple_planks"),
    BLUE_SKIES_CRYSTALLIZED("blue_skies", "crystallized_log", "crystallized_planks"),
    BLUE_SKIES_CHERRY("blue_skies", "cherry_log", "cherry_planks"),
    BOTANIA_LIVINGWOOD("botania", "livingwood_log", "livingwood_planks"),
    BOTANIA_DREAMWOOD("botania", "dreamwood_log", "dreamwood_planks"),
    BOTANIA_SHIMMERWOOD("botania", "dreamwood_log", "shimmerwood_planks"),
    BYG_ASPEN("byg", "aspen_log", "aspen_planks"),
    BYG_BAOBAB("byg", "baobab_log", "baobab_planks"),
    BYG_BLUE_ENCHANTED("byg", "blue_enchanted_log", "blue_enchanted_planks"),
    BYG_BULBIS("byg", "bulbis_log", "bulbis_planks"),
    BYG_CHERRY("byg", "cherry_log", "cherry_planks"),
    BYG_CIKA("byg", "cika_log", "cika_planks"),
    BYG_CYPRESS("byg", "cypress_log", "cypress_planks"),
    BYG_EBONY("byg", "ebony_log", "ebony_planks"),
    BYG_ETHER("byg", "ether_log", "ether_planks"),
    BYG_FIR("byg", "fir_log", "fir_planks"),
    BYG_GREEN_ENCHANTED("byg", "green_enchanted_log", "green_enchanted_planks"),
    BYG_HOLLY("byg", "holly_log", "holly_planks"),
    BYG_IMPARIUS("byg", "imparius_stem", "imparius_planks"),
    BYG_JACARANDA("byg", "jacaranda_log", "jacaranda_planks"),
    BYG_LAMENT("byg", "lament_log", "lament_planks"),
    BYG_MAHOGANY("byg", "mahogany_log", "mahogany_planks"),
    BYG_MANGROVE("byg", "mangrove_log", "mangrove_planks"),
    BYG_MAPLE("byg", "maple_log", "maple_planks"),
    BYG_NIGHTSHADE("byg", "nightshade_log", "nightshade_planks"),
    BYG_PALM("byg", "palm_log", "palm_planks"),
    BYG_PINE("byg", "pine_log", "pine_planks"),
    BYG_RAINBOW_EUCALYPTUS("byg", "rainbow_eucalyptus_log", "rainbow_eucalyptus_planks"),
    BYG_REDWOOD("byg", "redwood_log", "redwood_planks"),
    BYG_SKYRIS("byg", "skyris_log", "skyris_planks"),
    BYG_WILLOW("byg", "willow_log", "willow_planks"),
    BYG_WITCH_HAZEL("byg", "witch_hazel_log", "witch_hazel_planks"),
    BYG_ZELKOVA("byg", "zelkova_log", "zelkova_planks"),
    BYG_SYTHIAN("byg", "sythian_stem", "sythian_planks"),
    BYG_EMBUR("byg", "embur_pedu", "embur_planks"),
    FORBIDDEN_ARCANUS_FUNGYSS("forbidden_arcanus", "fungyss_stem", "fungyss_planks"),
    FORBIDDEN_ARCANUS_CHERRYWOOD("forbidden_arcanus", "cherrywood_log", "cherrywood_planks"),
    FORBIDDEN_ARCANUS_MYSTERYWOOD("forbidden_arcanus", "mysterywood_log", "mysterywood_planks"),
    FORBIDDEN_ARCANUS_EDELWOOD("forbidden_arcanus", "edelwood_log", "edelwood_planks"),
    FORCECRAFT_FORCE("forcecraft", "force_log", "force_planks"),
    HEXEREI_MAHOGANY("hexerei", "mahogany_log", "mahogany_planks"),
    HEXEREI_WILLOW("hexerei", "willow_log", "willow_planks"),
    IMMERSIVEENGINEERING_TREATED_WOOD("immersiveengineering", "treated_wood_planks"),
    MALUM_RUNEWOOD("malum", "runewood_log", "runewood_planks"),
    MALUM_SOULWOOD("malum", "soulwood_log", "soulwood_planks"),
    NATURESAURA_ANCIENT("naturesaura", "ancient_log", "ancient_planks"),
    TWILIGHTFOREST_TWILIGHT_OAK("twilightforest", "twilight_oak_log", "twilight_oak_planks"),
    TWILIGHTFOREST_CANOPY("twilightforest", "canopy_log", "canopy_planks"),
    TWILIGHTFOREST_MANGROVE("twilightforest", "mangrove_log", "mangrove_planks"),
    TWILIGHTFOREST_DARKWOOD("twilightforest", "dark_log", "darkwood_planks"),
    TWILIGHTFOREST_TIMEWOOD("twilightforest", "time_log", "timewood_planks"),
    TWILIGHTFOREST_TRANSWOOD("twilightforest", "transformation_log", "transwood_planks"),
    TWILIGHTFOREST_MINEWOOD("twilightforest", "mining_log", "minewood_planks"),
    TWILIGHTFOREST_SORTINGWOOD("twilightforest", "sorting_log", "sortingwood_planks"),
    UNDERGARDEN_SMOGSTEM("undergarden", "smogstem_log", "smogstem_planks"),
    UNDERGARDEN_WIGGLEWOOD("undergarden", "wigglewood_log", "wigglewood_planks"),
    UNDERGARDEN_GRONGLE("undergarden", "grongle_log", "grongle_planks"),
    TCONSTRUCT_NAHUATL("tconstruct", "nahuatl_planks"),
    TCONSTRUCT_GREENHEART("tconstruct", "greenheart_log", "greenheart_planks"),
    TCONSTRUCT_SKYROOT("tconstruct", "skyroot_log", "skyroot_planks"),
    TCONSTRUCT_BLOODSHROOM("tconstruct", "bloodshroom_log", "bloodshroom_planks");

    private final String modID;
    private final String logName;
    private final String plankName;

    CustomWoodType(String modID, String logName, String plankName) {
        this.modID = modID;
        this.logName = logName;
        this.plankName = plankName;
    }

    CustomWoodType(String modID, String plankName) {
        this(modID, plankName, plankName);
    }

    @Override
    public Block getWood() {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(this.modID, this.logName));
    }

    @Override
    public Block getPlanks() {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(this.modID, this.plankName));
    }

    @Override
    public String getName() {
        return this.name().toLowerCase();
    }

    public boolean isModLoaded() {
        return ModList.get().isLoaded(this.modID);
    }
}
