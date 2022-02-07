package net.mcreator.boncau.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.boncau.enchantment.PowerOfDiariteEnchantment;
import net.mcreator.boncau.Boncau2Mod;

import java.util.Map;

public class DiariteswordLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Boncau2Mod.LOGGER.warn("Failed to load dependency entity for procedure DiariteswordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				Boncau2Mod.LOGGER.warn("Failed to load dependency itemstack for procedure DiariteswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (EnchantmentHelper.getEnchantmentLevel(PowerOfDiariteEnchantment.enchantment, itemstack) == 1) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 3, (int) 2, (false), (false)));
		} else if (EnchantmentHelper.getEnchantmentLevel(PowerOfDiariteEnchantment.enchantment, itemstack) == 0) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 5, (int) 5, (false), (false)));
		}
	}
}
