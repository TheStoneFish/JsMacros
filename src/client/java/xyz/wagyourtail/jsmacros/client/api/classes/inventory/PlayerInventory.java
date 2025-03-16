package xyz.wagyourtail.jsmacros.client.api.classes.inventory;

import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.screen.PlayerScreenHandler;
import xyz.wagyourtail.jsmacros.client.api.helper.inventory.ItemStackHelper;

/**
 * @author Etheradon
 * @since 1.8.4
 */
public class PlayerInventory extends RecipeInventory<InventoryScreen> {

    protected PlayerInventory(InventoryScreen inventory) {
        super(inventory);
    }

    @Override
    public ItemStackHelper getOutput() {
        return new ItemStackHelper(inventory.getScreenHandler().getOutputSlot().getStack());
    }

    /**
     * @param x the x position of the input from 0 to 1, going left to right
     * @param y the y position of the input from 0 to 1, going top to bottom
     * @return the input item at the given position of the crafting grid.
     * @since 1.8.4
     */
    public ItemStackHelper getInput(int x, int y) {
        return getSlot(x + y * 2 + 1);
    }

    @Override
    public int getCraftingWidth() {
        return 0;
    }

    @Override
    public int getCraftingHeight() {
        return 0;
    }

    @Override
    public int getCraftingSlotCount() {
        return 0;
    }

    /**
     * @param slot the slot to check
     * @return {@code true} if the slot is in the hotbar or the offhand slot, {@code false}
     * otherwise.
     * @since 1.8.4
     */
    public boolean isInHotbar(int slot) {
        return PlayerScreenHandler.isInHotbar(slot);
    }

    /**
     * @return the item in the offhand.
     * @since 1.8.4
     */
    public ItemStackHelper getOffhand() {
        return getSlot(45);
    }

    /**
     * @return the equipped helmet item.
     * @since 1.8.4
     */
    public ItemStackHelper getHelmet() {
        return getSlot(5);
    }

    /**
     * @return the equipped chestplate item.
     * @since 1.8.4
     */
    public ItemStackHelper getChestplate() {
        return getSlot(6);
    }

    /**
     * @return the equipped leggings item.
     * @since 1.8.4
     */
    public ItemStackHelper getLeggings() {
        return getSlot(7);
    }

    /**
     * @return the equipped boots item.
     * @since 1.8.4
     */
    public ItemStackHelper getBoots() {
        return getSlot(8);
    }

    @Override
    public String toString() {
        return String.format("PlayerInventory:{}");
    }

}
