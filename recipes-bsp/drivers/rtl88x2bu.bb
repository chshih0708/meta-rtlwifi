SUMMARY = "RTL88x2BU kernel driver (wifi) for 4.18+ kernels"
DESCRIPTION = "RTL88x2BU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://include/Hal8188EPhyCfg.h;md5=1592a2c1f478ef1bf7861df1803d1436"

SRC_URI = " \
	git://github.com/cilynx/rtl88x2BU_WiFi_linux_v5.3.1_27678.20180430_COEX20180427-5959.git;protocol=https \
	file://00001-makefile.patch \
	"

SRCREV = "b655ba8114d7def7e6181bfe4635fbb831e2b8d6"

S = "${WORKDIR}/git"

MODVER = "5.3.1"

MODULE_NAME = "88x2bu.ko"

require realtek.inc

inherit module


