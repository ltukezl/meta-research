#require recipes-sato/images/core-image-sato.bb change to udoo
#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld i2c"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/ltukezl/yocto-research.git;protocol=https;branch=i2c"
SRC_URI[md5sum] = "82e7585a24ac4cf587b126a20f9f1e4b"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "i2c-tools"