package de.melanx.extradisks.items.fluid;

import de.melanx.extradisks.items.Registration;
import net.minecraft.world.item.Item;

public class ExtraFluidStoragePartItem extends Item {

    public ExtraFluidStoragePartItem() {
        super(new Properties());
    }

    public static ExtraFluidStoragePartItem getByType(ExtraFluidStorageType type) {
        return Registration.FLUID_STORAGE_PART.get(type).get();
    }
}
