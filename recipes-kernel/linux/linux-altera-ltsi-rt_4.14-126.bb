LINUX_VERSION = "4.14.126"
LINUX_VERSION_SUFFIX = "-ltsi-rt"

SRCREV = "66d5f5464c89235fb34e3bcd8a1e3756fdb22359"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_cyclone5 = " file://lbdaf.scc "
SRC_URI_append_arria5 = " file://lbdaf.scc "
SRC_URI_append_arria10 = " file://lbdaf.scc "

