package com.wolfyscript.utilities.spigot.adapters;

import com.wolfyscript.utilities.common.adapters.Location;

public class LocationImpl extends BukkitRefAdapter<org.bukkit.Location> implements Location {

    public LocationImpl(org.bukkit.Location bukkitRef) {
        super(bukkitRef);
    }


}
