SUMMARY = "RTL88x2BU kernel driver (wifi) for 4.16 and before in 4.x series"
DESCRIPTION = "RTL88x2BU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
	git://github.com/cilynx/rtl88x2BU_WiFi_linux_v5.2.4.4_26334.20180126_COEX20171012-5044.git;protocol=https \
	file://00001-makefile.patch \
	"

SRCREV = "2d26e77fcf8942034d0f23db627e7e870f93ecb0"

S = "${WORKDIR}/git"

MODVER = "5.2.4.4"

MODULE_NAME = "88x2bu.ko"

require realtek.inc

inherit module


