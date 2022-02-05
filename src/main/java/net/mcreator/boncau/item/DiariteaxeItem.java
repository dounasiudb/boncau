
package net.mcreator.boncau.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.boncau.itemgroup.DiariteModItemGroup;
import net.mcreator.boncau.Boncau2ModElements;

@Boncau2ModElements.ModElement.Tag
public class DiariteaxeItem extends Boncau2ModElements.ModElement {
	@ObjectHolder("boncau2:diariteaxe")
	public static final Item block = null;

	public DiariteaxeItem(Boncau2ModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1569;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8.69f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 0f, new Item.Properties().group(DiariteModItemGroup.tab)) {
		}.setRegistryName("diariteaxe"));
	}
}
