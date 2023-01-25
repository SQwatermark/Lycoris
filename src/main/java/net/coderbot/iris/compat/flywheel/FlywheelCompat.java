package net.coderbot.iris.compat.flywheel;

import com.jozufozu.flywheel.config.BackendType;
import com.jozufozu.flywheel.config.FlwConfig;

public class FlywheelCompat {

    public static void disableBackend() {
        FlwConfig.get().client.backend.set(BackendType.OFF);
    }

}
