package smallsecret.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import smallsecret.SmallSecretMod;

import static smallsecret.item.SmallSecretToolMaterials.*;

public class SmallSecretModItems {
    public static final Item OBSIDIAN_ALLOY_NUGGET = registerItem("obsidian_alloy_nugget", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_INGOT = registerItem("obsidian_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_PIECE_OF_OBSIDIAN_ALLOY = registerItem("raw_piece_of_obsidian_alloy", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_PICKAXE = registerItem(
            "obsidian_alloy_pickaxe",
            new PickaxeItem(OBSIDIAN_ALLOY, 2, -2.8f, new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_AXE = registerItem(
            "obsidian_alloy_axe",
            new AxeItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_BATTLEAXE = registerItem(
            "obsidian_alloy_battleaxe",
            new AxeItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_SHOVEL = registerItem(
            "obsidian_alloy_shovel",
            new ShovelItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));

    public static final Item OBSIDIAN_ALLOY_HOE = registerItem(
            "obsidian_alloy_hoe",
            new HoeItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_SWORD = registerItem(
            "obsidian_alloy_sword",
            new SwordItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));
    public static final Item OBSIDIAN_ALLOY_BIG_SWORD = registerItem(
            "obsidian_alloy_big_sword",
            new SwordItem(OBSIDIAN_ALLOY, 7, -3.05f, new FabricItemSettings()));
    public static final Item[] SMALL_SECRET_ITEMS = new Item[]{
            OBSIDIAN_ALLOY_NUGGET,
            OBSIDIAN_ALLOY_INGOT,
            RAW_PIECE_OF_OBSIDIAN_ALLOY,
            OBSIDIAN_ALLOY_SHOVEL,
            OBSIDIAN_ALLOY_PICKAXE,
            OBSIDIAN_ALLOY_AXE,
            OBSIDIAN_ALLOY_HOE,
            OBSIDIAN_ALLOY_SWORD,
            OBSIDIAN_ALLOY_BIG_SWORD,
            OBSIDIAN_ALLOY_BATTLEAXE,
    };
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SmallSecretMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SmallSecretMod.LOGGER.info("Registering items for " + SmallSecretMod.MOD_ID);
    }
}
