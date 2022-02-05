
package net.mcreator.boncau.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.boncau.itemgroup.DiariteModItemGroup;
import net.mcreator.boncau.Boncau2ModElements;

@Boncau2ModElements.ModElement.Tag
public class YoheehayItem extends Boncau2ModElements.ModElement {
	@ObjectHolder("boncau2:yoheehay")
	public static final Item block = null;

	public YoheehayItem(Boncau2ModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, Boncau2ModElements.sounds.get(new ResourceLocation("boncau2:yoheehey")),
					new Item.Properties().group(DiariteModItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("yoheehay");
		}
	}
}
