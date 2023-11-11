# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6cf92189f73ada9a689def9afe6caa9e"

SRC_URI = "git://github.com/jesper-raemaekers/veab-tools.git;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c11138ef388c53d791ef927d9f6347cc68031a31"

S = "${WORKDIR}/git"

inherit pkgconfig 
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

PROVIDES = "veab-tools"

