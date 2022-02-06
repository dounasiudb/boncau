
package net.mcreator.boncau.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZayyAhhPotionPotion {
	@ObjectHolder("boncau2:zayy_ahh_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.STRENGTH, 60, 2, false, false), new EffectInstance(Effects.JUMP_BOOST, 60, 4, false, true),
					new EffectInstance(Effects.SPEED, 60, 3, false, true), new EffectInstance(Effects.REGENERATION, 60, 3, false, true),
					new EffectInstance(Effects.SLOW_FALLING, 60, 2, false, true));
			setRegistryName("zayy_ahh_potion");
		}
	}
}
