
package net.mcreator.boncau.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.boncau.block.DiariteBlockBlock;
import net.mcreator.boncau.Boncau2ModElements;

@Boncau2ModElements.ModElement.Tag
public class DiariteModItemGroup extends Boncau2ModElements.ModElement {
	public DiariteModItemGroup(Boncau2ModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdiarite_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DiariteBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
