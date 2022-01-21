
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

import net.mcreator.projectmodmaking.world.inventory.BookofBeastsGUI3Menu;
import net.mcreator.projectmodmaking.network.BookofBeastsGUI3ButtonMessage;
import net.mcreator.projectmodmaking.ProjectmodmakingMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BookofBeastsGUI3Screen extends AbstractContainerScreen<BookofBeastsGUI3Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BookofBeastsGUI3Screen(BookofBeastsGUI3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 259;
	}

	private static final ResourceLocation texture = new ResourceLocation("projectmodmaking:textures/bookof_beasts_gui_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/embersnail.png"));
		this.blit(ms, this.leftPos + 125, this.topPos + 4, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/leaf_1.png"));
		this.blit(ms, this.leftPos + 259, this.topPos + 14, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/leaf_2.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 13, 0, 0, 128, 128, 128, 128);

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
		this.font.draw(poseStack, "[Ember Snails]", 158, 15, -16777216);
		this.font.draw(poseStack, "Ember snails are tempered creatures. ", 95, 109, -16777216);
		this.font.draw(poseStack, "Although they may look small and adorable, ", 81, 121, -16777216);
		this.font.draw(poseStack, "they can pack a nasty punch on their opponents.", 72, 133, -16777216);
		this.font.draw(poseStack, "For centuries scientists have tried to tame these scorching creatures,", 14, 144, -16777216);
		this.font.draw(poseStack, "although no progress has been made. This is the only snail within the", 14, 155, -16777216);
		this.font.draw(poseStack, "four elemental snails that cannot be tamed.", 77, 168, -16186107);
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
		this.addRenderableWidget(new Button(this.leftPos + 209, this.topPos + 199, 72, 20, new TextComponent("Next Page"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 108, this.topPos + 199, 93, 20, new TextComponent("Previous Page"), e -> {
			if (true) {
				ProjectmodmakingMod.PACKET_HANDLER.sendToServer(new BookofBeastsGUI3ButtonMessage(1, x, y, z));
				BookofBeastsGUI3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
