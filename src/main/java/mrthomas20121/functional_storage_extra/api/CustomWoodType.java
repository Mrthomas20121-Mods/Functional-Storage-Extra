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

    ad_astra_aeronos("ad_astra", "aeronos_stem", "aeronos_stem"),
    ad_astra_strophar("ad_astra", "strophar_stem", "strophar_stem"),
    ad_astra_glacian("ad_astra", "glacian_log", "glacian_log"),
    atmospheric_rosewood("atmospheric", "rosewood_log", "rosewood_log"),
    atmospheric_morado("atmospheric", "morado_log", "morado_log"),
    atmospheric_yucca("atmospheric", "yucca_log", "yucca_log"),
    atmospheric_kousa("atmospheric", "kousa_log", "kousa_log"),
    atmospheric_aspen("atmospheric", "watchful_aspen_log", "watchful_aspen_log"),
    atmospheric_grimwood("atmospheric", "grimwood_log", "grimwood_log"),
    ars_nouveau_cascading_archwood("ars_nouveau", "blue_archwood_log", "archwood_planks"),
    ars_nouveau_vexing_archwood("ars_nouveau", "red_archwood_log", "archwood_planks"),
    ars_nouveau_blazing_archwood("ars_nouveau", "red_archwood_log", "archwood_planks"),
    ars_nouveau_flourishing_archwood("ars_nouveau", "green_archwood_log", "archwood_planks"),
    atlantis_atlantean("atlantis", "atlantean_log", "atlantean_log"),
    autumnity_maple("autumnity", "maple_log", "maple_log"),
    biomemakeover_blighted_balsa("biomemakeover", "blighted_balsa_log", "blighted_balsa_log"),
    biomemakeover_willow("biomemakeover", "willow_log", "willow_log"),
    biomemakeover_swamp_cypress("biomemakeover", "swamp_cypress_log", "swamp_cypress_log"),
    biomemakeover_ancient_oak("biomemakeover", "ancient_oak_log", "ancient_oak_log"),
    biomesoplenty_fir("biomesoplenty", "fir_log", "fir_log"),
    biomesoplenty_redwood("biomesoplenty", "redwood_log", "redwood_log"),
    biomesoplenty_cherry("biomesoplenty", "cherry_log", "cherry_log"),
    biomesoplenty_mahogany("biomesoplenty", "mahogany_log", "mahogany_log"),
    biomesoplenty_jacaranda("biomesoplenty", "jacaranda_log", "jacaranda_log"),
    biomesoplenty_palm("biomesoplenty", "palm_log", "palm_log"),
    biomesoplenty_willow("biomesoplenty", "willow_log", "willow_log"),
    biomesoplenty_dead("biomesoplenty", "dead_log", "dead_log"),
    biomesoplenty_magic("biomesoplenty", "magic_log", "magic_log"),
    biomesoplenty_umbran("biomesoplenty", "umbran_log", "umbran_log"),
    biomesoplenty_hellbark("biomesoplenty", "hellbark_log", "hellbark_log"),
    blue_skies_bluebright("blue_skies", "bluebright_log", "bluebright_log"),
    blue_skies_starlit("blue_skies", "starlit_log", "starlit_log"),
    blue_skies_frostbright("blue_skies", "frostbright_log", "frostbright_log"),
    blue_skies_lunar("blue_skies", "lunar_log", "lunar_log"),
    blue_skies_dusk("blue_skies", "dusk_log", "dusk_log"),
    blue_skies_crystallized("blue_skies", "crystallized_log", "crystallized_log"),
    blue_skies_cherry("blue_skies", "cherry_log", "cherry_log"),
    botania_livingwood("botania", "livingwood_log", "livingwood_log"),
    botania_dreamwood("botania", "dreamwood_log", "dreamwood_log"),
    botania_glimmering_dream("botania", "glimmering_dream_log", "glimmering_dream_log"),
    byg_aspen("byg", "aspen_log", "aspen_log"),
    byg_baobab("byg", "baobab_log", "baobab_log"),
    byg_blue_enchanted("byg", "blue_enchanted_log", "blue_enchanted_log"),
    byg_bulbis("byg", "bulbis_stem", "bulbis_stem"),
    byg_cherry("byg", "cherry_log", "cherry_log"),
    byg_cika("byg", "cika_log", "cika_log"),
    byg_cypress("byg", "cypress_log", "cypress_log"),
    byg_ebony("byg", "ebony_log", "ebony_log"),
    byg_embur("byg", "embur_log", "embur_log"),
    byg_ether("byg", "ether_log", "ether_log"),
    byg_fir("byg", "fir_log", "fir_log"),
    byg_green_enchanted("byg", "green_enchanted_log", "green_enchanted_log"),
    byg_holly("byg", "holly_log", "holly_log"),
    byg_imparius("byg", "imparius_stem", "imparius_stem"),
    byg_lament("byg", "lament_log", "lament_log"),
    byg_jacaranda("byg", "jacaranda_log", "jacaranda_log"),
    byg_mahogany("byg", "mahogany_log", "mahogany_log"),
    byg_white_mangrove("byg", "white_mangrove_log", "white_mangrove_log"),
    byg_maple("byg", "maple_log", "maple_log"),
    byg_nightshade("byg", "nightshade_log", "nightshade_log"),
    byg_palm("byg", "palm_log", "palm_log"),
    byg_pine("byg", "pine_log", "pine_log"),
    byg_rainbow_eucalyptus("byg", "rainbow_eucalyptus_log", "rainbow_eucalyptus_log"),
    byg_redwood("byg", "redwood_log", "redwood_log"),
    byg_skyris("byg", "skyris_log", "skyris_log"),
    byg_willow("byg", "willow_log", "willow_log"),
    byg_witch_hazel("byg", "witch_hazel_log", "witch_hazel_log"),
    byg_zelkova("byg", "zelkova_log", "zelkova_log"),
    byg_sythian("byg", "sythian_stem", "sythian_stem"),
    deeperdarker_echo("deeperdarker", "echo_log", "echo_log"),
    dreamland_plum_birch("dreamland", "plum_birch_log", "plum_birch_log"),
    dreamland_tar_bark("dreamland", "tar_bark_log", "tar_bark_log"),
    dreamland_mold_wood("dreamland", "mold_wood_log", "mold_wood_log"),
    ecologics_coconut("ecologics", "coconut_log", "coconut_log"),
    ecologics_walnut("ecologics", "walnut_log", "walnut_log"),
    ecologics_azalea("ecologics", "azalea_log", "azalea_log"),
    environmental_willow("environmental", "willow_log", "willow_log"),
    environmental_cherry("environmental", "cherry_log", "cherry_log"),
    environmental_wisteria("environmental", "wisteria_log", "wisteria_log"),
    evilcraft_undead("evilcraft", "undead_log", "undead_log"),
    feywild_hexen("feywild", "hexen_tree_log", "hexen_tree_log"),
    feywild_blossom("feywild", "blossom_tree_log", "blossom_tree_log"),
    feywild_winter("feywild", "winter_tree_log", "winter_tree_log"),
    feywild_autumn("feywild", "autumn_tree_log", "autumn_tree_log"),
    feywild_summer("feywild", "summer_tree_log", "summer_tree_log"),
    feywild_spring("feywild", "spring_tree_log", "spring_tree_log"),
    forcecraft_force("forcecraft", "force_log", "force_log"),
    forbidden_arcanus_cherry("forbidden_arcanus", "cherry_log", "cherry_log"),
    forbidden_arcanus_fungyss("forbidden_arcanus", "fungyss_stem", "fungyss_stem"),
    forbidden_arcanus_aurum("forbidden_arcanus", "aurum_log", "aurum_log"),
    forbidden_arcanus_edelwood("forbidden_arcanus", "edelwood_log", "edelwood_log"),
    gardens_of_the_dead_soul_blight("gardens_of_the_dead", "soul_blight_stem", "soul_blight_stem"),
    hexerei_mahogany("hexerei", "mahogany_log", "mahogany_log"),
    hexerei_willow("hexerei", "willow_log", "willow_log"),
    hexcasting_edified("hexcasting", "edified_log", "edified_log"),
    naturesaura_ancient("naturesaura", "ancient_log", "ancient_log"),
    premium_wood_maple("premium_wood", "maple_log", "maple_log"),
    premium_wood_silverbell("premium_wood", "silverbell_log", "silverbell_log"),
    premium_wood_purple_heart("premium_wood", "purple_heart_log", "purple_heart_log"),
    premium_wood_tiger("premium_wood", "tiger_log", "tiger_log"),
    premium_wood_willow("premium_wood", "willow_log", "willow_log"),
    premium_wood_magic("premium_wood", "magic_log", "magic_log"),
    quark_blossom("quark", "blossom_log", "blossom_log"),
    quark_azalea("quark", "azalea_log", "azalea_log"),
    quark_ancient("quark", "ancient_log", "ancient_log"),
    theabyss_blaru("theabyss", "blaru_log", "blaru_log"),
    theabyss_jungle("theabyss", "jungle_log", "jungle_log"),
    theabyss_bog_shroom("theabyss", "bog_shroom_log", "bog_shroom_log"),
    theabyss_nightgrove("theabyss", "nightgrove_log", "nightgrove_log"),
    theabyss_rotten("theabyss", "rotten_log", "rotten_log"),
    theabyss_sal_shroom("theabyss", "sal_shroom_log", "sal_shroom_log"),
    theabyss_slimed("theabyss", "slimed_log", "slimed_log"),
    theabyss_frozen("theabyss", "frozen_log", "frozen_log"),
    totemic_red_cedar("totemic", "red_cedar_log", "red_cedar_log"),
    twilightforest_twilight_oak("twilightforest", "twilight_oak_log", "twilight_oak_log"),
    twilightforest_canopy("twilightforest", "canopy_log", "canopy_log"),
    twilightforest_mangrove("twilightforest", "mangrove_log", "mangrove_log"),
    twilightforest_dark("twilightforest", "dark_log", "dark_log"),
    twilightforest_time("twilightforest", "time_log", "time_log"),
    twilightforest_transformation("twilightforest", "transformation_log", "transformation_log"),
    twilightforest_mining("twilightforest", "mining_log", "mining_log"),
    twilightforest_sorting("twilightforest", "sorting_log", "sorting_log"),
    undergarden_smogstem("undergarden", "smogstem_log", "smogstem_log"),
    undergarden_wigglewood("undergarden", "wigglewood_log", "wigglewood_log"),
    undergarden_grongle("undergarden", "grongle_log", "grongle_log"),
    vampirism_dark_spruce("vampirism", "dark_spruce_log", "dark_spruce_log"),
    vampirism_cursed_spruce("vampirism", "cursed_spruce_log", "cursed_spruce_log");

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
