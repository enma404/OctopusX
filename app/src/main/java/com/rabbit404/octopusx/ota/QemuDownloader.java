package com.rabbit404.octopusx.ota;

import android.content.Context;

import com.rabbit404.octopusx.BuildConfig;

public final class QemuDownloader {

    private QemuDownloader() {}

    public static final class Bundle {
        public final RemoteManifest.Asset qemu;
        public final RemoteManifest.Asset kernel;
        public final RemoteManifest.Asset initrd;
        public final RemoteManifest.Asset libslirp;
        public final RemoteManifest.Asset rootfs;

        Bundle(RemoteManifest.Asset qemu, RemoteManifest.Asset kernel, RemoteManifest.Asset initrd,
               RemoteManifest.Asset libslirp, RemoteManifest.Asset rootfs) {
            this.qemu = qemu;
            this.kernel = kernel;
            this.initrd = initrd;
            this.libslirp = libslirp;
            this.rootfs = rootfs;
        }
    }

    public static Bundle resolve(Context context) {
        RemoteManifest manifest = ManifestService.fetch(context);
        if (manifest != null && BuildConfig.VERSION_CODE >= 650
                && manifest.rootlessV2 != null && manifest.rootlessV2.isComplete()) {
            RemoteManifest.RootlessAssets r = manifest.rootlessV2;
            return new Bundle(r.qemu, r.kernel, r.initrd, r.libslirp, r.rootfs);
        }
        if (manifest != null && manifest.rootless != null && manifest.rootless.isComplete()) {
            RemoteManifest.RootlessAssets r = manifest.rootless;
            return new Bundle(r.qemu, r.kernel, r.initrd, r.libslirp, r.rootfs);
        }
        if (BuildConfig.VERSION_CODE >= 650) {
            return new Bundle(
                    new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_V2_QEMU, "", 0),
                    new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_V2_KERNEL, "", 0),
                    new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_V2_INITRD, "", 0),
                    new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_V2_LIBSLIRP, "", 0),
                    new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_V2_ROOTFS, "", 0));
        }
        return new Bundle(
                new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_QEMU, "", 0),
                new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_KERNEL, "", 0),
                new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_INITRD, "", 0),
                new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_LIBSLIRP, "", 0),
                new RemoteManifest.Asset(OctopusXEndpoints.FALLBACK_ROOTLESS_ROOTFS, "", 0));
    }
}
