DESCRIPTION = "phone-utils library"
SECTION = "libs"
SRCREV = "d3f510d75f76d6d03c53b3376ce1aba1c88062e7"
PV = "0.0.2+gitr${SRCPV}"
PR = "r2"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b52f2d57d10c4f7ee67a7eb9615d5d24"

DEPENDS="glib-2.0"

inherit pkgconfig autotools autotools

CONFFILES_${PN} = "${sysconfdir}/phone-utils.conf"
SRC_URI = "git://git.shr-project.org/repo/libphone-utils.git;protocol=http;branch=master"
S="${WORKDIR}/git"

PACKAGES =+ " ${PN}-test"
FILES_${PN}-test = "${bindir}/phoneutils_test"