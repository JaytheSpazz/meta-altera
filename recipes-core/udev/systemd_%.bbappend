# Post process the systemd udev rules in /lib/udev/rules.d/99-systemd.rules
pkg_postinst_${PN}() {

sed -i '/ACTION=="add"/a \\nSUBSYSTEM=="tty", KERNEL=="ttyS0", TAG+="systemd"' $D/lib/udev/rules.d/99-systemd.rules

}
