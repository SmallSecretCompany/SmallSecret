package smallsecret.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import smallsecret.item.SmallSecretModItems;

public class SmallSecretModModelProvider extends FabricModelProvider {

    public SmallSecretModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_HOE, Models.HANDHELD);
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SmallSecretModItems.OBSIDIAN_ALLOY_BIG_SWORD, Models.HANDHELD);
    }
}
