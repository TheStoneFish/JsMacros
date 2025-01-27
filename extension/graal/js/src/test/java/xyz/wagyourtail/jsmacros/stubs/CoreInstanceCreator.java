package xyz.wagyourtail.jsmacros.stubs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.wagyourtail.jsmacros.core.Core;

import java.io.File;

public class CoreInstanceCreator {
    private static final Logger LOGGER = LoggerFactory.getLogger("JsMacros");
    private static final File configFolder = new File("run/config");
    private static final File macroFolder = new File(configFolder, "macro");

    public static Core<ProfileStub, EventRegistryStub> core;

    public static Core<ProfileStub, EventRegistryStub> createCore() {
        if (core == null) {
            core = new Core<>(
                    EventRegistryStub::new,
                    ProfileStub::new,
                    configFolder,
                    macroFolder,
                    LOGGER
            );
        }
        return core;
    }

}
