
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

import net.mcreator.projectmodmaking.world.inventory.BookofBeastsGUIMenu;
import net.mcreator.projectmodmaking.network.BookofBeastsGUIButtonMessage;
import net.mcreator.projectmodmaking.ProjectmodmakingMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BookofBeastsGUIScreen extends AbstractContainerScreen<BookofBeastsGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BookofBeastsGUIScreen(BookofBeastsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 250;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("projectmodmaking:textures/bookof_beasts_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/tree.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 28, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "The Book of Beasts", 49, 10, -16777216);
		this.font.draw(poseStack, "Within the contents of this ", 30, 63, -16777216);
		this.font.draw(poseStack, " scripture you will learn about ", 15, 75, -16777216);
		this.font.draw(poseStack, " the many beasts of the world", 20, 87, -16777216);
		this.font.draw(poseStack, " and how to tame them.", 41, 98, -16777216);
		this.font.draw(poseStack, "Behaviors of these beasts ", 39, 139, -16777216);
		this.font.draw(poseStack, "~", 93, 119, -16777216);
		this.font.draw(poseStack, " are unpredictable,", 49, 152, -16777216);
		this.font.draw(poseStack, " and we are not responsible for any", 7, 166, -16777216);
		this.font.draw(poseStack, "incidents reguarding beasts.", 27, 181, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 208, 72, 20, new TextComponent("Next Page"), e -> {
			if (true) {
				ProjectmodmakingMod.PACKET_HANDLER.sendToServer(new BookofBeastsGUIButtonMessage(0, x, y, z));
				BookofBeastsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
