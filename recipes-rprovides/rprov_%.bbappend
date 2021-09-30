RPROVIDES_${PN} = "fileTXT"

FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI += " file://filenamePatch.patch "

mypostfunc() {
    echo "asd" > ${S}/file2.txt
}

do_unpack[postfuncs] += "mypostfunc"

do_configure_append(){
 import os
}

do_install_append(){
    install -m 0777 ${S}/file2.txt ${D}/usr/bin/file2.txt
}