package smallsecret;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import smallsecret.block.SmallSecretModBlocks;
import smallsecret.item.SmallSecretModItemGroups;
import smallsecret.item.SmallSecretModItems;

public class SmallSecretMod implements ModInitializer {
    public static final String MOD_ID = "smallsecret";
	public static final Logger LOGGER = LoggerFactory.getLogger("smallsecret");

	@Override
	public void onInitialize() {
		SmallSecretModItemGroups.registerItemGroups();
		SmallSecretModItems.registerModItems();
		SmallSecretModBlocks.registerModBlocks();
	}
}