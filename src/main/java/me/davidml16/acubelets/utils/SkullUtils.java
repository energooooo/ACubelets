package me.davidml16.acubelets.utils;

import com.cryptomorin.xseries.profiles.builder.XSkull;
import com.cryptomorin.xseries.profiles.objects.ProfileInputType;
import com.cryptomorin.xseries.profiles.objects.Profileable;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

/**
 * @author Florian Ohldag (Fedox)
 * @version 1.0
 * @since 6/23/2025, 8:48 AM
 */
@UtilityClass
public class SkullUtils {

	public ItemStack itemFromBase64(String base64) {
		return XSkull.createItem().profile(new Profileable.StringProfileable(base64, ProfileInputType.BASE64)).apply();
	}

	public ItemStack itemFromUUID(UUID uuid) {
		return XSkull.createItem().profile(new Profileable.UUIDProfileable(uuid)).apply();
	}

	public ItemStack itemFromName(String name) {
		return XSkull.createItem().profile(new Profileable.UsernameProfileable(name)).apply();
	}

}
