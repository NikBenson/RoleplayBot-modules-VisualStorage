package com.github.nikbenson.roleplaybot.modules.visualstorage;

import com.github.nikbenson.roleplaybot.modules.ModulesManager;
import com.github.nikbenson.roleplaybot.modules.RoleplayBotModule;
import net.dv8tion.jda.api.entities.Guild;

public class VisualStorageModule implements RoleplayBotModule {
	StorageModule module = (StorageModule) ModulesManager.require("com.github.nikbenson.roleplaybot.modules.storage.StorageModule");


	@Override
	public boolean isActive(Guild guild) {
		return false;
	}

	@Override
	public void load(Guild guild) {

	}

	@Override
	public void unload(Guild guild) {

	}

	@Override
	public Guild[] getLoaded() {
		return new Guild[0];
	}
}
