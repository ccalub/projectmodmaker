
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

import net.mcreator.projectmodmaking.world.inventory.BookOfBeastsGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BookOfBeastsGUIScreen extends AbstractContainerScreen<BookOfBeastsGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BookOfBeastsGUIScreen(BookOfBeastsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 250;
	}

	private static final ResourceLocation texture = new ResourceLocation("projectmodmaking:textures/book_of_beasts_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/wolf_pixel_art.png"));
		this.blit(ms, this.leftPos + -22, this.topPos + 165, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/wolf_pixel_art_2.png"));
		this.blit(ms, this.leftPos + 292, this.topPos + 168, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/deeeer.png"));
		this.blit(ms, this.leftPos + 263, this.topPos + 157, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/doe.png"));
		this.blit(ms, this.leftPos + 18, this.topPos + 161, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/crow.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 112, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/crowww.png"));
		this.blit(ms, this.leftPos + 211, this.topPos + 162, 0, 0, 128, 128, 128, 128);

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
		this.font.draw(poseStack, "The Book of Beasts", 148, 11, -16777216);
		this.font.draw(poseStack, "Many creatures inhabit this dangerous world you see around you.", 33, 44, -16777216);
		this.font.draw(poseStack, "Here is a guide to learn more about them.", 90, 83, -16777216);
		this.font.draw(poseStack, "~", 191, 27, -16777216);
		this.font.draw(poseStack, "~", 191, 66, -16777216);
		this.font.draw(poseStack, "Please note as bookwriters we are not responsible for any injury", 33, 103, -16777216);
		this.font.draw(poseStack, "reguarding these beasts.", 128, 118, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 156, this.topPos + 179, 72, 20, new TextComponent("Next Page"), e -> {
		}));
	}
}
