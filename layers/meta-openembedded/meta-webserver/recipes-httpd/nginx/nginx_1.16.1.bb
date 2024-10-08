require nginx.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=52e384aaac868b755b93ad5535e2d075"

SRC_URI[md5sum] = "45a80f75336c980d240987badc3dcf60"
SRC_URI[sha256sum] = "f11c2a6dd1d3515736f0324857957db2de98be862461b5a542a3ac6188dbe32b"

SRC_URI += "file://CVE-2019-20372.patch \
            file://CVE-2022-41741-CVE-2022-41742.patch \
            file://0001-HTTP-2-per-iteration-stream-handling-limit.patch \
           "
