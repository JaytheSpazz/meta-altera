LINUX_VERSION = "4.14.130"
LINUX_VERSION_SUFFIX = "-ltsi"

SRCREV = "7392bc2dd76443c3f7750c90726f041da33099ed"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_cyclone5 = " file://lbdaf.scc "
SRC_URI_append_arria5 = " file://lbdaf.scc "
SRC_URI_append_arria10 = " file://lbdaf.scc "

