
package net.mcreator.boncau.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.boncau.itemgroup.DiariteModItemGroup;
import net.mcreator.boncau.Boncau2ModElements;

import java.util.List;
import java.util.Collections;

@Boncau2ModElements.ModElement.Tag
public class ZayyahhtheendblockBlock extends Boncau2ModElements.ModElement {
	@ObjectHolder("boncau2:zayyahhtheendblock")
	public static final Block block = null;

	public ZayyahhtheendblockBlock(Boncau2ModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(DiariteModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.GROUND).hardnessAndResistance(1000f, 1000f).setLightLevel(s -> 0));
			setRegistryName("zayyahhtheendblock");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(ZayyAhhBlock.block));
		}
	}
}
