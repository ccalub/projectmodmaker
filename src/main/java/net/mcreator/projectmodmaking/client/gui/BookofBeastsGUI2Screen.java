
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/untitled_01-20-2022_04-57-16_1.png"));
		this.blit(ms, this.leftPos + 132, this.topPos + 66, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/output-onlinepngtools.png"));
		this.blit(ms, this.leftPos + 66, this.topPos + 99, 0, 0, 800, 418, 800, 418);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/leaf_2.png"));
		this.blit(ms, this.leftPos + 17, this.topPos + 99, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("projectmodmaking:textures/leaf_1.png"));
		this.blit(ms, this.leftPos + 254, this.topPos + 97, 0, 0, 128, 128, 128, 128);

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
		this.font.draw(poseStack, "[Terra Owls]", 159, 15, -16777216);
		this.font.draw(poseStack, "Terra Owls are passive creatures that can be easily be found in any ", 15, 30, -16777216);
		this.font.draw(poseStack, " overworld forest biome.", 10, 43, -16777216);
		this.font.draw(poseStack, "They are nimble creatures that are able to fly ", 135, 43, -16777216);
		this.font.draw(poseStack, "without taking any fall damage when they land or fall.", 18, 56, -16777216);
		this.font.draw(poseStack, "Terra Owls can ", 301, 56, -16777216);
		this.font.draw(poseStack, "be tamed by being fed a \"Nightcrawler\". Nightcrawlers can be ", 36, 68, -16777216);
		this.font.draw(poseStack, "obtained when a player digs up large amounts of dirt within an area.", 23, 81, -16777216);
		this.font.draw(poseStack, "Nightcrawler", 166, 201, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 151, this.topPos + 218, 93, 20, new TextComponent("Previous Page"), e -> {
			if (true) {
				ProjectmodmakingMod.PACKET_HANDLER.sendToServer(new BookofBeastsGUI2ButtonMessage(0, x, y, z));
				BookofBeastsGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
