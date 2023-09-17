package smallsecret.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import smallsecret.SmallSecretMod;
import smallsecret.block.SmallSecretModBlocks;

public class SmallSecretModItemGroups {
    public static final ItemGroup SMALL_SECRET_GROUP = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(SmallSecretMod.MOD_ID, "smallsecret"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smallsecret")).icon(() -> new ItemStack(SmallSecretModItems.OBSIDIAN_ALLOY_INGOT)).entries(((displayContext, entries) -> {
                    for (int i = 0; i < SmallSecretModItems.SMALL_SECRET_ITEMS.length; i++) {
                        entries.add(SmallSecretModItems.SMALL_SECRET_ITEMS[i]);
                    }
                    for (int i = 0; i < SmallSecretModBlocks.SMALL_SECRET_BLOCKS.length; i++) {
                        entries.add(SmallSecretModBlocks.SMALL_SECRET_BLOCKS[i]);
                    }
                })).build());

    public static void registerItemGroups() {
        SmallSecretMod.LOGGER.info("Registering Item Groups for:" + SmallSecretMod.MOD_ID);
    }
}
