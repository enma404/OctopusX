# OctopusX

OctopusX is an Android security-testing workspace derived from the upstream StrykerOSS codebase and rebranded as an independent project. It combines a terminal, a rooted-engine path and a rootless ARM64 QEMU engine in one application.

> **Use only on devices, networks and applications that you own or are explicitly authorized to test.**

## Identity

- **App:** OctopusX
- **Package:** `com.rabbit404.octopusx`
- **Terminal prompt:**
  ```text
  ┌──(Octopus㉿X)-[~]
  └─$
  ```
- **Repository:** `https://github.com/rabbit404/OctopusX`
- **License:** GNU GPL v3.0, plus the licenses listed in `THIRD-PARTY-NOTICES.md`

## What changed in this fork

- New OctopusX name and Android application ID.
- New octopus icon and red/black visual identity.
- Octopus-themed application and terminal background artwork.
- Red terminal prompt and refreshed terminal branding.
- New About/Credits and project links.
- Main application Java package migrated to `com.rabbit404.octopusx`.
- OTA/update endpoints moved to the OctopusX repository configuration.
- OnlineHashCrack upload integration removed from the Handshakes UI and code path.
- Cleartext Android traffic disabled at the application level.
- Root engine retained for rooted devices.
- Rootless ARM64 QEMU engine retained for supported non-root devices.
- Tool manager and existing security-tool integrations retained.

## Engines

### Root engine

The traditional Android/root path remains available for operations that require elevated device privileges.

### Rootless engine

On supported ARM64 devices without root, OctopusX can use its QEMU-based Linux environment. Rootless mode is still subject to Android, kernel, USB and networking limitations.

## Tooling

The inherited toolset includes components such as Nmap, Nuclei, Metasploit, Hydra, SearchSploit and network-discovery utilities. Availability depends on the selected engine and device capabilities.

## Privacy changes

OctopusX does not include the upstream OnlineHashCrack handshake-upload action. Captured files remain local unless the user explicitly uses an available sharing/export feature.

The Android manifest also disables cleartext network traffic. HTTPS should be used for update and download endpoints.

## Building

Requirements depend on the upstream modules and native build components. A typical local build is:

```bash
./gradlew assembleDebug
```

For a release build, configure a signing key through the `OCTOPUSX_RELEASE_*` Gradle properties/environment variables and run:

```bash
./gradlew assembleRelease
```

The project currently targets `arm64-v8a` for the bundled rootless engine.

## Release assets and update manifest

`octopusx_manifest.json` is the project manifest used by the update/download layer. Before publishing a release, replace its placeholder application release entry with the real APK URL, SHA-256 and size. The root/rootless asset entries must likewise point to files actually published by the OctopusX release repository.

Do **not** publish an APK with a guessed SHA-256. Generate the checksum from the exact artifact that is uploaded.

## Attribution

OctopusX is a derivative work. The original project and third-party components retain their applicable copyright and license notices. See:

- `LICENSE`
- `THIRD-PARTY-NOTICES.md`

Changes made by this fork should not be interpreted as removing upstream attribution or third-party licensing requirements.

## Security reporting

Do not put sensitive vulnerability details, private keys, credentials or unpublished exploit material into public issues. Use a private security-reporting channel when one is configured for the project.
