package mrthomas20121.functional_storage_extra;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.hrznstudio.titanium.module.ModuleController;
import mrthomas20121.functional_storage_extra.api.CustomWoodType;
import mrthomas20121.functional_storage_extra.datagen.FCEDataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

@Mod(FunctionalStorageExtra.MOD_ID)
public class FunctionalStorageExtra extends ModuleController {

	public static final String MOD_ID = "functional_storage_extra";
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	protected void initModules() {
		Arrays.stream(CustomWoodType.values()).filter(CustomWoodType::isModLoaded).forEach(FunctionalStorage.WOOD_TYPES::add);
	}

	@Override
	public void addDataProvider(GatherDataEvent event) {
		FCEDataGenerator.init(event);
	}
}
