
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectmodmaking.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.projectmodmaking.client.gui.BookofBeastsGUIScreen;
import net.mcreator.projectmodmaking.client.gui.BookofBeastsGUI3Screen;
import net.mcreator.projectmodmaking.client.gui.BookofBeastsGUI2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectmodmakingModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ProjectmodmakingModMenus.BOOKOF_BEASTS_GUI, BookofBeastsGUIScreen::new);
			MenuScreens.register(ProjectmodmakingModMenus.BOOKOF_BEASTS_GUI_2, BookofBeastsGUI2Screen::new);
			MenuScreens.register(ProjectmodmakingModMenus.BOOKOF_BEASTS_GUI_3, BookofBeastsGUI3Screen::new);
		});
	}
}
