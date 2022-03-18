/*
 *       WolfyUtilities, APIs and Utilities for Minecraft Spigot plugins
 *                      Copyright (C) 2021  WolfyScript
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.wolfyscript.utilities.util.json.jackson.serialization;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.module.SimpleModule;
import me.wolfyscript.utilities.util.json.jackson.JacksonUtil;
import org.bukkit.potion.PotionEffectType;

public class PotionEffectTypeSerialization {

    public static void create(SimpleModule module) {
        JacksonUtil.addSerializerAndDeserializer(module, PotionEffectType.class, (potionEffectType, gen, serializerProvider) -> {
            gen.writeString(potionEffectType.getName());
        }, (p, deserializationContext) -> {
            JsonNode node = p.readValueAsTree();
            return PotionEffectType.getByName(node.asText());
        });
    }

}
