
package net.mcreator.boncau.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.boncau.itemgroup.DiariteModItemGroup;
import net.mcreator.boncau.Boncau2ModElements;

@Boncau2ModElements.ModElement.Tag
public class DiaritePcckaxeItem extends Boncau2ModElements.ModElement {
	@ObjectHolder("boncau2:diarite_pcckaxe")
	public static final Item block = null;

	public DiaritePcckaxeItem(Boncau2ModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1569;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4.9f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(DiariteModItemGroup.tab)) {
		}.setRegistryName("diarite_pcckaxe"));
	}
}
