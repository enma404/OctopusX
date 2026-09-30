package com.rabbit404.octopusx.ota;

public final class OctopusXEndpoints {

    public static final String GITHUB_REPO = "https://github.com/rabbit404/OctopusX";

    public static final String MANIFEST_URL =
            "https://raw.githubusercontent.com/rabbit404/OctopusX/main/octopusx_manifest.json";

    public static final String FALLBACK_CHROOT_64 =
            "https://github.com/zalexdev/strykerapp/releases/download/chroot-main/chroot64-debian.tar.gz";

    private static final String ROOTLESS_BASE =
            "https://github.com/zalexdev/strykerapp/releases/download/rootless-main/";
    public static final String FALLBACK_ROOTLESS_QEMU     = ROOTLESS_BASE + "qemu-system-aarch64";
    public static final String FALLBACK_ROOTLESS_KERNEL   = ROOTLESS_BASE + "Image";
    public static final String FALLBACK_ROOTLESS_LIBSLIRP = ROOTLESS_BASE + "libslirp.so";
    public static final String FALLBACK_ROOTLESS_INITRD   = ROOTLESS_BASE + "initrd.img";
    public static final String FALLBACK_ROOTLESS_ROOTFS   = ROOTLESS_BASE + "rootfs.imgz";

    // StrykerOSS rootless-650 bundle: QEMU/libslirp remain on rootless-main;
    // kernel/initrd/rootfs come from rootless-650.
    private static final String ROOTLESS_V2_BASE =
            "https://github.com/zalexdev/strykerapp/releases/download/rootless-650/";
    public static final String FALLBACK_ROOTLESS_V2_QEMU = FALLBACK_ROOTLESS_QEMU;
    public static final String FALLBACK_ROOTLESS_V2_LIBSLIRP = FALLBACK_ROOTLESS_LIBSLIRP;
    public static final String FALLBACK_ROOTLESS_V2_KERNEL = ROOTLESS_V2_BASE + "Image";
    public static final String FALLBACK_ROOTLESS_V2_INITRD = ROOTLESS_V2_BASE + "initrd.img";
    public static final String FALLBACK_ROOTLESS_V2_ROOTFS = ROOTLESS_V2_BASE + "rootfs.imgz";

    public static final String PREFS = "octopusx_ota";

    private OctopusXEndpoints() {
    }
}
