require u-boot-socfpga-common.inc
require u-boot-socfpga-env.inc
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS =. "${THISDIR}/files/v2017.09:"

SRCREV = "d2f9c979e72c57d566fc0f3553099ad9b9962b72"

SRC_URI_append = "\
	file://cyclone5-socdk.env \
	"

DEPENDS += "dtc-native bc-native u-boot-mkimage-native"
