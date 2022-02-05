
package net.mcreator.boncau.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.boncau.itemgroup.DiariteModItemGroup;
import net.mcreator.boncau.Boncau2ModElements;

import java.util.List;
import java.util.Collections;

@Boncau2ModElements.ModElement.Tag
public class ZayyAhhBlock extends Boncau2ModElements.ModElement {
	@ObjectHolder("boncau2:zayy_ahh")
	public static final Block block = null;

	public ZayyAhhBlock(Boncau2ModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(DiariteModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(new ForgeSoundType(1.0f, 1.0f,
					() -> new SoundEvent(new ResourceLocation("boncau2:yoheehey")), () -> new SoundEvent(new ResourceLocation("boncau2:yoheehey")),
					() -> new SoundEvent(new ResourceLocation("boncau2:yoheehey")), () -> new SoundEvent(new ResourceLocation("boncau2:yoheehey")),
					() -> new SoundEvent(new ResourceLocation("boncau2:yoheehey")))).hardnessAndResistance(69f, 500f).setLightLevel(s -> 0));
			setRegistryName("zayy_ahh");
		}

		@Override
		public float[] getBeaconColorMultiplier(BlockState state, IWorldReader world, BlockPos pos, BlockPos beaconPos) {
			return new float[]{0.2f, 0.2f, 0f};
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
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
