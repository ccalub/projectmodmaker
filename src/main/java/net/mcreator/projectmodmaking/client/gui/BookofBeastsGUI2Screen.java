
package net.mcreator.projectmodmaking.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.projectmodmaking.world.inventory.BookofBeastsGUI2Menu;
import net.mcreator.projectmodmaking.network.BookofBeastsGUI2ButtonMessage;
import net.mcreator.projectmodmaking.ProjectmodmakingMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BookofBeastsGUI2Screen extends AbstractContainerScreen<BookofBeastsGUI2Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BookofBeastsGUI2Screen(BookofBeastsGUI2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 259;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("projectmodmaking:textures/bookof_beasts_gui_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/output-onlinepngtools_81.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + -16, 0, 0, 648, 339, 648, 339);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/output-onlinepngtools.png"));
		this.blit(ms, this.leftPos + -50, this.topPos + 101, 0, 0, 800, 418, 800, 418);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "[Terra Owls]", 45, 14, -16777216);
		this.font.draw(poseStack, "The Terra Owl can be tamed ", 18, 97, -16777216);
		this.font.draw(poseStack, "by being fed a Nightcrawler.", 18, 112, -16777216);
		this.font.draw(poseStack, "Nightcrawlers can be found", 19, 128, -16777216);
		this.font.draw(poseStack, "when digging up large patches of dirt.", 15, 142, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 34, this.topPos + 208, 93, 20, new TextComponent("Previous Page"), e -> {
			if (true) {
				ProjectmodmakingMod.PACKET_HANDLER.sendToServer(new BookofBeastsGUI2ButtonMessage(0, x, y, z));
				BookofBeastsGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
