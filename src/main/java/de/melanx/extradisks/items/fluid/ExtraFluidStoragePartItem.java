package de.melanx.extradisks.items.fluid;

import de.melanx.extradisks.ExtraDisks;
import de.melanx.extradisks.items.Registration;
import net.minecraft.item.Item;

public class ExtraFluidStoragePartItem extends Item {

    public ExtraFluidStoragePartItem() {
        super(new Properties().group(ExtraDisks.ModGroup));
    }

    public static ExtraFluidStoragePartItem getByType(ExtraFluidStorageType type) {
        return Registration.FLUID_STORAGE_PART.get(type).get();
    }
}
