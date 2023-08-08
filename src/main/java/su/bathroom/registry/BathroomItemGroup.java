package su.bathroom.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BathroomItemGroup {
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(BathroomBlocks.BATHROOM_TILES))
			.displayName(Text.translatable("itemGroup.bathroom")).entries((displayContext, entries) -> {
				entries.add(BathroomBlocks.BATHROOM_TILES);
				entries.add(BathroomBlocks.RAW_BATHROOM);
				entries.add(BathroomBlocks.SLIPTILES);
				entries.add(BathroomBlocks.DARK_SLIPTILES);
				entries.add(BathroomBlocks.MIXED_SLIPTILES);
				entries.add(BathroomBlocks.SLIPBRICKS);
				entries.add(BathroomBlocks.DARK_SLIPBRICKS);
				entries.add(BathroomBlocks.MIXED_BRICKS);
				entries.add(BathroomBlocks.MIXED_BRICKS_SLAB);
				entries.add(BathroomBlocks.INSULATION);
				entries.add(BathroomBlocks.INKY_COBBLESTONE);
				entries.add(BathroomBlocks.INKY_COBBLESTONE_SLAB);
				entries.add(BathroomBlocks.INKY_MOSS_STONE);
				entries.add(BathroomBlocks.YOPORE);
				entries.add(BathroomItems.YOPER);
				entries.add(BathroomItems.BOUNCY_BALL);
				entries.add(BathroomItems.GUMMIES);
				entries.add(BathroomItems.WORMS_IN_DIRT);
				entries.add(BathroomItems.BATHROOM_CRITTER);
				entries.add(BathroomItems.SPLENDOR_CRITTER);
				entries.add(BathroomItems.PIG_CREEPER_SPAWN_EGG);
			})
			.build();

	public static void registerItemGroup() {
		Registry.register(Registries.ITEM_GROUP, new Identifier("bathroom", "bathroom_group"), ITEM_GROUP);
	}
}
