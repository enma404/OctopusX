# OctopusX — StrykerOSS Runtime

OctopusX keeps its own application UI, branding, package name and features, while the rootless runtime is aligned with the StrykerOSS runtime artifacts.

## Runtime sources

- `rootless-main`: QEMU, libslirp and the main rootless kernel/initrd/rootfs set.
- `rootless-650`: kernel, initrd and rootfs for the newer rootless-v2 path.
- `rootless-650` is selected automatically for OctopusX builds with `versionCode >= 650` when the v2 manifest is available.
- SHA-256 values remain those published by the StrykerOSS manifest.

The application itself still uses the OctopusX manifest/app-update identity; only the runtime/chroot artifact sources are redirected to StrykerOSS.
