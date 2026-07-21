[![Documentation](https://img.shields.io/badge/docs-online-blue)](https://freireg.github.io/)

meta-torizon-bsp
================
`meta-torizon-bsp` is the **BSP-adaptation layer** for Torizon OS. It holds
everything that adapts a *vendor* BSP (Toradex's or a third party's) so it can
boot and run Torizon OS: machine tuning, bootloader/kernel integration,
per-vendor `bbappend`s, wic layouts, and the `setup-environment` build scripts.

It depends on the distro layer
[`meta-torizon`](https://github.com/torizon/meta-torizon), which defines what
Torizon OS *is*. Both layers together replace the former single
`meta-toradex-torizon` layer.

Documentation
=============
All build guides — including the per-vendor Common Torizon OS instructions — and
project documentation are unified on the Torizon OS docs site:

### 📖 https://freireg.github.io/

The per-vendor guides themselves live in this repository under
[`docs/`](./docs) (they are the canonical source that the docs site pulls in).

License
=======
All metadata is MIT licensed unless otherwise stated. Source code and
binaries included in tree for individual recipes is under the LICENSE
stated in each recipe (.bb file) unless otherwise stated.

This README document is Copyright (C) 2019-2025 Toradex AG.
