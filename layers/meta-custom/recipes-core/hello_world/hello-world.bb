DESCRIPTION = "HelloWorld"
SECTION = "examples"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/matthewuhthoff/hello-world;protocol=https;branch=main"

SRCREV = "${AUTOREV}"
SRC_URI[sha256sum] = "0c955cf871bf02956826638230bae5fd54e6c63490c55cb9487633d1c8a10793"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

