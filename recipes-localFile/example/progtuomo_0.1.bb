SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

S = "${WORKDIR}"

FILES_${PN} += "/home/*"

FILESEXTRAPATHS_prepend := "/home/tuomo/git/res:"

SRC_URI += " \ 
            file://Makefile \
            file://source.cpp \
            "

do_install() {
    install -d ${D}/usr/bin/
    install -m 0777 ${S}/progtuomo ${D}/usr/bin/progtuomo
}