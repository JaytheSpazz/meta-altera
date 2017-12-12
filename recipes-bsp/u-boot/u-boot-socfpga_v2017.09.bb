require u-boot-socfpga-common.inc
require u-boot-socfpga-env.inc
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS =. "${THISDIR}/files/v2017.09:"

SRCREV = "17db5346b50262fb7f5aadc92de92c6a43d30226"
SRC_URI = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2017.09;prot=https"

SRC_URI_append = "\
	file://cyclone5-socdk.env \
	"

DEPENDS += "dtc-native bc-native u-boot-mkimage-native"
