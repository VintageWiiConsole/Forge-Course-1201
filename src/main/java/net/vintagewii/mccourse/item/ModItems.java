package net.vintagewii.mccourse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vintagewii.mccourse.MCCourseMod;
import net.vintagewii.mccourse.item.custom.FuelItem;
import net.vintagewii.mccourse.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

//Start of items list
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
    public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            () -> new FuelItem(new Item.Properties(), 200));


//end of items list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
