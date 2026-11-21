package net.bobert.transmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EstrogenMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(5);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1);
	}
}