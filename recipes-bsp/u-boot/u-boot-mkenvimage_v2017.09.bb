SUMMARY = "U-Boot bootloader environment image creation tool"                               

HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"                             
SECTION = "bootloaders"                                                         
                                                                                
LICENSE = "GPLv2+"                                                              
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
                                                                                
PV_append = "+git${SRCPV}"                                                      
                                                                                
SRC_URI = "git://git.denx.de/u-boot.git;branch=master"
SRC_URI += "file://0001-Fix-native-build-by-using-env-variables.patch"
                                                                                
S = "${WORKDIR}/git" 

# This revision corresponds to the tag "v2017.09"                               
# We use the revision in order to avoid having to fetch it from the             
# repo during parse                                                             
SRCREV = "c98ac3487e413c71e5d36322ef3324b21c6f60f9"

EXTRA_OEMAKE = 'CROSS_COMPILE="${TARGET_PREFIX}" CC="${CC} ${CFLAGS} ${LDFLAGS}" STRIP=true V=1'

do_compile () {                                                                 
        oe_runmake sandbox_defconfig                                            
        oe_runmake cross_tools NO_SDL=1                                         
} 

do_install () {                                                                 
        install -d ${D}${bindir}                                                
        install -m 0755 tools/mkenvimage ${D}${bindir}/uboot-mkenvimage               
        ln -sf uboot-mkenvimage ${D}${bindir}/mkenvimage                              
} 

BBCLASSEXTEND = "native nativesdk"
