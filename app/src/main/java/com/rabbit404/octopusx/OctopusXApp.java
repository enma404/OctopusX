package com.rabbit404.octopusx;

import android.os.Build;

import com.rabbit404.octopusx.logger.LogEntry;
import com.rabbit404.octopusx.logger.LogStore;
import com.rabbit404.octopusx.ota.NotificationCenter;
import com.rabbit404.octopusx.ota.UpdateScheduler;

public class OctopusXApp extends com.stryker.terminal.App {

    @Override
    public void onCreate() {
        super.onCreate();
        LogStore store = LogStore.init(this);
        store.add(LogEntry.INFO, "session", "==== OctopusX " + BuildConfig.VERSION_NAME
                + " session start ====");
        String abi = Build.SUPPORTED_ABIS.length > 0 ? Build.SUPPORTED_ABIS[0] : "unknown";
        store.add(LogEntry.INFO, "session", "Device: " + Build.MANUFACTURER + " " + Build.MODEL
                + " · Android " + Build.VERSION.RELEASE
                + " (" + abi + ")");
        NotificationCenter.ensureChannel(this);
        UpdateScheduler.schedule(this);
    }
}
