LINUX_VERSION = "4.14.126"
LINUX_VERSION_SUFFIX = "-ltsi-rt"

SRCREV = "6cecf60f97fd892516c1fb54a5e8f986cd03fff3"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

#DE0 dts name changed in later kernels
KERNEL_DEVICETREE_remove_cyclone5 = "socfpga_cyclone5_de0_nano_soc.dtb"
KERNEL_DEVICETREE_append_cyclone5 = "socfpga_cyclone5_de0_sockit.dtb"

SRC_URI_append_cyclone5 = " file://config_lbdaf.cfg "
SRC_URI_append_arria5 = " file://config_lbdaf.cfg "
SRC_URI_append_arria10 = " file://config_lbdaf.cfg "

