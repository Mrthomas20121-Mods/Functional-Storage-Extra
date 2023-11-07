package mrthomas20121.functional_storage_extra.api;

import com.buuz135.functionalstorage.util.IWoodType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

public enum CustomWoodType implements IWoodType {

    aether_skyroot("aether", "skyroot_log", "skyroot_planks"),
    ad_astra_aeronos("ad_astra", "aeronos_stem", "aeronos_planks"),
    ad_astra_strophar("ad_astra", "strophar_stem", "strophar_planks"),
    ad_astra_glacian("ad_astra", "glacian_log", "glacian_planks"),
    atmospheric_rosewood("atmospheric", "rosewood_log", "rosewood_planks"),
    atmospheric_morado("atmospheric", "morado_log", "morado_planks"),
    atmospheric_yucca("atmospheric", "yucca_log", "yucca_planks"),
    atmospheric_kousa("atmospheric", "kousa_log", "kousa_planks"),
    atmospheric_aspen("atmospheric", "watchful_aspen_log", "watchful_aspen_planks"),
    atmospheric_grimwood("atmospheric", "grimwood_log", "grimwood_planks"),
    ars_nouveau_archwood("ars_nouveau", "blue_archwood_log", "archwood_planks"),
    atlantis_atlantean("atlantis", "atlantean_log", "atlantean_planks"),
    autumnity_maple("autumnity", "maple_log", "maple_planks"),
    biomemakeover_blighted_balsa("biomemakeover", "blighted_balsa_log", "blighted_balsa_planks"),
    biomemakeover_willow("biomemakeover", "willow_log", "willow_planks"),
    biomemakeover_swamp_cypress("biomemakeover", "swamp_cypress_log", "swamp_cypress_planks"),
    biomemakeover_ancient_oak("biomemakeover", "ancient_oak_log", "ancient_oak_planks"),
    biomesoplenty_fir("biomesoplenty", "fir_log", "fir_planks"),
    biomesoplenty_redwood("biomesoplenty", "redwood_log", "redwood_planks"),
    biomesoplenty_cherry("biomesoplenty", "cherry_log", "cherry_planks"),
    biomesoplenty_mahogany("biomesoplenty", "mahogany_log", "mahogany_planks"),
    biomesoplenty_jacaranda("biomesoplenty", "jacaranda_log", "jacaranda_planks"),
    biomesoplenty_palm("biomesoplenty", "palm_log", "palm_planks"),
    biomesoplenty_willow("biomesoplenty", "willow_log", "willow_planks"),
    biomesoplenty_dead("biomesoplenty", "dead_log", "dead_planks"),
    biomesoplenty_magic("biomesoplenty", "magic_log", "magic_planks"),
    biomesoplenty_umbran("biomesoplenty", "umbran_log", "umbran_planks"),
    biomesoplenty_hellbark("biomesoplenty", "hellbark_log", "hellbark_planks"),
    blue_skies_bluebright("blue_skies", "bluebright_log", "bluebright_planks"),
    blue_skies_starlit("blue_skies", "starlit_log", "starlit_planks"),
    blue_skies_frostbright("blue_skies", "frostbright_log", "frostbright_planks"),
    blue_skies_lunar("blue_skies", "lunar_log", "lunar_planks"),
    blue_skies_dusk("blue_skies", "dusk_log", "dusk_planks"),
    blue_skies_crystallized("blue_skies", "crystallized_log", "crystallized_planks"),
    blue_skies_cherry("blue_skies", "cherry_log", "cherry_planks"),
    botania_livingwood("botania", "livingwood_log", "livingwood_planks"),
    botania_dreamwood("botania", "dreamwood_log", "dreamwood_planks"),
    botania_glimmering_dream("botania", "glimmering_dream_log", "glimmering_dream_planks"),
    byg_aspen("byg", "aspen_log", "aspen_planks"),
    byg_baobab("byg", "baobab_log", "baobab_planks"),
    byg_blue_enchanted("byg", "blue_enchanted_log", "blue_enchanted_planks"),
    byg_bulbis("byg", "bulbis_stem", "bulbis_planks"),
    byg_cherry("byg", "cherry_log", "cherry_planks"),
    byg_cika("byg", "cika_log", "cika_planks"),
    byg_cypress("byg", "cypress_log", "cypress_planks"),
    byg_ebony("byg", "ebony_log", "ebony_planks"),
    byg_embur("byg", "embur_log", "embur_planks"),
    byg_ether("byg", "ether_log", "ether_planks"),
    byg_fir("byg", "fir_log", "fir_planks"),
    byg_green_enchanted("byg", "green_enchanted_log", "green_enchanted_planks"),
    byg_holly("byg", "holly_log", "holly_planks"),
    byg_imparius("byg", "imparius_stem", "imparius_planks"),
    byg_lament("byg", "lament_log", "lament_planks"),
    byg_jacaranda("byg", "jacaranda_log", "jacaranda_planks"),
    byg_mahogany("byg", "mahogany_log", "mahogany_planks"),
    byg_white_mangrove("byg", "white_mangrove_log", "white_mangrove_planks"),
    byg_maple("byg", "maple_log", "maple_planks"),
    byg_nightshade("byg", "nightshade_log", "nightshade_planks"),
    byg_palm("byg", "palm_log", "palm_planks"),
    byg_pine("byg", "pine_log", "pine_planks"),
    byg_rainbow_eucalyptus("byg", "rainbow_eucalyptus_log", "rainbow_eucalyptus_planks"),
    byg_redwood("byg", "redwood_log", "redwood_planks"),
    byg_skyris("byg", "skyris_log", "skyris_planks"),
    byg_willow("byg", "willow_log", "willow_planks"),
    byg_witch_hazel("byg", "witch_hazel_log", "witch_hazel_planks"),
    byg_zelkova("byg", "zelkova_log", "zelkova_planks"),
    byg_sythian("byg", "sythian_stem", "sythian_planks"),
    deeperdarker_echo("deeperdarker", "echo_log", "echo_planks"),
    dreamland_plum_birch("dreamland", "plum_birch_log", "plum_birch_planks"),
    dreamland_tar_bark("dreamland", "tar_bark_log", "tar_bark_planks"),
    dreamland_mold_wood("dreamland", "mold_wood_log", "mold_wood_planks"),
    ecologics_coconut("ecologics", "coconut_log", "coconut_planks"),
    ecologics_walnut("ecologics", "walnut_log", "walnut_planks"),
    ecologics_azalea("ecologics", "azalea_log", "azalea_planks"),
    environmental_willow("environmental", "willow_log", "willow_planks"),
    environmental_cherry("environmental", "cherry_log", "cherry_planks"),
    environmental_wisteria("environmental", "wisteria_log", "wisteria_planks"),
    evilcraft_undead("evilcraft", "undead_log", "undead_planks"),
    feywild_hexen("feywild", "hexen_tree_log", "hexen_tree_planks"),
    feywild_blossom("feywild", "blossom_tree_log", "blossom_tree_planks"),
    feywild_winter("feywild", "winter_tree_log", "winter_tree_planks"),
    feywild_autumn("feywild", "autumn_tree_log", "autumn_tree_planks"),
    feywild_summer("feywild", "summer_tree_log", "summer_tree_planks"),
    feywild_spring("feywild", "spring_tree_log", "spring_tree_planks"),
    forcecraft_force("forcecraft", "force_log", "force_planks"),
    forbidden_arcanus_cherry("forbidden_arcanus", "cherry_log", "cherry_planks"),
    forbidden_arcanus_fungyss("forbidden_arcanus", "fungyss_stem", "fungyss_planks"),
    forbidden_arcanus_aurum("forbidden_arcanus", "aurum_log", "aurum_planks"),
    forbidden_arcanus_edelwood("forbidden_arcanus", "edelwood_log", "edelwood_planks"),
    gardens_of_the_dead_soul_blight("gardens_of_the_dead", "soul_blight_stem", "soul_blight_planks"),
    hexerei_mahogany("hexerei", "mahogany_log", "mahogany_planks"),
    hexerei_willow("hexerei", "willow_log", "willow_planks"),
    hexcasting_edified("hexcasting", "edified_log", "edified_planks"),
    naturesaura_ancient("naturesaura", "ancient_log", "ancient_planks"),
    premium_wood_maple("premium_wood", "maple_log", "maple_planks"),
    premium_wood_silverbell("premium_wood", "silverbell_log", "silverbell_planks"),
    premium_wood_purple_heart("premium_wood", "purple_heart_log", "purple_heart_planks"),
    premium_wood_tiger("premium_wood", "tiger_log", "tiger_planks"),
    premium_wood_willow("premium_wood", "willow_log", "willow_planks"),
    premium_wood_magic("premium_wood", "magic_log", "magic_planks"),
    quark_blossom("quark", "blossom_log", "blossom_planks"),
    quark_azalea("quark", "azalea_log", "azalea_planks"),
    quark_ancient("quark", "ancient_log", "ancient_planks"),
    regions_unexplored_baobab("regions_unexplored", "baobab_log", "baobab_planks"),
    regions_unexplored_blackwood("regions_unexplored", "blackwood_log", "blackwood_planks"),
    regions_unexplored_blue_bioshroom("regions_unexplored", "blue_bioshroom_stem", "blue_bioshroom_planks"),
    regions_unexplored_brimwood("regions_unexplored", "brimwood_log", "brimwood_planks"),
    regions_unexplored_cobalt("regions_unexplored", "cobalt_log", "cobalt_planks"),
    regions_unexplored_cypress("regions_unexplored", "cypress_log", "cypress_planks"),
    regions_unexplored_dead("regions_unexplored", "dead_log", "dead_planks"),
    regions_unexplored_eucalyptus("regions_unexplored", "eucalyptus_log", "eucalyptus_planks"),
    regions_unexplored_green_bioshroom("regions_unexplored", "green_bioshroom_stem", "green_bioshroom_planks"),
    regions_unexplored_joshua("regions_unexplored", "joshua_log", "joshua_planks"),
    regions_unexplored_kapok("regions_unexplored", "kapok_log", "kapok_planks"),
    regions_unexplored_larch("regions_unexplored", "larch_log", "larch_planks"),
    regions_unexplored_magnolia("regions_unexplored", "magnolia_log", "magnolia_planks"),
    regions_unexplored_maple("regions_unexplored", "maple_log", "maple_planks"),
    regions_unexplored_mauve("regions_unexplored", "mauve_log", "mauve_planks"),
    regions_unexplored_palm("regions_unexplored", "palm_log", "palm_planks"),
    regions_unexplored_pine("regions_unexplored", "pine_log", "pine_planks"),
    regions_unexplored_pink_bioshroom("regions_unexplored", "pink_bioshroom_stem", "pink_bioshroom_planks"),
    regions_unexplored_redwood("regions_unexplored", "redwood_log", "redwood_planks"),
    regions_unexplored_socotra("regions_unexplored", "socotra_log", "socotra_planks"),
    regions_unexplored_willow("regions_unexplored", "willow_log", "willow_planks"),
    regions_unexplored_yellow_bioshroom("regions_unexplored", "yellow_bioshroom_log", "yellow_bioshroom_planks"),
    theabyss_blaru("theabyss", "blaru_log", "blaru_planks"),
    theabyss_bog_shroom("theabyss", "bog_shroom_log", "bog_shroom_planks"),
    theabyss_nightgrove("theabyss", "nightgrove_log", "nightgrove_planks"),
    theabyss_rotten("theabyss", "rotten_log", "rotten_planks"),
    theabyss_sal_shroom("theabyss", "sal_shroom_log", "sal_shroom_planks"),
    theabyss_slimed("theabyss", "slimed_log", "slimed_planks"),
    theabyss_frozen("theabyss", "frozen_log", "frozen_planks"),
    totemic_red_cedar("totemic", "red_cedar_log", "red_cedar_planks"),
    twilightforest_twilight_oak("twilightforest", "twilight_oak_log", "twilight_oak_planks"),
    twilightforest_canopy("twilightforest", "canopy_log", "canopy_planks"),
    twilightforest_mangrove("twilightforest", "mangrove_log", "mangrove_planks"),
    twilightforest_dark("twilightforest", "dark_log", "dark_planks"),
    twilightforest_time("twilightforest", "time_log", "time_planks"),
    twilightforest_transformation("twilightforest", "transformation_log", "transformation_planks"),
    twilightforest_mining("twilightforest", "mining_log", "mining_planks"),
    twilightforest_sorting("twilightforest", "sorting_log", "sorting_planks"),
    undergarden_smogstem("undergarden", "smogstem_log", "smogstem_planks"),
    undergarden_wigglewood("undergarden", "wigglewood_log", "wigglewood_planks"),
    undergarden_grongle("undergarden", "grongle_log", "grongle_planks"),
    vampirism_dark_spruce("vampirism", "dark_spruce_log", "dark_spruce_planks"),
    vampirism_cursed_spruce("vampirism", "cursed_spruce_log", "cursed_spruce_planks");

    private final String modID;
    private final String logName;
    private final String plankName;

    CustomWoodType(String modID, String logName, String plankName) {
        this.modID = modID;
        this.logName = logName;
        this.plankName = plankName;
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
