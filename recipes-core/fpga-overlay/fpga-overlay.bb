DESCRIPTION = "Intel FPGA Linux device tree overlay application on boot"
AUTHOR = "Tien Hock Loh <thloh@altera.com>"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "dtbt"

inherit allarch systemd

SRC_URI = "file://fpga-overlay.sh \
           file://fpga-overlay.service \
          "

do_compile() {
        :
}


do_install () {
        install -d ${D}${systemd_unitdir}/system
        install -d ${D}/${bindir}/

        install -m 0744 ${WORKDIR}/fpga-overlay.service ${D}${systemd_unitdir}/system/
        install -m 0744 ${WORKDIR}/fpga-overlay.sh ${D}/${bindir}/
}

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "fpga-overlay.service"

FILES_${PN} += "${base_libdir}/systemd"

